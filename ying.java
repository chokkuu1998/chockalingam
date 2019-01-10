import java.awt.*;
import java.applet.*;

public class YinYang extends Applet 
{


    public void paint (Graphics g)
    {

	int R = 120; 
	int dotR = R/12;

	
	int xPos = 240;
	int yPos = 240;
		
	setBackground(Color.red);

	g.setColor(Color.white);
	g.fillArc(xPos - R, yPos - R, 2*R, 2*R, 90, 180);

	g.setColor(Color.black);
	g.fillArc(xPos - R, yPos - R, 2*R, 2*R, 270, 180);
	g.fillArc(xPos - R/2, yPos, R, R, 90, 180);

	g.setColor(Color.white);
	g.fillArc(xPos - R/2, yPos - R, R, R, 270, 180);

	g.fillOval(xPos - dotR , yPos + R/2 - dotR, 2*dotR, 2*dotR);

	g.setColor(Color.black);
	g.fillOval(xPos - dotR , yPos - R/2 - dotR, 2*dotR, 2*dotR);

    }
}
