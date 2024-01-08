import java.awt.*;
import java.awt.event.*;



public class Demo6 extends Frame{


	Demo6(){
	 this.setVisible(true);
	 this.setSize(200,200);
	 this.setTitle("Demo6");
	 this.setBackground(new Color(35,15,55));	
	 
	 this.addMouseListener(new MyMouseListener());
	 
}
class MyMouseListener extends MouseAdapter{
	public void mouseEntered(MouseEvent me){
		setSize(600,600);}
		public void mouseClicked(MouseEvent me){
		setSize(200,200);
		}
		public void mouseExited(MouseEvent me){
			System.exit(0);
		}
	}



public static void main(String[] args){
	Demo6 obj=new Demo6();
	
}
}


class MyListener extends WindowAdapter{
 
public void windowClosing(){
	
	System.exit(0);

		}
}