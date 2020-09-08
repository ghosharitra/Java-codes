//CLIENT SIDE


import java.io.IOException;             //for exception thrown
import java.io.PrintStream;             //for using println function to give output from client socket
import java.util.Scanner;               //for scanning input from client console

/* for sockect programming */
import java.net.Socket;                 //for socket object of the client
import java.net.UnknownHostException;   //for exception thrown while creating a socket object


/* main task is to take input from console user and send to server */
public class Client{
    
    
    private Socket socket=null;         //create an object reference of socket from client side
    private Scanner input=null;         //create an object reference to get input from console
    private PrintStream out=null;       //create an object reference to send output from the client socket
    
    
    
    private ServerConnection sc=null;   /*
                                         *  create an object reference of thread ServerConnection. 
                                         *  ServerConnection is for displaying msg to client console. 
                                         */  
    
    private String userName=null;       //create an object reference of client username



/*
 *  Client constuctor used to create a client with particular username,
 *  client socket and 
 *  connect to server socket with particular ip and port address. 
 */    
public Client(String address,int port,String userName){
    try{

        this.userName=userName;                     //  gives username to client object
        socket=new Socket(address,port);            /*
                                                     *  creates client side socket object to 
                                                     *  connect to particular address and port no.
                                                     */
        System.out.println("*** Connected ***");

        input=new Scanner(System.in);             
        out=new PrintStream(socket.getOutputStream());  //  create PrintStream object to output from the socket
        out.println(userName);                          //  output userName to server

        /* chatrrom instructions for client */
        System.out.println("\nHello! Welcome to the chatroom.");
		System.out.println("Instructions:");
		System.out.println("1. Simply type the message to send broadcast to all active clients");
		System.out.println("2. Type '@username<space>yourmessage' without quotes to send message to desired client");
		System.out.println("3. Type 'WHOISIN' without quotes to see list of active clients");
        System.out.println("4. Type 'OVER' without quotes to logoff from server");
        
        sc=new ServerConnection(this);  /*
                                         *  creates thread and is for displaying msg to client console.
                                         * also object of client is passed so that it can access its fuctions.
                                         */

        sc.start();                     //start the thread
        

        String line;                    //to take message of user from client console
        

        /* 
         *  a loop that will run indefinitly to take input 
         *  from client console till a terminating condition is met 
         */
        while(true){

            System.out.print("> ");         //cursor
            line=input.nextLine();          //takes input from user
            
            if(line.equals("")){            //checks if anything is written on the line by user
                
                
                /* 
                 *  to break out of loop at the end
                 *  when we press enter key and line contains nothing
                 *  and client socket is closed by the ServerConnection thread
                 */
                if(socket.isClosed()){      
                    break;                  //break out of the loop if socket is closed 
                }
                
                continue;                   //don't send anything to server if nothing is written on the line 
            }

            out.println(line);              //output the line from client socket if line contains something
            

            /* checks if user has written over command or the client socket is closed*/
            if(line.equalsIgnoreCase("Over") || socket.isClosed() ){
                break;                      //if any condition satisfy, then break out of the loop
                
            }

        
        }


        /*
         *  closing the resources if  loop has terminated.
         *  this attepts to close the resources when over command is used.
         *  otherwise it tries to close the closed resources 
         *  as ServerConnection thread has already closed them.
         */ 
        try{
            
            input.close();
            out.close();
            socket.close();
            sc.getServerOutput().close();   //also closing ServerConnection thread's scanner object 
             
        }
        catch(IOException e){
            System.out.println(e);
        
            
        }
    }
    catch(UnknownHostException e){
        System.out.println(e);
    }
    catch(IOException e){
        System.out.println(e);
    }




}

/* to take Socket object to close it from ServerConnection thread in case if server disconnected */
public Socket getSocket(){
    return socket;
}
/* to take Scanner object to close it from ServerConnection thread in case if server disconnected */
public Scanner getInput(){
    return input;
}
/* to take PrintStream object to close it from ServerConnection thread in case if server disconnected */
public PrintStream getOut(){
    return out;
}



public static void main(String args[]){
    
    Scanner scan=new Scanner(System.in);

    String s;                   //to take username if none is given in command line arguments

    int port=3000;              //default serverport no.
    String ip="127.0.0.1";      //default server ip

    /* try catch to display client side initialization format if wrong input format is passed */
    try{

        /*
         * To start the Client in console, use one of the following command at the console prompt:
         * java Client
         * java Client username
         * java Client username portNumber
         * java Client username portNumber serverIP
         */

        
        if(args.length==0){                                 // for javac Client
            System.out.println("enter a username: ");
            s= scan.nextLine();
            Client client=new Client(ip,port,s);
        
        }
        else if(args.length==1){        //for javac Client username
            Client client=new Client(ip,port,args[0]);
            
        }
        else if(args.length==2){        //for javac Client username portNumber
            Client client=new Client(ip,Integer.parseInt(args[1]),args[0]);
            
        }
        else if(args.length==3){        //for javac Client username portNumber serverAddr
            Client client=new Client(args[2],Integer.parseInt(args[1]),args[0]);
        
        }
        else{                           /*
                                         *  for more than 3 command line argument initialization
                                         *  print correct initialization format
                                         */   
            
            System.out.println("client side initialization format: java client<space>username<space>port no.<space>ip");
            System.out.println("default client side initialization:  username= *given username*, port="+port+", ip="+ip);
        }
    }
    catch(Exception e){
        System.out.println("client side initialization format: java client<space>username<space>port no.<space>ip");
        System.out.println("default client side initialization:  username= *given username*, port="+port+", ip="+ip);

    }
    

    scan.close();
    
}

}