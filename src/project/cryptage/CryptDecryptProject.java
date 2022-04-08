/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.cryptage;

/**
 *
 * @author malek
 */
public class CryptDecryptProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String motinital = "malek";
        Crypt c = new Crypt();
        System.out.println(motinital + " est le mot initial");
        String cryptedword = c.Encryption(motinital);
        System.out.println(" codage :" + cryptedword);
        String decryption = c.Decryprion(cryptedword);
        System.out.println("decodage du mot crypté " + decryption);
    }
    
}
