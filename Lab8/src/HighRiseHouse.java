import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class HighRiseHouse extends House {
    private int number;
    public void wallMaterial(){
        System.out.println("Use bricks to build High-Rise house ");
    }

    public boolean needElevator(){
        if(getInput()){
            return true;
        }
        else return false;
    }
    public boolean getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many floors you want(write just number)?:");
        number = scanner.nextInt();
        if(number>5){
            return true;
        }
        else return false;
    }
    public void numberOfFloors(){
        System.out.println(number+" floors");
    }
}
