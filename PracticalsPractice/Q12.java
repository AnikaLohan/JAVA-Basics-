//package PracticalsPractice;
import java.awt.*;
import java.awt.event.*;

public class Q12 extends Frame implements ActionListener {
    Button bA,bB;
    Label L;
    Q12(){
        this.setVisible(true);
	    this.setSize(500,500);
	    this.setTitle(" Q12 ");
	    this.setBackground(new Color(20,100,102));
	    this.setLayout(new FlowLayout());
        bA= new Button("A");
        this.add(bA);
        bB= new Button("B");
        this.add(bB);
        L=new Label("is it visible");
        add(L);
        bA.addActionListener(this);
        bB.addActionListener(this);


        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

    }


    public void actionPerformed(ActionEvent ae){
	
		if(ae.getSource()==bA){
			new Personalinformation();}
			if(ae.getSource()==bB){
			new Cgpa();
			}
			
	
    }


public static void main(String[] args){
    Q12 obj1=new Q12();
    obj1.setSize(new Dimension(500,500));
    obj1.setVisible(true);
    obj1.setTitle("Q12 WITH AWT");

   }

}




