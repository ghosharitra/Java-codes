import java.util.Scanner;
class Employee{
private String emp_name;
private int emp_id;
private double basic_salary,gross_salary;

public Employee(String emp_name,int emp_id,double basic_salary){
this.emp_name=emp_name;
this.emp_id=emp_id;
this.basic_salary=basic_salary;
gross_salary=grossSalary();
}
public double grossSalary(){
double b,c,ot;
Scanner scan=new Scanner(System.in);
System.out.print("enter bonus: ");
b=scan.nextDouble();
System.out.print("enter commission: ");
c=scan.nextDouble();
System.out.print("enter overtime pay: ");
ot=scan.nextDouble();
return basic_salary+b+c+ot;
}
public String getName(){
return emp_name;
}
public int getId(){
return emp_id;
}
public double getBaseSalary(){
return basic_salary;
}
public double getGrossSalary(){
return gross_salary;
}
}

class EmployeeTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
String emp_name;
int emp_id,n,i;
double basic_salary;
String name;
System.out.print("enter number of employees: ");
n=scan.nextInt();
Employee e[]=new Employee[n];

for(i=0;i<n;i++){
System.out.print("enter a employee id: ");
emp_id=scan.nextInt(); 
scan.nextLine();
System.out.print("enter employee name: ");
emp_name=scan.nextLine();
System.out.print("enter basic salary: ");
basic_salary=scan.nextDouble();
e[i]=new Employee(emp_name, emp_id, basic_salary);
}

System.out.println("Emp ID\tEmp Name\tBasic Salary\tGross Salary");

for(i=0;i<n;i++){
System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t\t"+e[i].getBaseSalary()+"\t\t"+e[i].getGrossSalary());        
}

}}