//package ProjectAWT;

import java.awt.*;

public class Demo3 extends Frame {
    Demo3(){
        this.setVisible(true);
        this.setSize(300, 350);
        this.setTitle("LABEL DEMO");

        this.setBackground(new Color(22,215,150));
        //this.setLayout(new FlowLayout());
        Label ibl_username=new Label("username");
        this.add(ibl_username);
        ibl_username.setBounds(10, 10, 100, 100);
        Label ibl_password=new Label("password");
        ibl_password.setBounds(10, 111, 100, 100);
        this.add(ibl_password);



    }
    public static void main(String[] args){
        new Demo3();
    }
}
