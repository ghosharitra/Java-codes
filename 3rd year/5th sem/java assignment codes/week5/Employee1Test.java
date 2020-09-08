import java.util.Scanner;
class Employee1{
private String emp_name;
private int emp_id;
private double salary;

public Employee1(String emp_name,int emp_id,double salary){
this.emp_name=emp_name;
this.emp_id=emp_id;
this.salary=salary;
}
public String getName(){
return emp_name;
}
public int getId(){
return emp_id;
}
public double getSalary(){
return salary;
}
}

class Employee1Test{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
String emp_name;
int emp_id,n,i;
double salary;

System.out.print("enter number of employees: ");
n=scan.nextInt();
Employee1 e[]=new Employee1[n];

for(i=0;i<n;i++){
System.out.print("enter a employee id: ");
emp_id=scan.nextInt(); 
scan.nextLine();
System.out.print("enter employee name: ");
emp_name=scan.nextLine();
System.out.print("enter salary: ");
salary=scan.nextDouble();
e[i]=new Employee1(emp_name, emp_id, salary);
}

System.out.println("Emp ID\tEmp Name\tSalary");

for(i=0;i<n;i++){
System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t\t"+e[i].getSalary());        
}

}}