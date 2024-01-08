import java.awt.*;
import java.awt.event.*;

public class Same extends Frame{
    String msg=" ";
    public Same(){
        addMouseListener(new MyMouseAdapter());
        addWindowListener(new MyWindowadapter());
        this.setVisible(true);
        this.setBackground(Color.pink);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
    }
  

    class MyMouseAdapter extends MouseAdapter{
        public void mousePressed(MouseEvent me){
            System.out.println("mouse is clicked or pressed");
            //msg="mouse is clicked or pressed";
            setSize(250,250);
            //repaint();
        }

        public void mouseExited(MouseEvent me){
            setSize(500,500);
        }

        public void mouseEntered(MouseEvent me){
            setSize(500,500);
            setBackground(Color.yellow);


        }
    }

   /*
   public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
    } */ 

    class MyWindowadapter extends WindowAdapter{
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    }

    public static void main(String []args){
        new Same();
    }
    
}



