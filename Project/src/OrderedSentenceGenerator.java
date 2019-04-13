import java.io.*;


public class OrderedSentenceGenerator extends SentenceGenerator implements Observer{
    private String newWord;
    private Subject subject;
    public OrderedSentenceGenerator(Subject subject){
        this.subject = subject;
        subject.registerSG(this);
        printOption = new OrderRandomPrint();
    }

    @Override
    public void update(String word) {
        newWord=word;
        try{
            FileWriter flwr = new FileWriter("OSG.txt",true);
            String reverse = new StringBuffer(word.toUpperCase()).reverse().toString();
            flwr.write(reverse);
            flwr.append('\n');
            flwr.flush();
            flwr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
