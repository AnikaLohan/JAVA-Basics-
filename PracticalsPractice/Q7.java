import java.io.*;
public class Q7 {
    static void input(String s){
       try(
           BufferedReader buff = new BufferedReader(new FileReader(s))){
           try{
               String line;
               while((line = buff.readLine()) != null){
                   if(line.charAt(0) == '/' && line.charAt(1) == '/')
                   System.out.println(line);
                   //break;
               }
           }
           catch(IOException e){
               System.out.println(e);
           }

       }
       catch(IOException e1){
           System.out.println(e1);
       }
    }
    public static void main(String args[]){
        if(args.length==0) {
            System.out.println("Please enter  a file name");
        }
        input(args[0]);
    }
}
