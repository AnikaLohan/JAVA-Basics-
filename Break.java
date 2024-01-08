//9 th may 2022
//1
class Break{
   public static void main(String args[]){
       boolean t=true;
       first:{
           second:{
               third:{
                   system.out.print("hello");
                   if(t)
                      break first;
                    system.out.print("world");
               }
            system.out.print("good");
               }
           
           system.out.print("goodies");
       }


   }
}
//2
class Break2{
    public static void main(String args[]){
        outer: for(int i=0;i<3;i++){
            system.out.print("pass:"+i);
            for(int j=0;j<5;j++)
            {
                if(j==3)
                  break outer;
                system.out.print(j);
            }

        }
    }
}

//3
class break3{
    public static void main(string args[]){
        outer: for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(j>i)
                {
                    system.out.print(j);
                      continue outer;
                }
                system.out.print(i+j);
            }
        }
    }
}

//4
class Box{
    double width;
    double height;
    double depth;
    
    Box(double w,double h,double d){
        this.width=w;
        this.height=h;
        this.depth=d;
    }
    Box(){
        System.out.println("constructiong box:");
        width=10;
        height=10;
        depth=10;
    }
    void volume(){
        System.out.println("Volume is:");
        System.out.println(width* height * depth);
    }
}

class BoxDemo{
    public static void main(String args[]{
        Box mybox1=new Box();
        Box mybox2=new Box();
        double vol;
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;

        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;
        
        mybox1.volume();
        mybox2.volume();


    }
}

class Instantiatebox{
    public static void main(){
        Box b;
        b= new Box();
    }
}
//
//push pop overflow underflow