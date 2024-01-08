import java.io.FileInputStream;
import java.io.*;
public class FISDemo {
    public static void main(String args []) throws FileNotFoundException,IOException{
        FileInputStream f=new FileInputStream("abc.txt");
        //input conection

        int data;
        while((data=f.read())!=-1){
            System.out.println("data:"+data);
            System.out.println("data:"+(char)data);

        }

        f.close();

        FileOutputStream f2= new FileOutputStream("bbc.txt");
        f2.write(5);

        f2.close();

        

        

      

    }
}
