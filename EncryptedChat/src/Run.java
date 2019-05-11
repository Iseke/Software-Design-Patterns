import java.io.*;
import java.util.Scanner;

public class Run {
    public static void main(String[] args){

        RSAKeyGenerator rsa = new RSAKeyGenerator();
        rsa.generate();
        Alice alice = new Alice();
        Bob bob = new Bob();
        bob.decryptKeyWord(alice.sendEncryptedKeyWord());
        menu(alice,bob);
    }
    public static void menu(Alice alice,Bob bob){
        Scanner scanner = new Scanner(System.in);
        String input,message;
        int choice;
        System.out.println("Start protected chart!!!");
        Chart:while(true){
            System.out.println("<<<<<<<<<Menu>>>>>>>>>>");
            System.out.println("press 'S' to start");
            System.out.println("press 'q' to quite");
            input=scanner.nextLine();
            switch (input){
                case"s":
                    S(alice,bob);
                case "q":
                    System.exit(0);
            }
        }
    }
    public static void S(Alice alice,Bob bob){
        Scanner scanner = new Scanner(System.in);
        String input,message;
        int choice;
        Who:while(true) {
            System.out.println("<<<<<<<<<LOG>>>>>>>>>>");
            System.out.println("Who are you: \n 1)Alice \n 2)Bob \n 3)back \nwrite number:");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    Alice:while(true){
                        System.out.println("<<<Hello Alice>>>\n1)Read message\n2)Write message\n3)back");
                        choice = scanner.nextInt();
                        switch (choice){
                            case 1:
                                if(open("AliceInputMessage.txt")=="")System.out.println("No message!");
                                else {
                                    String s = open("AliceInputMessage.txt");
                                    System.out.print("Message from Bob: ");
                                    alice.receiveCipherText(s);
                                }
                                continue Alice;
                            case 2:
                                System.out.println("Write message:");
                                Scanner scan = new Scanner(System.in);
                                String mes =scan.nextLine();
                                send("BobInputMessage.txt",alice.sendCipherText(mes));
                                continue Alice;
                            case 3:continue Who;
                        }
                    }
                case 2:
                    Bob:while(true){
                        System.out.println("<<<Hello BOB>>>\n1)Read message\n2)Write message\n3)back");
                        choice =scanner.nextInt();
                        switch (choice){
                            case 1:
                                if(open("BobInputMessage.txt")=="")System.out.println("No message!!!");
                                else{
                                  String s= open("BobInputMessage.txt");
                                    System.out.print("Message from Alice: ");
                                  bob.receiveCipherText(s);
                                }
                                continue Bob;
                            case 2:
                                System.out.println("Write message:");
                                Scanner scan = new Scanner(System.in);
                                String mes = scan.nextLine();
                                send("AliceInputMessage.txt",bob.sendCipherMessage(mes));
                                continue Bob;
                            case 3:continue Who;
                        }
                    }
                case 3:
                  break Who;
            }
        }
    }
    public static String open(String fileName){
        String message="";
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            message = br.readLine();
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return message;
    }
    public static void send(String fileName,String message){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,false));
            bw.write(message);
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
