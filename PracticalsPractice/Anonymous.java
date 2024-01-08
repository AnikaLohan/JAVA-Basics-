
import java.awt.*;
import java.awt.event.*;
public class Anonymous extends Frame {
    public Anonymous(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                System.out.println("Mouse pressed");
            }
            public void mouseExited(MouseEvent me){
                setSize(500,500);
            }
            public void mouseEntered(MouseEvent me){
                setSize(500,500);
                setBackground(Color.yellow);
    
            }
        });

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                    System.exit(0);
            }
        });


    }

    public static void main(String args[]){
       
       Anonymous obj2= new Anonymous();
        obj2.setVisible(true);
        obj2.setBackground(Color.pink);
        obj2.setLayout(new FlowLayout());
        obj2.setSize(500,500);
        
    }



    
}
