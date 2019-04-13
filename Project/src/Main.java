import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Vocabluary vocabluary = new Vocabluary();
        SentenceGenerator rsg = new RandomSentenceGenerator(vocabluary);
        SentenceGenerator ssg = new SortedSentenceGenerator(vocabluary);
        SentenceGenerator osg = new OrderedSentenceGenerator(vocabluary);
        System.out.println("Please write a new word!\n");
        vocabluary.setWord();
        imitation();
        rsg.performPrint();
        ssg.performPrint();
        osg.performPrint();
    }
    public static void imitation(){
        System.out.print("Generating");
        for(int i=0;i<5;i++){
            try {
                System.out.print(".");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        for(int i=0;i<10;i++){
            try {
                System.out.print(".");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("Generated!!!");
    }
}
