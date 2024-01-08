import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Q12Swing{
    Q12Swing(){
      
    JFrame j= new JFrame("q12 swing main file");  
    j.setVisible(true);
    j.setSize(500,500);
    j.getContentPane().setBackground(Color.blue);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    j.setLayout(new FlowLayout());
    JButton buttonA= new JButton("A");
    JButton buttonB=new JButton("B");
    buttonA.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            new PI();
        }
    });
    

    buttonB.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
        new CgpaSwing();
        }
    });


    
    j.add(buttonA);
    j.add(buttonB);
   
    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Q12Swing();
            }
        });
    }
    
}
