package Package1;

public class XYZ extends Animal implements Interface1{
    public static void main(String [] args){
     new XYZ().m1();
     new XYZ().m2();
     new XYZ().bark();
        
    }

    @Override
    public void m1() {
      
        System.out.println("hi");
    }

    @Override
    public void m2() {
        
        System.out.println("hello world");
        
    }
    
}
