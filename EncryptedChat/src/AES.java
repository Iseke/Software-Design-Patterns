import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AES {
    private static final String algo = "AES";
    private static final String characterEncoding = "UTF-8";


    // Encryption process
    public  String encrypt(String plainText,String key) { //take message from main method
        String encryptedText = ""; //empty String which after encrypt the message to ciphertext store in this field.
        try {
            Cipher cipher= Cipher.getInstance(algo); //create instance of Cipher and define type of the algorithm
            SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(characterEncoding), algo); // generate secretkey
            cipher.init(Cipher.ENCRYPT_MODE, secretKey); //define the process if it is encrypting or decrypting
            byte[] cipherText = cipher.doFinal(plainText.getBytes(characterEncoding)); //perform encryption

            //we encode the binary data with Base64 to ensure it to be intact without modification when it is stored or transferred.
            Base64.Encoder encoder = Base64.getEncoder();
            encryptedText = encoder.encodeToString(cipherText);
// Exception catch
        } catch (Exception E) {
            System.err.println("Encrypt Exception : "+E.getMessage());
        }
        // Return to empty String
        return encryptedText;
    }

    //Decryption Process
    public String decrypt(String encryptedText,String key) { //Take encoding binary from encryption method
        String decryptedText = "";//empty String which after decrypt the ciphertext to real message store in this field.
        try {
            Cipher cipher = Cipher.getInstance(algo); ////create instance of Chiper and define type of the algorithm
            SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(characterEncoding), algo);  // generate secretkey
            cipher.init(Cipher.DECRYPT_MODE, secretKey);//define the process if it is encrypting or decrypting

            // as we do on the first encrypt stage encoding the ciphertext so when we start decrypt the ciphertext we should decoding the Base64.
            Base64.Decoder decoder = Base64.getDecoder();
            byte[] cipherText = decoder.decode(encryptedText.getBytes(characterEncoding));
            decryptedText = new String(cipher.doFinal(cipherText), characterEncoding);
//Catch Exceptions
        } catch (Exception E) {
            System.err.println("decrypt Exception : "+E.getMessage());
        }
        // Return to empty String
        return decryptedText;
    }

}