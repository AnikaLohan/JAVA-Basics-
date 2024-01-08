import java.io.*;
/* */
public class Q6 {
    public static void main(String args[]) throws IOException{
        if(args.length!=2)
        System.out.println("error");
        else{
            FileInputStream in;
            FileOutputStream out;
            try {
                in = new FileInputStream(args[0]);
                out =new FileOutputStream(args[1]);
                int z;
                while((z=in.read())!=-1){
                    out.write(z);
                }
                in.close();
                out.close();
                System.out.println("content copied");
            } 
            catch (FileNotFoundException e) {
                System.out.println("exception 1!");
            }
            catch(IOException e1){
                System.out.println("exception 2!");
            }
    

            }

        }
    }






