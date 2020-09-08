//SERVER SIDE

/* for sockect programming */
import java.net.ServerSocket;                   //to create a single ServerSocket with a specific port no. 
import java.net.Socket;                         //to create a multiple server sockets to connect with client's socket 


import java.util.ArrayList;                     //for storing and accessing a list of ClientHandler threads
import java.util.Date;                          //to use functionality of date
import java.text.SimpleDateFormat;              //to format the date

/* 
 *  main task is to accept a client
 *  create a thread to handle the client 
 *  and list the thread in clientList 
 */
public class Server{

    private ServerSocket server=null;                                               //to create a server socket
    private Socket socket=null;                                                     /*
                                                                                     *   to create multiple server side sockets 
                                                                                     *  which connects with all client sockets 
                                                                                     */

    private ArrayList<ClientHandler> clientList=new ArrayList<ClientHandler>();     /*  to maintain a list of ClientHandler thread
                                                                                     *  each thread maintains connection wtih a client
                                                                                     */ 
    private int id=0;                                                               //to give an id to each of the client
    private ServerClose sc;                                                         //to create a thread that listens to server console for input
    private Date date;                                                              //create an object reference of Date class
    private SimpleDateFormat sdf;                                                   //create an object reference of SimpleDateFormat class


   
    /* create a server with a given port no. */
    public Server(int port){

        
        try{
            sdf = new SimpleDateFormat("HH:mm:ss");                     //set the format of date to be printed 
            server=new ServerSocket(port);                              /*
                                                                         *  create a ServerSocket object with a particular 
                                                                         *  port for all client to connect to.
                                                                         */
            date=new Date();                                            //create object of Date class
            System.out.println(sdf.format(date)+" Server started");     //print server started message in the server console
            sc=new ServerClose(this);                                   //create a thread object that listens to server console for input
            sc.start();                                                 //start the ServerClose thread
            

            /* 
             *  a loop that will run indefinitly to accept/connect a client scoket 
             *  each time with one of its server sockets  
             *  till a terminating condition is met 
             *  the loop will wait each time till a new client connects
             */    
            while(true){
                date=new Date();
                System.out.println(sdf.format(date)+" Server waiting for a clients on port "+port);
                socket=server.accept();                 //new server's Socket object is created to connect client's socket object 
                
                //System.out.println("h1"); 
                //this proves that it jumps out of loop as soon as .accept doesn't work
                //the if statement down will never work 
                //- future arpan


                /*
                *   check if the ServerSocket object is closed
                *   the ServerSocket Object can be closed by ServerClose thread's object
                *   the thread closes the ServerSocket object when 'end' command is used in server's console
                */
                if(server.isClosed()){ 
                    //System.out.println("h2");
                    //this proves that it jumps out of loop as soon as .accept doesn't work
                    //the if statement down will never work 
                    //- future arpan
                    break;  //if ServerSocket object is closed then break out of the loop
                }

                ClientHandler clientThread=new ClientHandler(socket,id,clientList);         /*
                                                                                             *  create a thread object to handle a client.
                                                                                             *  each thread takes socket, id , clientList as object.
                                                                                             *  socket is used to control its I/O. 
                                                                                             *  id is used to give the client a unique id.
                                                                                             *  clientList is used to perform operations on the list.
                                                                                             *  also it is used to perform operation that requires client thread 
                                                                                             *  other than the one that is created right now.  
                                                                                             */
                clientList.add(clientThread);                                               //add that thread to the clientList
                clientThread.start();                                                       //start the thread
                
                id=id+1;                                                                    //increment the id by one
                
                
            }

            
            
        }
        catch(Exception e){}
    }

    
    /* so that ServerClose thread object can access the threads created and stored in the clientList */
    public ArrayList<ClientHandler> getArrayList(){
        return clientList;
    }

    /* so that ServerClose thread object can access and close ServerSocket object by itself */
    public ServerSocket getServerSocket(){
        return server;
    }



    public static void main(String args[]){

        int port=3000;                          //default portNumber
        
        /* try catch to display server side initialization format if wrong input format is passed */
        try{

            /*
             * To start the Server in console, use one of the following command at the console prompt:
             * java Server
             * java Server portNumber
             */
            if(args.length==0){                         //for java Server 
                Server server=new Server(port);
                
            }
            else if(args.length==1){                    //for java Server portNumber

                Server server=new Server(Integer.parseInt(args[0]));
                
            }

            else{                                       /*
                                                         *  for more than 1 command line argument initialization
                                                         *  print correct initialization format
                                                         */
                System.out.println("server side initialization format: java server<space>port no.");
                System.out.println("default server side initialization: port="+port);
            } 
        }
        catch(Exception e){
            System.out.println("server side initialization format: java server<space>port no.");
            System.out.println("default server side initialization: port="+port);
        }
    }
}