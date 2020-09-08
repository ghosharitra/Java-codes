//SERVER SIDE



import java.io.PrintStream;
import java.util.Scanner;

public class ServerClose extends Thread {
    private Scanner in;
    private Server server;
    private PrintStream out;

    public ServerClose(Server server) {
        this.server = server;
        in = new Scanner(System.in);

        
        
    }

    public void run()  {

        try {
            while(true){
                String serverCommand=in.next();
                if (serverCommand.equalsIgnoreCase("end")) {
                    in.close();
                    int n=server.getArrayList().size();
                    for(int i=n-1;i>=0;i--){
                        out = new PrintStream(server.getArrayList().get(i).getSocket().getOutputStream());
                        out.println("*** server closed ***");
                        out.close();
                        System.out.println(server.getArrayList().get(i).getUserName()+" has been removed from the chat");
                        server.getArrayList().get(i).getSocket().close();
                        server.getArrayList().get(i).getIn().close();
                        server.getArrayList().get(i).getOutput().close();
                        server.getArrayList().remove(i);
                    }
                    break;
                    
                }
            }
            
        } 
        catch(Exception e){
            //System.out.println(e);
        }
        finally{
            System.out.println("server terminated");
            System.exit(0);
        }
    }

}
