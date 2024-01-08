import java.awt.*;
import java.awt.event.*;


public class Q10 extends Frame implements ActionListener {
    Button b1,b2;
    Q10(){
        this.setSize(300,300);
        this.setTitle("q10");
        this.setBackground(Color.PINK);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        b1=new Button("RED");
        b2=new Button("BLUE");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        //b1.setBackground(Color.red);
        b2.addActionListener(this);
        //b2.setBackground(Color.blue);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });


    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setBackground(Color.red);

        }
        else if(ae.getSource()==b2){
            this.setBackground(Color.blue);

        }
    }

    public static void main(String args []){
        new Q10();
    }
    
}
