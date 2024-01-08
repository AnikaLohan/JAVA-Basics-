import java.awt.*;
import java.awt.event.*;
public class Cgpa extends Frame{
    Label L;
    Cgpa(){
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("demo8");
        this.setBackground(Color.blue);
        this.setLayout(new FlowLayout());
        L=new Label("cgpa");
        add(L);
        this.addWindowListener(new MyListenerCGPA());
   
    }

    public static void main(String [] args){
        new Cgpa();
           
    
    }
}



class MyListenerCGPA extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}