import java.awt.Graphics;
import javax.swing.JApplet;

class Prog13 extends JApplet
{
	
	public void paint(Graphics g)
	{
		int counter=1;
		while(counter<10)
		{
			g.drawOval(110-counter*10,110-counter*10,counter*20,counter*20);
			++counter;
		}
	}
	

}