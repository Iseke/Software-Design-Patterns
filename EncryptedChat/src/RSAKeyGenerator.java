import com.sun.org.apache.bcel.internal.generic.BIPUSH;

import java.io.*;
import java.math.BigInteger;
import java.util.Random;

public class RSAKeyGenerator {
    /*Main steps what i will do here:
     1)select p,q
     2)calculate n = p*q
     3)calculate Ф(n) = (p-1)(q-1)
     4)select e = gcd(Ф(n),e)=1, 1<e<Ф(n)
     5)calculate d , de mod Ф(n) =1*/
    private int bitLength = 1024;
    Random rnd = new Random(System.currentTimeMillis()); /*currentTimeMillis()- number of time in
                                                            milliseconds since January 1st 1970*/
    public void generate(){
        BigInteger p = BigInteger.probablePrime(bitLength,rnd);
        BigInteger q = BigInteger.probablePrime(bitLength,rnd);
        /*we create two random large prime numbers q and p*/
        BigInteger n = p.multiply(q);/*n=p*q*/
        BigInteger Fn = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));/* Ф(n) = (p-1)(q-1)*/
        BigInteger e = BigInteger.probablePrime(bitLength/2,rnd);/*first we create value e*/
        while(Fn.gcd(e).compareTo(BigInteger.ONE)>0 && e.compareTo(Fn)<0){
            e.add(BigInteger.ONE);   /*we select e*/
        }
        BigInteger d = e.modInverse(Fn);/*we calculate value d, method modInverse return e^-1 mod Fn*/
        saveKey("public.key",n,e);
        saveKey("private.key",n,d);
        System.out.print("Generating public/private keys");
        for(int i=0;i<10;i++){
            try {
                System.out.print(".");
                Thread.sleep(500);
            } catch (InterruptedException exep) {
                System.err.println(exep.getMessage());
            }
        }
        System.out.println("\nGenerated");
    }
    public void saveKey(String filename,BigInteger mod, BigInteger exp){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename)));
            oos.writeObject(mod);
            oos.writeObject(exp);
            oos.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
