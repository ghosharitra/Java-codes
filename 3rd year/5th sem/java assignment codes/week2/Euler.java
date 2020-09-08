class Euler{ 
 
public static void main(String args[]){ 
 
double a=1,s=1;   
int n=1,nf=1;   

while (a>=0.00000001){    
nf=nf*n;
a=1.0/nf;    
s=s+a;   
n++;
}     
System.out.println("value of e is: "+s);    
} 
 
} 