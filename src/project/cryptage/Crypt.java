/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.cryptage;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 *
 * @author malek
 */
public class Crypt {
    
     public String Encryption(String str) {

       
        byte[] encodedBytes = Base64.getEncoder().encode(str.getBytes());
        try {
         String   encodedString = new String(encodedBytes, "UTF-8");
            return encodedString;
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public String Decryprion(String str) {
        byte[] decodedBytes = Base64.getDecoder().decode(str);
        try {
          String  decodedString = new String(decodedBytes, "UTF-8");
            return decodedString;
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
