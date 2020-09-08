/*<applet code="MyApplet"
          width=800
          height=800>
</applet>
*/

import java.awt.*;
import java.applet.*;

public class MyApplet extends Applet
{
    public void init(){
        Font f= new Font("Default",Font.PLAIN,12);
        setBackground(Color.BLUE);
        setForeground(Color.WHITE);
        setFont(f);
    }

    public void paint(Graphics g)
    {
        g.drawString("HI!this is my first java applet",100,500);
        showStatus("Hello Applet");
    }
}
