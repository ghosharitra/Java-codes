interface Player{

void play();    
}

class Child implements Player{
public void play(){
System.out.println("child plays games");
}
}

class Musician implements Player{
public void play(){
System.out.println("Musician plays music");
}
}

class Actor implements Player{
public void play(){
System.out.println("Actor plays character");
}
}
class QSevenTest{
public static void main(String args[]){
Player p;
p=new Child();
p.play();
p=new Musician();
p.play();
p=new Actor();
p.play(); 
}
}