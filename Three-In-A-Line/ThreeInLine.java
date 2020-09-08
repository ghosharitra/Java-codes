import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

class WriteFile{
    private String path;
    private boolean appendToFile;

    public WriteFile(String path,boolean appendToFile){
        this.path=path;
        this.appendToFile=appendToFile;
    }

    public void writeToFile( String textLine ) throws IOException {
        FileWriter write = new FileWriter( path , appendToFile);
        PrintWriter printLine = new PrintWriter( write );
        printLine.printf( "%s" + "%n" , textLine);
        printLine.close();
    }
}


class Board{

    private int row;
    private int column;
    private char board[][];

    public Board(int row,int column){

        this.row=row;
        this.column=column;
        board=new char[row][column];

    }


    public boolean boxTest(int r,int c,char b){
        
        if(board[r][c]==b && board[r][c+1]==b && board[r][c+2]==b){
        board[r][c]='S';
        board[r][c+1]='S';
        board[r][c+2]='S';
        return true;
        }	
        else if(board[r+1][c]==b && board[r+1][c+1]==b && board[r+1][c+2]==b){
        board[r+1][c]='S';
        board[r+1][c+1]='S';
        board[r+1][c+2]='S';
        return true;
        }
        else if(board[r+2][c]==b && board[r+2][c+1]==b && board[r+2][c+2]==b){
        board[r+2][c]='S';
        board[r+2][c+1]='S';
        board[r+2][c+2]='S';
        return true;
        }
        else if(board[r][c]==b && board[r+1][c]==b && board[r+2][c]==b){
        board[r][c]='S';
        board[r+1][c]='S';
        board[r+2][c]='S';
        return true;
        }
        else if(board[r][c+1]==b && board[r+1][c+1]==b && board[r+2][c+1]==b){
        board[r][c+1]='S';
        board[r+1][c+1]='S';
        board[r+2][c+1]='S';
        return true;
        }
        else if(board[r][c+2]==b && board[r+1][c+2]==b && board[r+2][c+2]==b){
        board[r][c+2]='S';
        board[r+1][c+2]='S';
        board[r+2][c+2]='S';
        return true;
        }
        else if(board[r][c]==b && board[r+1][c+1]==b && board[r+2][c+2]==b){
        board[r][c]='S';
        board[r+1][c+1]='S';
        board[r+2][c+2]='S';
        return true;
        }
        else if(board[r][c+2]==b && board[r+1][c+1]==b && board[r+2][c]==b){
        board[r][c+2]='S';
        board[r+1][c+1]='S';
        board[r+2][c]='S';
        return true;
        }
        else{
            return false;
        }












    }


    public boolean checkWin(char symbol,int x,int y){
        try{
        // for(int i=0;i<row-2;i++){
        //     for(int j=0;j<column-2;j++){
        //         if(boxTest(i,j,symbol)){
        //             return true;	
        //         }
            
        //     }	
        // }
        // return false;
    
        for(int i=x-2;i<=x;i++){
            for(int j=y-2;j<=y;j++){
                if( (0<=i && i<row && 0<=j && j<column) && (0<=(i+2) && (i+2)<row && 0<=(j+2) && (j+2)<column)){
                    if(boxTest(i,j,symbol)){
                        return true;	
                    }
                }
            }	
        }
        return false;
        }
        catch(Exception e){
            System.out.println(e+"\nI have a bug\npress enter to cont.");
            Scanner scan=new Scanner(System.in);
            scan.nextLine();

        }
        
        return false;
    }


    public void dispBoard(){

        /*  
        board display format(problematic for rows/colums greater than 9):

          +---+---+---+---+---+---+---+
        1 | X | O | X | O | O | O | O |
          +---+---+---+---+---+---+---+
        2 | X | O | X | O | O | O | O |
          +---+---+---+---+---+---+---+
        3 | X | O | X | O | O | O | O |
          +---+---+---+---+---+---+---+
        4 | X | O | X | O | O | O | O |
          +---+---+---+---+---+---+---+
        5 | X | O | X | O | O | O | O |
          +---+---+---+---+---+---+---+
        6 | X | O | X | O | O | O | O |
          +---+---+---+---+---+---+---+
        7 | X | O | X | O | O | O | O |
          +---+---+---+---+---+---+---+
            1   2   3   4   5   6   7

        
        board display format(better):

        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 1
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 2
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 3
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 4
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 5
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 6
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 7
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 8
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 9
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 10
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 11
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 12
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 13
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 14
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 15
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 16
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 17
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 18
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | 19
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
        | X | O | X | O | X | O | X | O | X | X | S | S | S | X | O | X | O | X | O | X | 20
        +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
          0   0   0   0   0   0   0   0   0   1   1   1   1   1   1   1   1   1   1   2
          1   2   3   4   5   6   7   8   9   0   1   2   3   4   5   6   7   8   9   0
      

        */


        //System.out.println("row: "+this.row+" column: "+this.column);
        
        int x=column,digit=0;
        while(x>0){
            x=x/10;
            digit+=1;
        }


        System.out.print("  +");
        for(int i=0;i<column;i++){
            System.out.print("---+");
        }

        for(int i=0;i<row;i++){
            
            //System.out.print("\n"+ (i+1)+" |");
            System.out.print("\n  |");

            for(int j=0;j<column;j++){
                System.out.print( " "+ board[i][j] +" |");
            }
            
            System.out.print(" "+(i+1)+"\n  +");

            for(int j=0;j<column;j++){
                System.out.print("---+");
            }
        }

        System.out.print("\n ");
        for(int d=digit-1; d>=0; d--){
            for(int i=0;i<column;i++){
                System.out.print("   "+((i+1)/(int)( Math.pow(10,d) ))%10 );
            }
            System.out.print("\n ");
        }
        

        System.out.println("");
    }

    
    public int getRow(){
        return this.row;

    }

    
    public int getColumn(){
        return this.column;
        
    }

    public char getCell(int rchoice,int cchoice){
        //System.out.println("rchoice: "+rchoice+" cchoice: "+cchoice);
        return this.board[rchoice][cchoice];
        
    }
    
    public void setCell(int rchoice,int cchoice,char symbol){
        
        this.board[rchoice][cchoice]=symbol;
        
    }
}



class Player{

    private String name;
    private int score;
    private char symbol;
    private static int no_player;

    public Player(String name, char symbol){
        
        this.name=name;
        this.symbol=symbol;
        this.score=0;
    }

    public static Player[] playerDetails(int no_player){
        Player.no_player=no_player;
        Scanner scan = new Scanner(System.in);

        Player pList[]=new Player[no_player];

        for(int i=0;i<no_player;i++){
        
            System.out.print("enter player"+(i+1)+" name:");
            String name = scan.nextLine();
            System.out.print("enter player"+(i+1)+" symbol:");
            char symbol =  scan.next().charAt(0); 
            scan.nextLine();  
            pList[i]=new Player(name,symbol);
        }

        return pList;
    }

    public static Player[] playerDetails(){
        Player.no_player=2;
        Scanner scan = new Scanner(System.in);

        Player pList[]=new Player[2];

        String name = new String("PLAYER 1");
        char symbol =  'X';   
        pList[0]=new Player(name,symbol);
        
        name = new String("PLAYER 2");
        symbol =  'O'; 
        pList[1]=new Player(name,symbol);
        
        return pList;
    }


    public static String dispPList(Player pList[]){
        String output="";
        System.out.println("SCORE-BOARD:\n");
        output=output+"\nSCORE-BOARD:\n\n";
        System.out.println("Name\tSymbol\tScore\n");
        output=output+"Name\tSymbol\tScore\n\n";
        for(int i=0;i<pList.length;i++){
            System.out.println(pList[i].getName()+"\t"+pList[i].getSymbol()+"\t"+pList[i].getScore()+"\n");
            output=output+pList[i].getName()+"\t"+pList[i].getSymbol()+"\t"+pList[i].getScore()+"\n\n";
        }

        return output;
    }


    public static Player[] playThrough(Board board, Player pList[]){ 

        Scanner scan = new Scanner(System.in);
        int moves=board.getRow()*board.getColumn(),pno=0,rchoice,cchoice;
        

        for(int i=0;i<moves;i++){
        
        ThreeInLine.title(); 
        System.out.println("remaining cells/moves:"+(moves-i)+"\n");
        board.dispBoard();
        Player.dispPList(pList);
        while(true){
                
            System.out.print("\n"+pList[pno].getName()+", enter row and coloumn: ");
            try{
                rchoice = scan.nextInt();
                cchoice = scan.nextInt();
                rchoice-=1;
                cchoice-=1;
            }
            catch(Exception e){
                System.out.print("Invalid Input, try again\n");
                scan.nextLine();
                continue;	
            }

            if( (0>rchoice || rchoice>=board.getRow() || 0>cchoice || cchoice>=board.getColumn() )|| (board.getCell(rchoice,cchoice)!=0) || ( rchoice!=(board.getRow()-1) && board.getCell(rchoice+1,cchoice)==0) ){
                System.out.print("wrong place, try again\n");
                continue;	
            }
            break;
            
        }

        board.setCell(rchoice,cchoice,pList[pno].getSymbol());
        if(board.checkWin(pList[pno].getSymbol(), rchoice ,cchoice)){
            pList[pno].setScore(pList[pno].getScore()+1);
        }
        else{
            //System.out.println("no_player:"+Player.no_player);
            pno=(pno+1)%Player.no_player;
            //System.out.println("no_player:"+Player.no_player);
            
        }
        
        

        }

        return pList;
    }


    public static String findWinner(Player pList[],Board board){
        Scanner scan = new Scanner(System.in);
        String output="";
        ThreeInLine.title();
        System.out.println("remaining cells/moves:0\n");
        board.dispBoard();
        
        int maxScore=pList[0].score;
        String winnerName=pList[0].name;
        boolean flag=true;
        for(int i=1;i<Player.no_player;i++){
            if(maxScore!=pList[i].score){
                flag=false;
                if(maxScore<pList[i].score){
                    maxScore=pList[i].score;
                    winnerName=pList[i].name;
                }
            }
            else{
                winnerName=winnerName+", "+pList[i].name;

            }
        }
        
        output=Player.dispPList(pList);
        System.out.print("\n");
        if(flag){
            System.out.println("DRAW!\n");
            output=output+"DRAW!\n\n\n";
        }
        else{
            System.out.println(winnerName+" Wins!\n");
            output=output+winnerName+" Wins!\n\n\n";
        }

        

        System.out.println("press enter to continue");
        scan.nextLine();


        return output;
    }


    public String getName(){
        return this.name;
    }

    
    public int getScore(){
        return this.score;
    }

    public void setScore(int score){
        this.score=score;
    }

    
    public char getSymbol(){
        return this.symbol;
    }
}




class ThreeInLine{
    
    public static void clrscr() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void title(){
        try{ ThreeInLine.clrscr(); }catch(Exception e){}
        for(int l=0;l<90;l++)
        System.out.print("-");
        System.out.print("\nThree In A Line\n");
        for(int l=0;l<90;l++)
        System.out.print("-");
        System.out.print("\n");

    }

    public static void instruction(){
        Scanner scan = new Scanner(System.in);
        System.out.print("INSTRUCTIONS:\n");
        for(int l=0;l<90;l++)
        System.out.print("-");
        System.out.print("\n1.You can only place your symbols starting from bottom up using displayed coordinates.\n2.Connect three symbols in a line to score a point.\n3.If you score a point you get another chance.\n4.If you connect three symbols, the location taken indicated by S.\n\npress enter to continue");
        scan.nextLine();

    }

    public static void mainMenu(){
        System.out.print("MAIN MENU:\n");
        System.out.print("\nPress 1 to create board with specific row and column.\nPress 2 to enter player details.\nPress 3 to start a game.\nPress 0 to quit.\n");
        System.out.print("choose: ");

    }



    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        
        int row=3, column=3, choice0, choice1, no_player=2;
        Player pList[]=Player.playerDetails();

        Board board=null;
        
        title();
        instruction();
        
        
        while(true){
            title();
            mainMenu();
            try{

                choice0 = scan.nextInt();

            if(choice0==0){
                try{ clrscr(); }catch(Exception e){}
                break;
            }
            else if(choice0==1){
                title();
                System.out.print("*note:minimum size of board is 3X3\nenter row and column: ");
                try{
                    row = scan.nextInt();
                    column = scan.nextInt();

                    if(row<3 || column<3 ){
                        throw new Exception();
                    }
                }
                catch(Exception e){
                    System.out.println("Invalid size, board size set to default(3X3)");
                    row=3;
                    column=3;
                    System.out.print("press enter to continue");
                    scan.nextLine();   
                    scan.nextLine();
                }
            }
            else if(choice0==2){
                title();
                //storePrevDetails(pList);
                System.out.print("*note:\nminimum no. of people is 2\nonly one character would be taken per user as symbol\nenter number of players:");
                try{
                    no_player = scan.nextInt();
                    if(no_player<2){
                        throw new Exception();
                    }
                    pList=Player.playerDetails(no_player);
                    
                }
                catch(Exception e){
                    System.out.println("Invalid number of players, no. of players set to default(2: PLAYER 1, PLAYER 2)");
                    no_player=2;
                    pList=Player.playerDetails();
                    System.out.print("press enter to continue");
                    scan.nextLine();   
                    scan.nextLine();
                }
                //Player.dispPList(pList);
            }
            else if(choice0==3){
                board=new Board(row,column);
                pList=Player.playThrough(board,pList);
                String output=Player.findWinner(pList,board);
                try{
                    WriteFile data = new WriteFile( "result.txt" , true );
                    data.writeToFile(output);
                }
                catch(IOException e){
                    System.out.println(e);    
                }
            }
            else{
                throw new Exception();
            }


            }
            catch(Exception e){
                System.out.println("Invalid Input, try again\npress enter to continue");
                    scan.nextLine();
                    scan.nextLine();
            }
             
        }

    }

}