import java.io.*;
import java.util.*;

public class Do {
    public void print(){
       String s = "Hello World";
       String reverse = new StringBuffer(s).reverse().toString();
       System.out.println(reverse);
    }
    public void generator(String s){
        ArrayList<String> arr= new ArrayList<>();
        try{
            FileWriter fw = new FileWriter("text.txt",true);
            fw.write(s);
            fw.append('\n');
            fw.flush();
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            String line = br.readLine();
            while(line!=null){

                arr.add(line);
                line = br.readLine();
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        Random rm = new Random();
        int x = rm.nextInt(arr.size() );
        System.out.println(x);
        for(int i=0;i<x;i++){
            int r = rm.nextInt(arr.size());
            System.out.println(r);
           System.out.print(arr.get(r)+ " ");
        }

    }
}
