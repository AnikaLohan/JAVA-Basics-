public class Complex {
    double x,y;
    Complex(double real,double imag){
    this.x=real;
    this.y=imag;
    }


public static Complex sum(Complex c1,Complex c2){
     Complex c3=new Complex(0,0);
     c3.x=c1.x+c2.x;
     c3.y=c1.y+c2.y;
     return c3;
    
}


public static Complex mul(Complex c1,Complex c2){
    Complex c3=new Complex(0,0);
    c3.x=(c1.x*c2.x) - (c1.y*c2.y);
    c3.y=(c1.y+c2.x) +(c1.x+ c2.y) ;
    return c3;
   
}
public static void toString(Complex ob){
    System.out.println( ob.x+ "+"+ ob.y+ "i");
}

public static void main(String args[]){
    Complex ob1=new Complex(3,5);
    Complex ob2=new Complex(3,5);
    Complex ob3=sum(ob1,ob2);
    toString(ob3);
    Complex ob4=mul(ob1,ob2);
    toString(ob4);
    
    
    }

}

