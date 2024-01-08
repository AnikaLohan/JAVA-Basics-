public class Operators {
    public static void main(String args[]){

        int a= 1+1;
        int b=a*3;
        int c=b/4;
        int d=c-a;
        int e=-d;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);
        int x=42;
        double y=42.25;


        System.out.println("x mod 10="+ x% 10);
        System.out.println("y mod 10="+ y% 10);
        x--;
        System.out.println("x++="+ x);
        System.out.println("--x="+ x);
        System.out.println("x="+x);
        
       //left shifting
        byte v=64;
        byte u;
        int i;
        i=v<<2;
        u=(byte)(v<<2);
        System.out.println("original value of v:"+v);
        System.out.println("(byte)(v<<2)"+ u);
        System.out.println("v<<2"+ i);

        
        //bitwise operators
        a|=4;
        b>>=1;
        c<<=1;
        a^=c;
        System.out.println("a"+a);
        System.out.println("b"+b);
        System.out.println("c"+c);
        //boolena
        boolean one=true;
        boolean two=false;
        boolean third=(!one&two)|(one& !two);
        System.out.println(" (!one&two)|(one& !two):"+ third);
         //this
        int o,k;
        o=10;
        k=i<0? -i:i;
        System.out.println("absolute value of:");
        System.out.println(i+"is"+k);
        

         



    


  



    }
  

}
