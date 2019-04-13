import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OrderRandomPrint implements PrintOption{
    @Override
    public void print() {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Integer> order = new ArrayList<>();
        try{
            BufferedReader bfrd = new BufferedReader(new FileReader("OSG.txt"));
            String line = bfrd.readLine();
            while(line!=null){
                arr.add(line);
                line = bfrd.readLine();
            }
            bfrd.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        Random rm =new Random();
        int x = rm.nextInt(arr.size());
        System.out.println();
        System.out.println("Ordered Sentence Generator: ");
        for(int i=0;i<x;i++){
            int r = rm.nextInt(arr.size());
            order.add(r);
        }
        Collections.sort(order);
        for(int i=0;i<order.size();i++){
            System.out.print(arr.get(order.get(i))+" ");
        }
        System.out.println();
    }
}
