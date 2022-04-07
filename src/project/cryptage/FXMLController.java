/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.cryptage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author malek
 */
public class FXMLController implements Initializable {

    @FXML
    private TextField c;
    @FXML
    private TextField d;
    @FXML
    private Label mc;
    @FXML
    private Label md;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void decrypt(ActionEvent event) {
        String inital=d.getText();
        Crypt cr=new Crypt();
        String decrypted=cr.Decryprion(inital);
        md.setText(decrypted);
               
 
               
    }

    @FXML
    private void crypt(ActionEvent event) {
        String inital=c.getText();
        Crypt cr=new Crypt();
        String crypted=cr.Encryption(inital);
        mc.setText(crypted);
    }
    
}
