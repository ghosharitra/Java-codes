import java.util.*;
class Staff{

    protected int code;
    protected String name;
    public Staff(int code,String name){
        this.code=code;
        this.name=name;
    }
    public void print(){

        System.out.println("code= "+code);
        System.out.println("name= "+name);

    }
}
class Typist extends Staff{

    protected double speed;
    public Typist(int code,String name,double speed){

        super(code,name);
        this.speed=speed;
    }
    public void print(){

        super.print();
        System.out.println("speed= "+speed);
    }
}
class RegularTypist extends Typist{

    protected int remuneration;
    public RegularTypist(int code,String name,double speed,int remuneration){
        super(code,name,speed);
        this.remuneration=remuneration;
    }
    public void print(){

        super.print();
        System.out.println("remuneration= "+remuneration);


    }
}
class Drive{
    public static void main(String args[]){

        int a,d;
        String b;
        double c;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter code,name,speed and remunation :");
        a=scan.nextInt();
        scan.nextLine();
        b=scan.nextLine();
        c=scan.nextDouble();
        d=scan.nextInt();
        RegularTypist f=new RegularTypist(a,b,c,d);
        f.print();
    }
}