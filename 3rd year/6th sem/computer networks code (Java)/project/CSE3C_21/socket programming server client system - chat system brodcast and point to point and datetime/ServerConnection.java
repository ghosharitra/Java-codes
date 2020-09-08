//CLIENT SIDE

import java.io.IOException;             //for exception thrown     

import java.util.Scanner;               /*
                                         *  for scanning input from server socket's output 
                                         *  as input for client socket
                                         */ 

/*
 *  create an object of thread ServerConnection. 
 *  main task ServerConnection is for displaying msg to client console. 
 *  the thread runs separately from the client class,
 *  so client doesn't have to wait (for server response each time) to type the next message. 
 */                                       
public class ServerConnection extends Thread {

    private Client client;                  /*
                                             *  create an object reference of Client class 
                                             *  so that it can access its fuctions.
                                             */

    private Scanner serveroutput = null;    //create an object reference to get input from server's output
    private String line = null;             //message of user from server's output   

        
    /*  ServerConnection constuctor used to create a thread with client object */    
    public ServerConnection(Client client) {

        this.client=client;                                                  //reference the created client object
        try {                                                                
            serveroutput = new Scanner(client.getSocket().getInputStream()); //create an object to get input to client socket

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    /* to take Scanner object to close it from Client class in case if over command is executed */
    public Scanner getServerOutput(){
        return serveroutput;
    }

    /* start the thread to scan and display the server response onto client console */
    public void run() {

        /* 
         *  a loop that will run indefinitly to take input for client scoket 
         *  from server's output socket 
         *  till a terminating condition is met 
         */    
        while (true) {


            try { line = serveroutput.nextLine();    } catch (Exception e) {}       //takes input from server
            
            /* 
             *  checks if Client object has closed the scanner object
             *  this happens when over command is executed in client class
             */
            if(line==null){
                break;  //if closed, break out of the loop
            }
            /*
             *  checks if server has responded with *** server closed ***
             *  or *** this username is already taken ***
             *  if yes, then the client needs to be closed from this thread itself
             */
            else if(line.equals("*** server closed ***") || line.equals("*** this username is already taken ***")){ 
                try {
                    System.out.println(line+"\npress 'enter key' to exit");     /*
                                                                                 *  so that the scanner of the client class can be given an input
                                                                                 *  and thus freed to terminate its loop
                                                                                 */
                    /* closing Client class' resources from here in case if server disconnected or removed the client */  
                    client.getSocket().close();
                    client.getInput().close();
                    client.getOut().close();
                } 
                catch (IOException e) {
                    System.out.println(e);
                }
                break;                          //break out of loop after meeting terminating condition
            }
            else{
                System.out.println(line);       //displays the line(server output) onto the client console
                System.out.print("> ");
            }
            line=null;                          //change the line to null at the end of each itteration
        }
        
            
        serveroutput.close();                   /* 
                                                 *  closes the Scanner object of ServerConnection thread
                                                 *  if server has responded with *** server closed ***
                                                 *  or *** this username is already taken ***
                                                 *  otherwise, it closes a closed resource
                                                 *  as Client class has already closed the Scanner 
                                                 */ 
        
    }
}