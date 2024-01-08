class Theory{
    public static void main(String[] args) {
          int[] eg1={1,2,3,4};
          int sum=0;
           for(int x:eg1){
             sum=sum+x;
           }
           System.out.println("sum is"+sum);

    }

}


    
    



/* 
import java.awt.*;
import java.awt.event.*;
public class Theory extends Frame implements ActionListener{
    Label l1,l2,l3;
    Button YES,NO;
    public Theory(){

        this.setVisible(true);
        this.setSize(300,300);
        this.setBackground(Color.yellow);
        this.setTitle("yes and no");
	    this.setLayout(new FlowLayout());
        YES=new Button("yess");
        NO=new Button("noo");
        add(YES);
        add(NO);

        YES.addActionListener(this);
        NO.addActionListener(this);

        addWindowListener(new MyWindowAdapter());



    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==YES){
            l1= new Label("you pressed yes");
            add(l1);
            setVisible(true);
        }
        if(ae.getSource()==NO){
            l2= new Label("you pressed noo");
            add(l2);
            setVisible(true);
        }
        else{
            l3=new Label("you presseed nothing");
            add(l3);
        }
    }

    public static void main(String[] args) {
        
        Theory s = new Theory();
    
    }
  

}





class MyWindowAdapter extends WindowAdapter{
    public void Windowclosing(WindowEvent we){
        System.exit(0);
    }
}


*/

/* 
import java.awt.*;
import java.awt.event.*;

import javax.swing.ButtonGroup;
 

public class Theory extends Frame implements ActionListener{
    String msg=" ";
    Button NO, YES;
    public Theory(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(new Dimension(250,10));

        YES= new Button("yesss");
        NO= new Button("nooo");
        
        add(NO);
        add(YES);

        YES.addActionListener(this);
        NO.addActionListener(this);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });



    }

    public void actionPerformed(ActionEvent ae){
        String abc=ae.getActionCommand();
        if(abc.equals("yesss")){
             msg="you pressed yes";


        }
        else if(abc.equals("nooo")){
            msg="you pressed no";

       }

       else{
          msg="you didnt press";
       }

       repaint();
    }

    public void paint(Graphics g){
        g.drawString(msg,250,150);

    }


    public static void main(String[] args){
        Theory abc= new Theory();
        abc.setTitle("buttons");

    }




}

*abstract
/

//----------------------------------------------------------------------------------------------------------------------------
//read a.txt
//copy in b.txt
//after removing vowels

//part 3
/* 
import java.io.*;
class EditFile{
    public static void main(String args[]){
        int i;
        FileInputStream fin=null;
        FileOutputStream fout=null;
        if(args.length!=2){
            System.out.println("usage show file name");
            return ;
        }


        try{
            fin=new FileInputStream(args[0]);
            fout=new FileOutputStream(args[1]);
            do{
                i=fin.read();
                if(i!=-1){
                    System.out.print((char)i);
                }

                if(i!='a' && i!='e' && i!='i' && i!='o' && i!='u'){
                    fout.write(i);
                }
            }
            while(i!=-1);
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        catch(IOException e){
            System.out.println("i/0 exception found");
        }
        finally{
            try{
                if(fin!=null) fin.close();

            }
           
            catch(IOException e1){
                System.out.println("error closing file");
            }

            try{
                if(fout!=null) fout.close();

            }
           
            catch(IOException e2){
                System.out.println("error closing file");
            }
        }
    }
}


*/

//part 2
/*import java.io.*;
class CopyFile{
    public static void main(String args[]){
        int i;
        FileInputStream fin=null;
        FileOutputStream fout=null;
        if(args.length!=2){
            System.out.println("usage show file name");
            return ;
        }


        try{
            fin=new FileInputStream(args[0]);
            fout=new FileOutputStream(args[1]);
            do{
                i=fin.read();
                if(i!=-1){
                    System.out.print((char)i);
                }

                if(i!=-1){
                    fout.write(i);
                }
            }
            while(i!=-1);
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        catch(IOException e){
            System.out.println("i/0 exception found");
        }
        finally{
            try{
                if(fin!=null) fin.close();

            }
           
            catch(IOException e1){
                System.out.println("error closing file");
            }

            try{
                if(fout!=null) fin.close();

            }
           
            catch(IOException e2){
                System.out.println("error closing file");
            }
        }
    }
}



 */












//part 1 of question.
/* import java.io.*;
class ShowFile{
    public static void main(String args[]){
        int i;
        FileInputStream fin=null;
        if(args.length!=1){
            System.out.println("usage show file name");
            return ;
        }


        try{
            fin=new FileInputStream(args[0]);
            do{
                i=fin.read();
                if(i!=-1){
                    System.out.print((char)i);
                }
            }
            while(i!=-1);
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        catch(IOException e){
            System.out.println("i/0 exception found");
        }
        finally{
            try{
                if(fin!=null) fin.close();

            }
            catch(IOException e){
                System.out.println("error closing file");
            }
        }
    }
}




*/











//question 2 ka c part (ppr1)
/*
class question{
    public int sum(int a,int b){
        return a+b;
    }

}
class Theory{
    public static void main(String args[]){
       question obj1=new question();
       int ans=obj1.sum(2, 3);
       System.out.println(ans);
    }
}

*/

//---------------------------------------------




//question 1 (j) questionppr1
/* 
class Shape{
    void show(){
        System.out.println("superclass show");

    }

}

class Rectangle extends Shape{
    void show(){
        System.out.println("show of rectangle class");
    }

}

class Triangle extends Shape{
    void show(){
        System.out.println("show of trianglr");
    }
}

class Theory{
    public static void main(String args[]){
        Shape obj1=new Shape();
        Triangle obj2=new Triangle();
        Rectangle obj3= new Rectangle();

        Shape ref;
        ref=obj1;
        ref.show();
        ref=obj2;
        ref.show();
        ref=obj3;
        ref.show();

    }
}

 */


/* 
interface Example1{
    abstract void area(int r);
    abstract void message();
}

interface Example2{
    abstract void callback(int parm);
}


class Theory implements Example1,Example2 {
    public void area(int r){
        System.out.println("area of example 1"+r);
    }
    public void message(){
        System.out.println("message of example 1");
    }
    public void callback(int parm){
        System.out.println("parm of example 2"+ parm);

    }
    public void newMethod(){
        System.out.println("this class can define its own method as well");
    }

    public static void main(String args[]){
        
       Theory obj1=new Theory() ;
       obj1.area(5);
       obj1.callback(67);

    }
}



*/



//------------------------------------------------------------------------------------------------------------------------------//
//question 1 (f) paper 1
/* 
class TwoDshape{
    public int radius;
    public TwoDshape(){
        this.radius=10;
    }
    public TwoDshape(int r){
         radius=r;
    }
}

class Circle extends TwoDshape{
    public int a;
    public int radius;
    public Circle(){
        super();
    }
    public Circle(int r){
        super(r);


    }
    void area(){
        a=3* (radius*radius);
        System.out.println("the area of circle is:"+a);
    }
}


class Theory {
    public static void main(String args[]){
        Circle obj1;
        obj1=new Circle();
        obj1.area();
       

    }
}


*/