import java.util.ArrayList;
import java.util.Scanner;

public class Vocabluary implements Subject {
    private ArrayList observers;
    private String newWord;
    public Vocabluary(){
        observers = new ArrayList();
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void registerSG(Observer o) {
        observers.add(o);
    }
    @Override
    public void removeSG(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0)observers.remove(i);
    }
    @Override
    public void notifySG() {
        for(int i=0;i<observers.size();i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(newWord);
        }
    }
    public void setWord(){
        newWord = scanner.nextLine();
        notifySG();
    }
}
