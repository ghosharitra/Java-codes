import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code=ButtonApplet
           width=500
           height=500
>
</applet>
*/

public class ButtonApplet1 extends Applet implements ActionListener
{
	String msg=null;
	Button yes,no,maybe;
	public void init()
	{		
		yes=new Button("YES");
		no=new Button("NO");
		maybe=new Button("MAYBE");
		yes.setBounds(20,40,100,20);
		no.setBounds(20,80,100,20);
		maybe.setBounds(20,120,100,20);	
		add(yes);
		add(no);
		add(maybe);			
		//yes.addActionListener(this);
		//no.addActionListener(this);
		//maybe.addActionListener(this);		
    }
    
    
	public void actionPerformed(ActionEvent ae)
	{			
			String s=ae.getActionCommand();
			//this.setFont(new Font("Dialog",Font.BOLD,16));
			if(s.equals("YES"))
				this.msg="You have Pressed YES";
			else if(s.equals("NO"))
				this.msg="You have Pressed NO";
			else				
				this.msg="You have Pressed MAYBE";
			this.repaint();								
    }	
    
	public void paint(Graphics g)
	{		
        g.drawString(msg,20,160);
        //yes.setFont(new Font("Dialog",Font.PLAIN,50));
	}
}
