import java.awt.*;
import java.awt.event.*;
class HelloWorld extends Frame implements ActionListener{
    
    Label y, n;
    Button YES,NO;
    HelloWorld()
    {
        this.setVisible(true);
        this.setSize(300,300);
        this.setBackground(Color.yellow);
        this.setTitle("yes and no");
	  this.setLayout(new FlowLayout());
        YES = new Button("yes");
        this.add(YES);
        NO = new Button("No");
        this.add(NO);
        
		YES.addActionListener(this);
    	NO.addActionListener(this);
        
        
        addWindowListener(new MyWindowAdapter());
       
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==YES)
        {
            y= new Label("yes is pressed");
            this.add(y);
            setVisible(true);
			
        }
        else if(e.getSource()==NO)
        {
            n= new Label("no is pressed");
            this.add(n);
            setVisible(true);
        }
    }
    public static void main(String[] args) {
        
        HelloWorld s = new HelloWorld();
       
       
    }
}


class MyWindowAdapter extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}