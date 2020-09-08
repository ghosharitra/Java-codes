import java.net.*;
import java.util.*;

public class Server{

    private Socket socket=null;
    private ServerSocket server=null;
    private Scanner in=null;

    public Server(int port){
        try{
            server=new ServerSocket(port);
            System.out.println("server started");
            System.out.println("waiting for a client...");
            socket=server.accept();
            System.out.println("client accepted");

            in=new Scanner(socket.getInputStream());
            String line="";

            while(!line.equalsIgnoreCase("Over")){
                
                line=in.nextLine();
                System.out.println("client data: "+line); 
            }
            System.out.println("closing connection");
            
            socket.close();
            server.close();
            in.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]){

        Server server=new Server(3000);

    }

}