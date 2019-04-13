import java.io.*;

public class InputTest {
    public static void main(String[] args){
       int c;
       try{
           InputStream in=
                   new UpperCaseInputStream(
                           new BufferedInputStream(
                                   new FileInputStream("C:\\Users\\Islam\\Desktop\\Java Projects\\Lab3InputStreaem\\src\\test.txt")));
           while ((c=in.read())>=0){
               System.out.print((char)c);
           }
           in.close();
       }
       catch (IOException i){
           i.printStackTrace();
       }
    }
}
