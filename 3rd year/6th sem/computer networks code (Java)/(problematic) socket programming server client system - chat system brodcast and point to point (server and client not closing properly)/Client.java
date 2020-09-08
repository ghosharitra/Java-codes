import java.net.*;
import java.io.*;
import java.util.*;


class Client{
    
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

        sc=new ServerConnection(socket);
        sc.start();

        String line;
        while(true){

            System.out.print("> ");
            line=input.nextLine();
            //System.out.println("here1");
            out.println(line);
            
            if(line.equalsIgnoreCase("Over")){
                break;
            }

        
        }
        try{
            input.close();
            out.close();
            socket.close();
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
    
    while(true){
        if(args.length==0){
            Client client=new Client("127.0.0.1",3000,"Anonyomous");
            break;
        }
        else if(args.length==1){
            Client client=new Client("127.0.0.1",3000,args[0]);
            break;
            }
        else if(args.length==2){
            Client client=new Client("127.0.0.1",Integer.parseInt(args[1]),args[0]);
            break;
        }
        else if(args.length==3){
            Client client=new Client(args[2],Integer.parseInt(args[1]),args[0]);
            break;
        }
        else{
            System.out.println("client side initialization format: java client ip<space>port no.<space>username");
        }
    }
    
    
}

}