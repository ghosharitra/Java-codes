//SERVER SIDE


import java.io.IOException;                                 //for exception thrown 
import java.util.NoSuchElementException;                    //for exception thrown 

/* for sockect programming */
import java.net.Socket;                                     //for socket object of the server

import java.io.PrintStream;                                 //for using println function to output from server socket
import java.util.Scanner;                                   //for taking input from server's socket input                                    
import java.util.ArrayList;                                 //for storing and accessing a list of ClientHandler threads
import java.util.Date;                                      //to use functionality of date
import java.text.SimpleDateFormat;                          //to format the date


/* the main task is to take input from the client socket and give output to the client socket */
public class ClientHandler extends Thread {
    private Socket socket;                              //create a Socket object reference for server's socket
    private int id;                                     //to store a unique client id 
    private Scanner in = null;                          //to take input from client's socket output as server's socket input 
    private PrintStream output = null;                  //to give output from server's socket as input to client's socket
    private ArrayList<ClientHandler> clientList;        //for storing and accessing a list of ClientHandler threads
    private String userName;                            //to store a unique client username
    private int flag=0;                                 //to check if username is duplicated or not
    private Date date;                                  //to use functionality of date
    private SimpleDateFormat sdf;                       //to format the date
    
    /* ClientHandler constructor used to create a thread that takes socket id and clientlist as paramenters */
    public ClientHandler(Socket socket, int id,ArrayList<ClientHandler> clientList) {
        sdf = new SimpleDateFormat("HH:mm:ss");         //set the format of date to be printed
        this.socket = socket;                           //reference the created server's socket object
        this.id = id;                                   //reference the unique id of the client
        this.clientList=clientList;                     //reference the clientList 
        

        try{        
            in = new Scanner(socket.getInputStream());              //create Scanner object to get input from server's socket input   
            userName=in.nextLine();                                 //take the username of the client from the server's socket input
            output = new PrintStream(socket.getOutputStream());     //create PrintStream object to give output from server's socket output

            int n=clientList.size();                                //stores the clientList size before the current thread is added
            
            /* loop through all the elements of the clientList */
            for(int i=0;i<n;i++){     

                /* 
                 * if the username is used previously by someone then
                 * set flag=1
                 * send  *** this username is already taken *** to client's socket input
                 * print a duplicate user acknowledgement message onto the server console
                 * break out of the loop
                 */
                if(this.userName.equals(clientList.get(i).userName)){
                    
                    output.println("*** this username is already taken ***");
                    date=new Date();
                    System.out.println(sdf.format(date)+" user with duplicate username trying to enter");
                    flag=1;
                    break;
                }
            }
            /*
             *  if flag is still 0 then print user joined the chat 
             *  acknowledgement message onto the server console
             */
            if(flag==0){
                date=new Date();
                System.out.println(sdf.format(date)+" "+userName+" has joined the chat");
            }


            
        } 
        catch(IOException e){
            System.out.println(e);
        }
    }

    /* returns username */
    public String getUserName(){
        return userName;
    }
    /* returns Scanner object(that takes input from server's socket input) to ServerClose thread */
    public Scanner getIn() {
        return in;
    }
    /* returns PrintStream object(that gives output to server's socket output) to ServerClose thread */
    public PrintStream getOutput() {
        return output;
    }

    /* returns Socket object to ServerClose thread*/
    public Socket getSocket(){
        return socket;
    }




    public void run() {
        
        /* 
         *  if flag=1 then close the resources. 
         *  delete the already created thread from the clientList.
         *  end the thread.
         *  this happens if the username is a duplicate of any 
         *  previous user that is present in the chat 
         */
        if(flag==1){
             
            try {
                    
                in.close();
                output.close();
                socket.close();
            } 
            catch (IOException e){
                System.out.println(e);
            }

            int n=clientList.size();
            clientList.remove(n-1); /*  
                                     *   remove the last client from the thread, 
                                     *   that is basically the thread with duplicate username
                                     */ 


        }
        /* if the user is not having a duplicate username */
        else{

            String line=null;   //to take the input from server's socket input 


            /* 
             *  a loop that will run indefinitly to take input from client scoket 
             *  till a terminating condition is met 
             */  
            while(true){
    
                
                try{
                line=in.nextLine(); //read a line from client's socket output
                }
                catch(NoSuchElementException e){}
    
                /*
                 *   checks if its socket is closed by ServerClose thread
                 *   if yes, it breaks out of loop and thus terminates itself
                 *   the resources are closed by the ServerClose thread
                 */
                if(socket.isClosed()){
                    break;
                }

                /*
                 *  checks if client gave the 'over' command to the thread
                 *  if yes, it closes the resources for the specific server socket 
                 *  finds and removes itself from clientList
                 *  gives an acknowledgement in the server console 
                 *  then it breaks out of loop and thus terminates itself
                 */
                else if(line.equalsIgnoreCase("Over")){
    
                    try {
                        socket.close();
                        in.close();
                        output.close();
                    } 
                    catch (IOException e) {
                        
                        e.printStackTrace();
                    }

                    /* loop through all the elements of the clientList */
                    for(int i=0;i<clientList.size();i++){
                        
                        /* checks where the client id is present in the list*/
                        if(this.id==clientList.get(i).id ){
                            
                            clientList.remove(i);           //removes the ClientHandler thread from clientList
                            break;                          
                        }
                    }
                    date=new Date();
                    System.out.println(sdf.format(date)+" "+userName+" has left the chat");     //acknowledgement
                    break;
                }

                /* if socket is not closed and over command is not executed */
                else{

                    /* checks if client gave the 'whoisin' command to the thread */
                    if(line.equalsIgnoreCase("whoisin")){
                        String list="CLIENT LIST:";
                        for(int i=0;i<clientList.size();i++){
                            list=list+"\n"+(i+1)+". "+(clientList.get(i).getUserName());
                        }
                        date=new Date();
                        output.println(sdf.format(date)+" "+list);

                    }
                    /* checks if client gave the '@userName message' type of command(i.e. private message command )to the thread */
                    else if(line.charAt(0)=='@'){
                        String username=line.split(" ",2)[0];
                        String privateUserName=username.substring(1,username.length()); //stores the username of the client the message needs to be sent
                        
                        /* checks if the message is sent to self */
                        if(this.userName.equals(privateUserName)){
                            date=new Date();
                            output.println(sdf.format(date)+" you can't send message to yourself");
                        }
                        else{
    
                            int flag=0;                                                                         //used to check if the requested user is in the chat
                            
                            /* loop through all the elements of the clientList */
                            for(int i=0;i<clientList.size();i++){
                                
                                /* 
                                 *  check if any of the username in the clientList is 
                                 *  equal to the requested user's username
                                 *  if yes, then give the message to the user
                                 *  and set flag=1 
                                 */
                                if(clientList.get(i).userName.equals(privateUserName)){
                                    flag=1;
                                    PrintStream output;
                                    String msg=line.split(" ",2)[1];                                            //store the message
                                    try {
                                        output = new PrintStream(clientList.get(i).socket.getOutputStream());   //create an PrintStream object to give output to client's socket input
                                        date=new Date();
                                        output.println(sdf.format(date)+" "+userName+" :"+msg);                 //outputs the message along with date to the client's socket input
                                        
                                    } 
                                    catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                            }
                            /* if flag=0 then the requested user isn't present in the chat */
                            if(flag==0){
                                date=new Date();
                                output.println(sdf.format(date)+" the requested user isn't in the chat");       
                            }   
                        }
                    }
                    /* broadcast the message to all the clients as no other option is selected */
                    else{
                        date=new Date();
                        System.out.println(sdf.format(date)+" "+userName+" :"+line);                            //outputs the acknowledgement message along with date to the server console
                        date=new Date();
                        output.println(sdf.format(date)+" "+"server says: "+line);                              //outputs the acknowledgement message along with date to the sender client's socket input
                        
                        /* loop through all the elements of the clientList */
                        for(int i=0;i<clientList.size();i++){
                            
                            /*
                             *  outputs the message along with date to the all client's socket input 
                             *  except the sender's socket input
                             */
                            if(this.id!=clientList.get(i).id){
                            
                                PrintStream output;
                                try {
                                    output = new PrintStream(clientList.get(i).socket.getOutputStream());       //create PrintStream object to print message to one client's socket at a time
                                    date=new Date();
                                    output.println(sdf.format(date)+" "+userName+" :"+line);                    //outputs the message along with date to the one client's socket input at a time       
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        } 
                    }
                }

                line=null;     // reset the message to null              
            }
        }        
    }	
}