import java.util.Scanner;

class MaxOfThree{
 public static void main(String args[]){
   
    int max=0,i;
    int a[]=new int [3];
    System.out.print("enter 3 number: ");
    Scanner s=new Scanner(System.in);
    for(i=0;i<3;i++)
    a[i]=s.nextInt();
    
    for(i=0;i<3;i++){ 
        if(max<a[i])
            max=a[i];    
    }       
        System.out.println(max);
 }   
}