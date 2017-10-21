/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.converter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField inchesField;
    @FXML
    private TextField centimetersField;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleLengthConversionAction(ActionEvent event) {
        String inchesString = inchesField.getText();
        double inches = Double.parseDouble(inchesString);
        double centimeters = inches * 2.54;
        centimetersField.setText("" + centimeters);
        
    }
    
    
}
