import java.io.*;
import java.math.BigInteger;

public class Alice {
    private String keyWord = "victory";
    AES aes = new AES();
    public byte[] sendEncryptedKeyWord(){
        BigInteger n,e;
        byte[] b=null;
        try{
            ObjectInputStream ois= new ObjectInputStream(new FileInputStream(new File("public.key")));
           n = (BigInteger)ois.readObject();/*Alice get Bob's public key*/
           e = (BigInteger)ois.readObject();
           b = new BigInteger(keyWord.getBytes()).modPow(e,n).toByteArray();/*Enrypting , with method modPow()
                                                  keyword^e mod n*/
           ois.close();
        }catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
//        System.out.println("Sending string keyWord:" + keyWord);
//        System.out.println("Encrypted keyWord: "+ b);
        return b;
    }
    /*Since our key word "victory" 7byte I add after keyword hashcode of keyword*/

    public String sendCipherText(String message){
        String cipher = aes.encrypt(message,keyWord+keyWord.hashCode());
        return cipher;
    }
    public void receiveCipherText(String message){
        String text = aes.decrypt(message,keyWord+keyWord.hashCode());
        System.out.println("                                           "+text);
    }
}
