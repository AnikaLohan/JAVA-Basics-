import java.awt.*;
import java.awt.event.*;

// MouseEvents is both the source and listener for our events
public class MouseEventsTest extends Frame implements MouseListener, WindowListener {

	String msg = "Hello";
	int mouseX , mouseY ;

	//Register listeners in constructor
	public MouseEventsTest() {
		addMouseListener(this); 
		
		addWindowListener(this);
	}

	// Handle mouse clicked.
	public void mouseClicked(MouseEvent me) {
		mouseX=100; mouseY=100;
		msg = "Mouse clicked.";
		repaint();
	}

	// Handle mouse entered.
	public void mouseEntered(MouseEvent me) {
	// save coordinates
		mouseX = 50;
		mouseY = 100;
		msg = "Mouse entered.";
		setSize(600,600);
		setBackground(Color.yellow);
		repaint();
	}
	
	// Handle mouse exited.
	public void mouseExited(MouseEvent me) {
	// save coordinates
		mouseX = 50;
		mouseY = 100;
		msg = "Mouse exited.";
		setSize(300,300);
		repaint();
	}

	// Handle button pressed.
	public void mousePressed(MouseEvent me) {
	// save coordinates
		mouseX = 50;
		mouseY = 100;
		msg = "Down";
		repaint();
	}

	// Handle button released.
	public void mouseReleased(MouseEvent me) {
	// save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Up";
		repaint();
	}

	// Display msg at current X,Y location.
	public void paint(Graphics g) {
		
		g.setColor(Color.black); //Used to set the font color
		g.drawString(msg, mouseX, mouseY); //Used to display a msg at coordinates mouseX and mouseY

	}
	public void windowActivated(WindowEvent we){
		
	}

	public void windowClosed(WindowEvent we){
		
	}

	public void windowDeactivated(WindowEvent we){
		
	}

	public void windowDeiconified(WindowEvent we){
		
	}

	public void windowIconified(WindowEvent we){
		
	}

	public void windowOpened(WindowEvent we){
		
	}

	public void windowClosing(WindowEvent we){
		System.exit(0);
	}

	public static void main(String[] args)
	{
		MouseEventsTest obj = new MouseEventsTest();

		obj.setSize(new Dimension(300, 300));
		obj.setTitle("Mouse Events Demo");
		obj.setVisible(true);
	}
}