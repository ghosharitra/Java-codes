//SERVER SIDE



import java.io.IOException;                     //for exception thrown
import java.io.PrintStream;                     //for using println function to output from server socket
import java.util.Scanner;                       //for taking input from server console
import java.util.Date;                          //to use functionality of date
import java.text.SimpleDateFormat;              //to format the date


/*
 *  the main task is to create a thread object that takes input from server console
 *  if the server uses 'end' command, then 
 *  close resources of all the threads
 *  sends *** server closed *** acknowledgement to all the client's socket input
 *  
 *  delete the thread from the clientList
 */
public class ServerClose extends Thread {
    private Scanner in;                         //to take input from server console 
    private Server server;                      //to reference the Server object 
    private PrintStream out;                    //to give output from server's socket as input to client's socket
    private SimpleDateFormat sdf;               //to format the date

    /* ServerClose constuctor used to create a thread with server's object */ 
    public ServerClose(Server server) {

        sdf = new SimpleDateFormat("HH:mm:ss"); //set the format of date to be printed             
        this.server = server;                   //references object of Server class
        in = new Scanner(System.in);            //create Scanner object to get input from server console
    }

    public void run() {

        try {
            /* 
             *  a loop that will run indefinitly to take input from server console 
             *  till a terminating condition is met 
             */
            while (true) {

                String serverCommand = in.next();                   //store the input from server console
                
                /* 
                 *  check if server has used the 'end' command in the server console
                 *  if true, go through all elements of clientList
                 *  send *** server closed *** message to all the client in the list
                 *  prints client removed acknoledgement onto server console for each client
                 *  close all the resources of the client
                 *  break from the outer loop
                 */
                if (serverCommand.equalsIgnoreCase("end")) {
                    in.close();
                    int n = server.getArrayList().size();               //store the size of the clientList

                    /* 
                     *  loop through all the elements of the clientList
                     *  in the reverse order because
                     *  the remove function of the list removes the element
                     *  and Shifts any subsequent elements to the left
                     */
                    for (int i = n - 1; i >= 0; i--) {
                        out = new PrintStream(server.getArrayList().get(i).getSocket().getOutputStream());                  //to give output to client's socket's input one by one
                        out.println("*** server closed ***");                                                               //send *** server closed *** message to the clients one by one
                        out.close();                                                                                        //close resource
                        System.out.println(sdf.format(new Date()) + " " + server.getArrayList().get(i).getUserName() + " has been removed from the chat");  //acknowledgement
                        server.getArrayList().get(i).getSocket().close();                                                   //close resource
                        server.getArrayList().get(i).getIn().close();                                                       //close resource
                        server.getArrayList().get(i).getOutput().close();                                                   //close resource
                        server.getArrayList().remove(i);                                                                    //remove the client from the clientList
                    }
                    break;

                }
            }

        } 
        catch (Exception e) {}
        finally {
            System.out.println(sdf.format(new Date()) + " server terminated");              //prints server terminated acknoledgement onto server console
            try {
                server.getServerSocket().close();                                           /*
                                                                                             *  closes the ServerSocket object of Server class' object
                                                                                             *  this will terminate the while loop in Server class' object 
                                                                                             */
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
