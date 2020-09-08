import java.util.Scanner;

class TwentyFive{
protected int id;
protected int marks;

public void exam(int id,int marks)throws Exception{
this.id=id;
if ((0>marks || marks>100)){
this.marks=0;   
throw new ScoreException();    
}
this.marks=marks;
}

public int getId(){
return id;
}

public int getMarks(){
return marks;
}
}

class ScoreException extends Exception{
public String toString(){
return "ScoreException: score must be between 0 to 100";
}
}

class TwentyFiveTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
TwentyFive obj[]=new TwentyFive[5];
for(int i=0;i<5;i++){
try{
obj[i]=new TwentyFive();
System.out.print("id "+i+" marks: ");
obj[i].exam(i,scan.nextInt());
}
catch(Exception a){
System.out.println(a);
}
}
System.out.println("id marks");
for(int i=0;i<5;i++){
System.out.println( obj[i].getId()+"\t"+obj[i].getMarks());
}
    



}}