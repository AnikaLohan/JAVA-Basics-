import java.awt.*;


public class Demo5 extends Frame {
    Label lbl_username, lbl_password;
    TextField txt1,txt2;
    Button submit;
    
    Demo5(){
        this.setVisible(true);
        this.setSize(300, 350);
        this.setTitle("TEXT DEMO");

        this.setBackground( Color.red);
        this.setLayout(new FlowLayout());
    
        
        lbl_username=new Label("username");
        lbl_username.setFont(new Font("Arial",Font.BOLD,20));
        this.add(lbl_username);
        txt1=new TextField(30);
        this.add(txt1);
      
        lbl_password=new Label("password");
        this.add(lbl_password);

        txt2=new TextField(30);
        txt2.setEchoChar('*');
        this.add(txt2);
        

        submit=new Button("login");
        submit.setFont(new Font("consolas",Font.BOLD,20));
        this.add(submit);
        


    }
    public static void main(String[] args){
        new Demo5();
    }
}
    

