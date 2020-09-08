/*
<applet code="RGB"
width="700"
height="700"></applet>
*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class RGB extends Applet{
public void init(){

Button red,green,blue;

red=new Button("RED");
green=new Button("GREEN");
blue=new Button("BLUE");

red.setBounds(300, 100, 50, 20);
green.setBounds(300, 130, 50, 20);
blue.setBounds(300, 160, 50, 20);

add(red);
add(green);
add(blue);

red.addActionListener(new MyActionListener(this));
green.addActionListener(new MyActionListener(this));
blue.addActionListener(new MyActionListener(this));

}

}

class MyActionListener implements ActionListener{

RGB b;
public MyActionListener(RGB b){
this.b=b;
}

public void actionPerformed(ActionEvent e){
String s=e.getActionCommand();
if(s.equals("RED")){
b.setBackground(Color.RED);
}
else if(s.equals("GREEN")){
b.setBackground(Color.GREEN);
}
else if(s.equals("BLUE")){
b.setBackground(Color.BLUE);
}

}
}
