import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo implements ItemListener {
    JLabel jlab;
    public JCheckBoxDemo(){
        JFrame j=new JFrame("JcheckboxDemo");
        j.setLayout(new FlowLayout());
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(250,100);

        JCheckBox cb= new JCheckBox("C");

        cb.addItemListener(this);
        j.add(cb);

        cb=new JCheckBox("c++");
        cb.addItemListener(this);
        j.add(cb);

        jlab= new JLabel("select language");
        j.add(jlab);
        

        j.setVisible(true);

    }

    public void itemStateChanged(ItemEvent ie){
        JCheckBox cb=( JCheckBox)ie.getItem();
        
    }
    
}
