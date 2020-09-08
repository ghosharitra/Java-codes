import java.net.*;
import java.io.*;
import java.util.*;

class Client{
    
    private Socket socket=null;
    private Scanner input=null;
    private PrintStream out=null;

public Client(String address,int port){
    try{

        socket=new Socket(address,port);
        System.out.println("Connected");

        input=new Scanner(System.in);
        out=new PrintStream(socket.getOutputStream());
        
        System.out.print("write anything to be sent onto the server\nIf you want to close the client end type 'over' in any case without the quotes.\n");

        String line="";
        while(!line.equalsIgnoreCase("Over")){
            System.out.print("> ");
            line=input.nextLine();
            out.println(line);
        
        }
        try{
            socket.close();
            input.close();
            out.close();
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