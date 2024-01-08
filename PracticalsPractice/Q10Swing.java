import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Q10Swing extends JFrame implements ActionListener {
    JButton b1,b2;
    Q10Swing(){
        //JFrame j= new JFrame("q10 swing");
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(Color.PINK);
        this.setSize(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1=new JButton("red");
        b2=new JButton("blue");
        this.add(b1);
        this.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.getContentPane().setBackground(Color.RED);

        }
        else if(ae.getSource()==b2){
            this.getContentPane().setBackground(Color.BLUE);

        }
     
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Q10Swing();
            }

        });
    }
}
