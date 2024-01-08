import java.io.*;

class Copyfile throws FileNotFoundException, IOException {
    FileInputStream fis= new FileInputStream("abc.txt");
    FileOutputStream fos= new FileOutputStream("bbc.txt");
    int data;
    while((data=fis.read())!=-1){
        fos.write(data);
    }
    System.out.println("hello World");
    fis.close();
    fos.close();
}
