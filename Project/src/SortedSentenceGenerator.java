import java.io.FileWriter;
import java.io.IOException;

public class SortedSentenceGenerator extends SentenceGenerator implements Observer {
    private String newWord;
    private Subject subject;
    public SortedSentenceGenerator(Subject subject){
        this.subject = subject;
        subject.registerSG(this);
        printOption = new SortRandomPrint();
    }

    @Override
    public void update(String word) {
        newWord=word;
        try{
            FileWriter flwr = new FileWriter("SSG.txt",true);
            flwr.write(word.toLowerCase());
            flwr.append('\n');
            flwr.flush();
            flwr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
