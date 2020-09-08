import java.net.*;
import java.io.*;
import java.util.*;

class ServerConnection extends Thread {

    private Socket socket;
    private Scanner serveroutput = null;

    public ServerConnection(Socket socket) {

        this.socket = socket;
        try {
            serveroutput = new Scanner(socket.getInputStream());
        } 
        catch(IOException e) {
            System.out.println(e);
        }


    }


    public void run(){

        while(true){ 
        
            String line=serveroutput.nextLine();
            if(line==null){
                break;
            }
            System.out.println(line);
            System.out.print("> ");
        }

    }




}