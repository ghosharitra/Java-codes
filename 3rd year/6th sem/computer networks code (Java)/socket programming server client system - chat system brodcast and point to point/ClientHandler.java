//SERVER SIDE


import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ClientHandler extends Thread {
    private Socket socket;
    private int id;
    private Scanner in = null;
    private PrintStream output = null;
    private ArrayList<ClientHandler> clientList;
    private String userName;
    private int flag=0;

    public ClientHandler(Socket socket, int id,ArrayList<ClientHandler> clientList) {
        this.socket = socket;
        this.id = id;
        this.clientList=clientList;
        
        try{        
            in = new Scanner(socket.getInputStream());
            userName=in.nextLine();
            output = new PrintStream(socket.getOutputStream());

            int n=clientList.size();
            //System.out.println("n= "+n);
            for(int i=0;i<n;i++){
                //System.out.println("i= "+i);
                //System.out.println("this.userName= "+this.userName);
                //System.out.println("clientList.get(i).userName="+clientList.get(i).userName);

                if(this.userName.equals(clientList.get(i).userName)){
                    output.println("*** this username is already taken ***");
                    System.out.println("user with same username trying to enter");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(userName+" has joined the chat");
            }


            
        } 
        catch(IOException e){
            System.out.println(e);
        }
    }

    public String getUserName(){
        return userName;
    }

    public Scanner getIn() {
        return in;
    }

    public PrintStream getOutput() {
        return output;
    }


    public Socket getSocket(){
        return socket;
    }




    public void run() {
        
        if(flag==1){
             
            try {
                    
                in.close();
                output.close();
                socket.close();
            } 
            catch (IOException e){
                System.out.println(e);
            }

            int n=clientList.size();
            clientList.remove(n-1);


        }
        else{

            String line=null;

            while(true){
    
                
                try{
                line=in.nextLine();
                }
                catch(NoSuchElementException e){}
    
                if(socket.isClosed()){
                    break;
                }
    
                else if(line.equalsIgnoreCase("Over")){
    
                    try {
                        socket.close();
                        in.close();
                        output.close();
                    } 
                    catch (IOException e) {
                        
                        e.printStackTrace();
                    }
        
                    for(int i=0;i<clientList.size();i++){
                        if(this.id==clientList.get(i).id ){
                            
                            clientList.remove(i);
                            break;
                        }
                    }
                    
                    System.out.println(userName+" has left the chat");
                    
    
                    break;
                }
                else{
                    if(line.split(" ",2)[0].charAt(0)=='@'){
                        String username=line.split(" ",2)[0];
                        String privateUserName=username.substring(1,username.length());
                        
                        
                        if(this.userName.equals(privateUserName)){
                            output.println("you can't send msg to yourself");
                        }
                        
                        else{
    
                            int flag=0;
    
                            for(int i=0;i<clientList.size();i++){
    
                                if(clientList.get(i).userName.equals(privateUserName)){
                                    flag=1;
                                    break;
                                }
                            }
                            if(flag==0){
                                output.println("the requested user isn't in the chat");
                            }
                            else{
    
                                String msg=line.split(" ",2)[1];
                        
                                for(int i=0;i<clientList.size();i++){
                                    if(privateUserName.equals(clientList.get(i).userName)){
                    
                                        PrintStream output;
                                        try {
                                            output = new PrintStream(clientList.get(i).socket.getOutputStream());
                                            output.println(privateUserName+" :"+msg);
                                            
                                        } catch (IOException e) {
                                            
                                            e.printStackTrace();
                                        }
                                        break;
                                        
                                    }
                                }
                            }
    
                            
                        }
                        
    
                    }
                    else{
                        System.out.println(userName+" :"+line);
                        output.println("server says: "+line); 
                        for(int i=0;i<clientList.size();i++){
                            if(this.id!=clientList.get(i).id){
                            
                                PrintStream output;
                                try {
                                    output = new PrintStream(clientList.get(i).socket.getOutputStream());
                                
                                    output.println(userName+" :"+line);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        } 
                    }
                }
    
    
    
                line=null;
                    
            }


        }


        
    }

	
}