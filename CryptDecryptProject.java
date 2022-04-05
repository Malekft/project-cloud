/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptdecryptproject;

/**
 *
 * @author hasse
 */
public class CryptDecryptProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "malek";
        Crypt c = new Crypt();
        System.out.println(str + " est le mot initial");
        String cryptedword = c.Encryption(str);
        System.out.println(" codage :" + cryptedword);
        String decryption = c.Decryprion(cryptedword);
        System.out.println("décodage du mot crypté " + decryption);

    }

}
