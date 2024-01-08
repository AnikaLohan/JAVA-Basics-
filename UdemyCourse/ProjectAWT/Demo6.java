import java.awt.*;


public class Demo6 extends Frame {
    Label lbl_username, lbl_password,lbl_tech,lbl_place , lbl_qua;
    TextField txt1,txt2;
    Button submit;
    List l;
    Choice c;
    Checkbox cb1,cb2,cb3,cb4;

   
    //sytax: new List(number of direct visible rows,multislectmode)
    //multiselect mode has 2 options: true (multiple optiosn can be selected)    false(new option)
    //list and choices are new here
    //list : accepts multiple elements in scrolling fashion.  
    //0th index :1st element
    //5 direct visible rows.
    //1. add("data science")    2. add("anika",2)
    //1.remove(3)   2.remove("hello")
    //getitemcount()


    //choice: one choice accpeted in drop fashion.




    //checkbox:
    //new Checkbox("");
    //new Checkbox("label",state)
    //state- true(pre checked)

    //create radio buttons with checked box


    
    Demo6(){
        this.setVisible(true);
        this.setSize(300, 350);
        this.setTitle("registration form");

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
           


        lbl_tech=new Label("tech");

        l=new List(3,true);
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        this.add(lbl_tech);
        this.add(l);


        lbl_place=new Label("places:");
        c=new Choice();
        c.add("A");
        c.add("B");
        c.add("C");
        c.add("D");
        c.add("E");
        this.add(lbl_place);
        this.add(c);
        //no add method for index
        //c.insert(): used



         lbl_qua=new Label("qualification");
         this.add(lbl_qua);
         cb1=new Checkbox("high school",true);
        cb2=new Checkbox("college");
        add(cb1);
        add(cb2);

         //radio button
         //Label gender_name("gender will be shown:")=new Label();
         CheckboxGroup cg=new CheckboxGroup();
        cb3=new Checkbox("option1",cg,true);
        cb4=new Checkbox("option2",cg,true);

        add(cb3);
        add(cb4);


    }
    public static void main(String[] args){
        new Demo6();
    }
}
    