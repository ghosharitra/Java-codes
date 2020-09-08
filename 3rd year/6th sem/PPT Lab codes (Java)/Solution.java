import java.util.*;
import java.util.regex.*;

// Write your code here. DO NOT use an access modifier in your class declaration.


class Parser{


    boolean isBalanced(String s){


        //System.out.println("in here");
        int n=s.length();
        //System.out.println("len:"+n);
        if (n==0){
            return true;
        }
        char stack[]=new char[n];
        int top=-1;
        for(int i=0;i<n;i++){
            //System.out.println("i:"+i);
        
            if(s.charAt(i)==')'){
            //System.out.println("top:"+top);
            if(top!=-1 && stack[top]=='('){
            top=top-1;
            }
            else{
                return false;
            }
        
        }
        else if(s.charAt(i)==']'){
            //System.out.println("top:"+top);
            if(top!=-1 && stack[top]=='['){
            top=top-1;
            }
            else{
                return false;
            }
        }
        else if(s.charAt(i)=='}'){
            //System.out.println("top:"+top);
            if(top!=-1 && stack[top]=='{'){
            top=top-1;
            }
            else{
                //System.out.println("top:"+top);
                return false;
            }
        }
        else if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' ){
            top=top+1;
            stack[top]=s.charAt(i);

        }
        
        }
        
        if(top!=-1){
            //System.out.println("top:"+top);
            return false;
        }
        else{
            //System.out.println("top:"+top);
            return true;
        }
        
        
        }
        

}

class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);
        
        
        String s=in.nextLine();
        System.out.println("str:"+s);
        System.out.println(parser.isBalanced(s));

		in.close();
	}
}
