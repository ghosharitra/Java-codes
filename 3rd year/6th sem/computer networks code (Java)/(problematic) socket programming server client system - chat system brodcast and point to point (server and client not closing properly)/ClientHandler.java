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
    private String userName;

    public ClientHandler(Socket socket, int id,ArrayList<ClientHandler> clientList) {
        this.socket = socket;
        this.id = id;
        this.clientList=clientList;
        
        try{        
            in = new Scanner(socket.getInputStream());
            userName=in.nextLine();
            output = new PrintStream(socket.getOutputStream());

            System.out.println(userName+" has joined the chat");
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
                if(line.split(" ",2)[0].charAt(0)=='@'){
                    String username=line.split(" ",2)[0];
                    String msg=line.split(" ",2)[1];
                    String privateUserName=username.substring(1,username.length());
                    for(int i=0;i<clientList.size();i++){
                        if(privateUserName.equals(clientList.get(i).userName)){
        
                            PrintStream output = new PrintStream(clientList.get(i).socket.getOutputStream());
                            output.println(privateUserName+" :"+msg);
                            break;
                        }
                    } 

                }
                else{
                    System.out.println(userName+" :"+line);
                    output.println("server says: "+line); 
                    for(int i=0;i<clientList.size();i++){
                        if(this.id!=clientList.get(i).id){
                       
                            PrintStream output = new PrintStream(clientList.get(i).socket.getOutputStream());
                            output.println(userName+" :"+line);
                        }
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