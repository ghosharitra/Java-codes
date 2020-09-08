import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

class ClientHandler extends Thread {
    private Socket socket;
    private int id;
    private Scanner in = null;
    private PrintStream output = null;
    private ArrayList<ClientHandler> clientList;

    public ClientHandler(Socket socket, int id,ArrayList<ClientHandler> clientList) {
        this.socket = socket;
        this.id = id;
        this.clientList=clientList;
        
        try{        
            in = new Scanner(socket.getInputStream());
            output = new PrintStream(socket.getOutputStream());
        } 
        catch(IOException e){
            System.out.println(e);
        }
    }

    public int getid() {
        return id;
    }

    public void run() {

        try{

            
            String line="";

            while(!line.equalsIgnoreCase("Over")){
                
                line=in.nextLine();
                System.out.println("client "+id+" :"+line);
                output.println("data recieved on server end: "+line); 
                for(int i=0;i<clientList.size();i++){
                    if(this.id!=clientList.get(i).id){
                       
                        PrintStream output = new PrintStream(clientList.get(i).socket.getOutputStream());
                        output.println("client "+this.id+" :"+line);
                    }
                } 
            }
            for(int i=0;i<clientList.size();i++){
                if(this.id==clientList.get(i).id){
                   
                    clientList.remove(i);
                    break;
                }
            } 

            System.out.println("closing connection for client "+id);
            socket.close();
            in.close();

        } 
        catch(IOException e){
            System.out.println(e);
        }
    }
}