//mouse event handling
import java.awt.*;
import java.awt.event.*;
public class AnonymousInnerClassDemo extends Frame{
    String msg=" ";
    public AnonymousInnerClassDemo(){
        addMouseListener(new MouseAdapter(){
              public void mousePressed(MouseEvent me){
                msg="Mouse Pressed";
                repaint();
              }
        }
    );
    addWindowListener(new WindowAdapter(){


    });

    }
}