import java.io.FileWriter;
import java.io.IOException;

public class RandomSentenceGenerator extends SentenceGenerator implements Observer {
    private String newWord;
    private Subject subject;
    public RandomSentenceGenerator(Subject subject){
        printOption = new RandomPrintWithDash();
        this.subject = subject;
        subject.registerSG(this);
    }

    @Override
    public void update(String word) {
        newWord=word;
        try{
            FileWriter flwr = new FileWriter("RSG.txt",true);
            flwr.write(word.toLowerCase());
            flwr.append('\n');
            flwr.flush();
            flwr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
