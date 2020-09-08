import java.net.*;
//import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Server{

    private Socket socket=null;
    private ServerSocket server=null;
    private ArrayList<ClientHandler> clientList=new ArrayList<ClientHandler>();  
    private int id=0;
    private ExecutorService pool = Executors.newFixedThreadPool(2);
    public Server(int port){
        try{
            server=new ServerSocket(port);
            System.out.println("server started");
            
            while(true){
            System.out.println("waiting for a client...");
            socket=server.accept();
            ClientHandler clientThread=new ClientHandler(socket,id,clientList);
            clientList.add(clientThread);
            pool.execute(clientThread);
            
            id=id+1;
            
            
            }

            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]){

        Server server=new Server(3000);

    }

}