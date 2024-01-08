import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame{
    JLabel label1; 
    JButton button1;
    Demo(){
    
       //label
       this.setVisible(true);
       this.setTitle("swing");
       this.setSize(new Dimension(100,200));
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(null);

       //background color..layer 
       this.getContentPane().setBackground(Color.green);


       label1= new JLabel("welcome to my practice");
       this.add(label1);
       label1.setBounds(102, 95, 290, 71);
       label1.setFont(new Font("Arial",Font.BOLD,16));
       //button
       button1=new JButton("click me");
       this.add(button1);
       button1.setBounds(160,170,150,30);
       button1.setBackground(Color.CYAN);
       button1.setFont(new Font("consolas",Font.BOLD,3));
       


       
    }
    public static void main(String[] args){
           new Demo();
    }
}