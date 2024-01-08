import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


//type 1.
/* 
public class Demo1 {
    public static void main(String [] args){
        JFrame frame=new JFrame;
        frame.setVisible(true);
        frame.setSize(400,450);
    } 
    
}
*/
//type 2

public class Demo1 extends JFrame{
    
    Demo1(){
        this.setVisible(true);
        this.setSize(40,450); 
        this.setTitle("swing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        new Demo1();
    }

}



