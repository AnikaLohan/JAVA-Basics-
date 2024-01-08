import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q11Swing extends JFrame {
    public JLabel l;
    Q11Swing(){
    JFrame j= new JFrame("q11 by swing");
    j.setVisible(true);
    l=new JLabel();
    j.add(l);
    j.setSize(500,250);
    j.setLayout(new FlowLayout());
    //j.setContentPane().setBackground(Color.PINK);
    j.addKeyListener(new MyKeyListener());
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

    class MyKeyListener extends KeyAdapter{
        public void keyTyped(KeyEvent me)
        {
            l.setText(l.getText() + " \n " + " character entered is : " + me.getKeyChar());
    
        }
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Q11Swing();
            }
        });
    }



    


    
}



