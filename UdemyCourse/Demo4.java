import java.awt.*;
import javax.swing.*;

public class Demo4 extends JFrame {
    JLabel label1,label2;
    JButton button1,button2;
    JTextField f1,f2;

    Demo4(){
     this.setVisible(true);
     this.setSize(400,450);
     this.setTitle("registration form");
     this.getContentPane().setBackground(Color.BLUE);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLayout(null);
     label1=new JLabel("username");
     label1.setBounds(10,10,80,30);
     this.add(label1);
     f1=new JTextField(15);
     f1.setBounds(80,12,120,25);
     this.add(f1);
     label2=new JLabel("password");
     label2.setBounds(10,40,80,30);
     this.add(label2);

     f2=new JTextField(15);
     f2.setBounds(100,200,120,250);
     this.add(f2);

    }
    public static void main(String[] args){
        new Demo4();
    }
    
}
