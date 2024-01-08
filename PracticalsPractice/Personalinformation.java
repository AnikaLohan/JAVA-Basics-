import java.awt.*;
import java.awt.event.*;
public class Personalinformation extends Frame{
    Label P;
    Personalinformation(){
        this.setVisible(true);
        this.setTitle("persnoanl info");
        this.setBackground(Color.PINK);
        this.setSize(300,300);
        this.setLayout(new FlowLayout());
        P=new Label("personal info");
        add(P);
        
    addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });
}
    

    public static void main(String [] args){
        new Personalinformation();
    }

    }
   
    
    

