import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class PI {
    PI(){
        JFrame j=new JFrame("personal information by swing");
        j.setVisible(true);
        j.setSize(300,300);
        j.setLayout(new FlowLayout());
        j.getContentPane().setBackground(Color.cyan);
        JLabel l= new JLabel("my personal info");
        j.add(l);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new PI();
            }
        });
        }
    }



