//CLIENT SIDE

import java.io.*;
import java.util.*;

public class ServerConnection extends Thread {

    private Client client;
    private Scanner serveroutput = null;
    private String line = null;

    public ServerConnection(Client client) {

        this.client=client;
        try {
            serveroutput = new Scanner(client.getSocket().getInputStream());
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public Scanner getServerOutput(){
        return serveroutput;
    }

    public void run() {

        while (true) {

            try { line = serveroutput.nextLine();    } catch (Exception e) {}
            
            if(line==null){
                break;
            }
            else if(line.equals("*** server closed ***") || line.equals("*** this username is already taken ***")){
                try {
                    System.out.println(line+"\npress 'enter key' to exit");
                    client.getSocket().close();
                    client.getInput().close();
                    client.getOut().close();
                } 
                catch (IOException e) {
                    System.out.println(e);
                }
                break;
            }
            
            

            System.out.println(line);
            System.out.print("> ");

            line=null;
        }
        
            
            serveroutput.close();
            
            System.exit(0);
        

    }




}