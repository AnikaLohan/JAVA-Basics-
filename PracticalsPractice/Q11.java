import java.awt.*;
import java.awt.event.*;
//inner adapter class 
public class Q11 extends Frame{
    Label l;
    public Q11(){
    this.setVisible(true);
	this.setSize(1000,1000);
	this.setTitle("Q11");
	this.setBackground(new Color(20,100,102));
	this.setLayout(new FlowLayout());
	l = new Label();
	this.add(l);
    addKeyListener(new MyKeyAdapter());
    addWindowListener(new MyWindowAdapter());

    }

    class MyKeyAdapter extends KeyAdapter{
            public void keyTyped(KeyEvent ke){
                l.setText(l.getText() + " \n " + " character entered is : " + ke.getKeyChar());
    
            }

        }
    
    public static void main(String args[]){
        new Q11();

    }
}

//just adapter class
class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}



