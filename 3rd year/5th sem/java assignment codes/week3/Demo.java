import java.util.Scanner;
class Grader{
private int score;
public Grader(int m){
this.score=m;
}
public void letterGrade(){
if(90<this.score && this.score<=100)
System.out.println("O");    
else if(80<this.score && this.score<=90)
System.out.println("E");    
else if(70<this.score && this.score<=80)
System.out.println("A");
else if(50<this.score && this.score<=70)
System.out.println("B");
else if(35<this.score && this.score<=50)
System.out.println("C");
else
System.out.println("F");
}
}
class Demo{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int m=scan.nextInt();
if(0<=m && m<=100){
Grader a =new Grader(m);
a.letterGrade();
}}}