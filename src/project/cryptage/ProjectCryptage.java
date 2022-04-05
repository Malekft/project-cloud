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
public class ProjectCryptage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "7ama 8rab";
        Cryptage_Decryptage c = new Cryptage_Decryptage();
        System.out.println(str + " est le mot initial");
        String cryptedword = c.Encryption(str);
        System.out.println(" codage :" + cryptedword);
        String decryption = c.Decryprion(cryptedword);
        System.out.println("dÃ©codage du mot cryptÃ© " + decryption);
    }
    
}
