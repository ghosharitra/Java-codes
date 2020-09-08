//CLIENT SIDE


import java.net.*;
import java.io.*;
import java.util.*;


public class Client{
    
    private Socket socket=null;
    private Scanner input=null;
    private PrintStream out=null;
    private ServerConnection sc=null;
    private String userName=null;

public Client(String address,int port,String userName){
    try{

        this.userName=userName;
        socket=new Socket(address,port);
        System.out.println("Connected");

        input=new Scanner(System.in);
        out=new PrintStream(socket.getOutputStream());
        out.println(userName);

        System.out.print("write anything to be sent onto the server as brodcast\nwrite with '@username message' to chat with particular person.\nIf you want to close the client end type 'over' in any case without the quotes.\n");

        sc=new ServerConnection(this);
        sc.start();
        //sis=new ServerIsAlive(socket);
        //sis.start();

        String line;
        while(true){

            System.out.print("> ");
            line=input.nextLine();
            
            if(line.equals("")){
                continue;
            }

            out.println(line);
            
            if(line.equalsIgnoreCase("Over") || socket.isClosed() ){
                break;
                
            }

        
        }
        try{
            
            input.close();
            //System.out.println("input closed");
            out.close();
            //System.out.println("out closed");
            socket.close();
            //System.out.println("socket closed");
            sc.getServerOutput().close();
            //System.out.println("serveroutput closed"); 
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

public Socket getSocket(){
    return socket;
}

public Scanner getInput(){
    return input;
}

public PrintStream getOut(){
    return out;
}



public static int count=0;
synchronized public static void main(String args[]){
    
    Scanner scan=new Scanner(System.in);

    String s;

    int port=3000;
    String ip="127.0.0.1";

    while(true){
        if(args.length==0){
            System.out.println("enter a username: ");
            s= scan.nextLine();
            Client client=new Client(ip,port,s);
            break;
        }
        else if(args.length==1){
            Client client=new Client(ip,port,args[0]);
            break;
        }
        else if(args.length==2){
            Client client=new Client(ip,Integer.parseInt(args[1]),args[0]);
            break;
        }
        else if(args.length==3){
            Client client=new Client(args[2],Integer.parseInt(args[1]),args[0]);
            break;
        }
        else{
            
            System.out.println("client side initialization format: java client<space>ip<space>port no.<space>username");
            System.out.println("default client side initialization: port="+port+", ip="+ip+", username= *given username*");
        }
    }
    
    scan.close();
    
}

}