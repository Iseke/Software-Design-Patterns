import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortRandomPrint implements PrintOption {
    @Override
    public void print() {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> printarr = new ArrayList<>();
        try{
            BufferedReader bfrd = new BufferedReader(new FileReader("SSG.txt"));
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
        for(int i=0;i<x;i++){
            int r = rm.nextInt(arr.size());
            printarr.add(arr.get(r));
        }
        Collections.sort(printarr);
        System.out.println();
        System.out.println("Sorted Sentence Generator: ");
        for(int i=0;i<printarr.size();i++){
            System.out.print(printarr.get(i)+" ");
        }
        System.out.println();
    }
}
