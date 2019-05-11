import java.io.*;
import java.math.BigInteger;

public class Bob {
    private String keyWord;
    AES aes = new AES();
    public void decryptKeyWord(byte[] encr){/*Bob receive encrypted word from Alice*/
        BigInteger d,n;
        byte[] dec = null;
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("private.key")));
            n = (BigInteger)ois.readObject();/*Bob use his own private key with mod n and d*/
            d = (BigInteger)ois.readObject();
            dec = new BigInteger(encr).modPow(d,n).toByteArray();/*Decrypting method modPow() = encr^d mod n wich hepl us to decrypt*/
            ois.close();
        }catch (IOException | ClassNotFoundException exp){
            exp.printStackTrace();
        }
        keyWord = new String(dec);
//        System.out.println("Decrypted keyWord: "+keyWord);
    }
    /*Since our key word "victory" 7byte I add after keyword hashcode of keyword*/
    public void receiveCipherText(String message){
        String text = aes.decrypt(message,keyWord+keyWord.hashCode());
        System.out.println("                                           "+text);

    }
    public String sendCipherMessage(String message){
        String text = aes.encrypt(message,keyWord+keyWord.hashCode());
        return text;
    }
}
