//SERVER SIDE


import java.net.*;
//import java.io.*;
import java.util.*;
//import java.util.concurrent.*;

public class Server{

    private Socket socket=null;
    private ServerSocket server=null;
    private ArrayList<ClientHandler> clientList=new ArrayList<ClientHandler>();  
    private int id=0;
    //private ExecutorService pool = Executors.newFixedThreadPool(2);
    private ServerClose sc;
    public Server(int port){
        try{
            server=new ServerSocket(port);
            System.out.println("server started");
            sc=new ServerClose(this);
            sc.start();

            while(true){
            System.out.println("waiting for a client...");
            socket=server.accept();

            

            ClientHandler clientThread=new ClientHandler(socket,id,clientList);
            clientList.add(clientThread);
            clientThread.start();
            //pool.execute(clientThread);
            
            id=id+1;
            
            
            }

            
            
        }
        catch(Exception e){}
    }

    

    public ArrayList<ClientHandler> getArrayList(){
        return clientList;
    }

    
    public static void main(String args[]){

        int port=3000;
        while(true){

            if(args.length==0){
                Server server=new Server(port);
                break;
            }
            else if(args.length==1){
    
                Server server=new Server(Integer.parseInt(args[0]));
                break;
            }

            else{
                System.out.println("server side initialization format: java server<space>port no.");
                System.out.println("default server side initialization: port="+port);
            }
    
    
    
        }
        
    }

}