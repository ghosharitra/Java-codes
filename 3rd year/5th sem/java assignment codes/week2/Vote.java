import java.util.*;

class Vote{

public static void main(String args[]){

Scanner scan=new Scanner(System.in);
int i,j,c,a[],t;
a=new int[6];
a[0]=a[1]=a[2]=a[3]=a[4]=a[5]=0;

System.out.print("do you want to cast vote, press 1 for yes and 0 for no: ");
t=scan.nextInt();
while(t==1){
c=scan.nextInt();
switch (c){
case 1:a[0]++;
	break;
case 2:a[1]++;
	break;
case 3:a[2]++;
	break;
case 4:a[3]++;
	break;
case 5:a[4]++;
	break;
default:a[5]++;
}

System.out.print("do you want to cast vote, press 1 for yes and 0 for no: ");
t=scan.nextInt();
}


for(i=0;i<5;i++){
j=i+1;
System.out.println("votes for candidate"+  j+" : "+a[i]);
}

System.out.println("spoilt ballot votes: "+a[5]);

}

}
