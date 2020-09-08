import java.net.*;
import java.io.*;
import java.util.*;

class Client{
    
    private Socket socket=null;
    private Scanner input=null;
    private PrintStream out=null;
    private Scanner in=null;

public Client(String address,int port){
    try{

        socket=new Socket(address,port);
        System.out.println("Connected");

        input=new Scanner(System.in);
        out=new PrintStream(socket.getOutputStream());
        in=new Scanner(socket.getInputStream());
        
        
        String line=input.nextLine();//input from client console user
        out.println(line);//output to server
        String lineback=in.nextLine();//input from server
        System.out.println(lineback);//output to client console user
        
        try{
            socket.close();
            input.close();
            out.close();
            in.close();
            
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




public static void main(String args[]){

    Client client=new Client("127.0.0.1",3000);
}

}