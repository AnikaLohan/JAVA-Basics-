import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CgpaSwing extends JFrame {

    CgpaSwing(){
    JFrame F=new JFrame("q12 by swing");
    F.setSize(275,100);
    F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label1= new JLabel("CGPA");
    F.add(label1);
    F.setVisible(true);
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
            new CgpaSwing();
        }
    });

        
    }
    
    

    
}
