import java.awt.*;
import java.awt.event.*;
public class Separate extends Frame{
    public Separate(){
        
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }
    public static void main(String args []){
        Separate obj2= new Separate();
        obj2.setVisible(true);
        obj2.setBackground(Color.pink);
        obj2.setLayout(new FlowLayout());
        obj2.setSize(500,500);
    }    
}
class MyMouseAdapter extends MouseAdapter{
    Separate obj1;
    public MyMouseAdapter(Separate obj1){
        this.obj1=obj1;
    }
    public void mousePressed(MouseEvent me){
        System.out.println("mouse is clicked or pressed");
     
    }

    public void mouseExcited(MouseEvent me){
        obj1.setSize(500,500);
    }

    public void mouseEntered(MouseEvent me){
        obj1.setSize(1000,1000);
        obj1.setBackground(Color.yellow);
    }
}

class MyWindowadapter extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}