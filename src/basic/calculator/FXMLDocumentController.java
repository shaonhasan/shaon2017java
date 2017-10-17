/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Shaon
 */
public class FXMLDocumentController implements Initializable {
    String operation;
    double number1;
    double number2;
    boolean hasParsialComputation = false;
            
    
    private Label label;
    @FXML
    private Button digitOneButton;
    @FXML
    private Button digitTwoButton;
    @FXML
    private Button digitThreeButton;
    @FXML
    private Button digitZeroButton;
    @FXML
    private Button digitDotButton;
    @FXML
    private Button digitFourButton;
    @FXML
    private Button digitFiveButton;
    @FXML
    private Button equalButton;
    @FXML
    private Button digitSixButton;
    @FXML
    private Button digitNineButton;
    @FXML
    private Button digitEightButton;
    @FXML
    private Button digitSevenButton;
    @FXML
    private TextField displayField;
    @FXML
    private Button buttonClear;
    @FXML
    private Button buttonAllClear;
    @FXML
    private Button buttonAdd;
    @FXML
    private Button buttonSub;
    @FXML
    private Button buttonDivide;
    @FXML
    private Button buttonMultiple;
    @FXML
    private Button buttonON;
    
    private void handleButtonAction(ActionEvent event) {
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleDigitOneAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "1";
        displayField.setText(newText);
    }

    @FXML
    private void handleDigitTwoAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "2";
        displayField.setText(newText);
    }

    @FXML
    private void handleDigitThreeAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "3";
        displayField.setText(newText);
    }

    @FXML
    private void handleDigitZeroAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "0";
        displayField.setText(newText);
    }

    @FXML
    private void handleDigitDotAction(ActionEvent event) {
        String oldText = displayField.getText();
        if(!oldText.contains(".")){
        String newText = oldText + ".";
        displayField.setText(newText);
    }
    }
    @FXML
    private void handleDigitFourAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "4";
        displayField.setText(newText);
    }

    @FXML
    private void handleDigitFiveAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "5";
        displayField.setText(newText);
    }

    @FXML
    private void handleEqualAction(ActionEvent event) {
        String oldText = displayField.getText();
        number2 = Double.parseDouble(oldText);
        double result;
        
        switch (operation) {
            case "ADD":
                result = number1 + number2;
                displayField.setText("" + result);
                break;
            case "SUBTRACT":
                result = number1 - number2;
                displayField.setText("" + result);
                break;
            case "DIVIDE":
                result = number1 / number2;
                displayField.setText("" + result);
                break;
            case "MULTIPLE":
                result = number1 * number2;
                displayField.setText("" + result);
                break;
            default:
                break;
        }
    }

    @FXML
    private void handleDigitSixAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "6";
        displayField.setText(newText);
    }

    @FXML
    private void handleDigitNineAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "9";
        displayField.setText(newText);
    }

    @FXML
    private void handleDigitEightAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "8";
        displayField.setText(newText);
    }

    @FXML
    private void handleDigitSevenAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "7";
        displayField.setText(newText);
    }

    @FXML
    private void handleDisplayAction(ActionEvent event) {
        
    }

    @FXML
    private void handleClearAction(ActionEvent event) {
        String oldText = displayField.getText();
        if(oldText.length() >= 1){
        String newText = oldText.substring(0, oldText.length() - 1);
        displayField.setText(newText);
    }
}
    @FXML
    private void handleAllClearAction(ActionEvent event) {
        displayField.clear();
    }

    @FXML
    private void handleAddAction(ActionEvent event) {
        if(!hasParsialComputation){
        String oldText = displayField.getText();
        number1 = Double.parseDouble(oldText);
        operation = "ADD";
        displayField.clear();
        hasParsialComputation = true;
        }
        else{
            String oldText = displayField.getText();
        number2 = Double.parseDouble(oldText);
        double result ;
        
        switch (operation) {
            case "ADD":
                result = number1 + number2;
                displayField.setText("" + result);
                break;
            case "SUBTRACT":
                result = number1 - number2;
                displayField.setText("" + result);
                break;
            case "DIVIDE":
                result = number1 / number2;
                displayField.setText("" + result);
                break;
            case "MULTIPLE":
                result = number1 * number2;
                displayField.setText("" + result);
                break;
            default:
                break;
        }

        hasParsialComputation = false;
        }
    }
    @FXML
    private void handleSubButtonAction(ActionEvent event) {
        String oldText = displayField.getText();
        number1 = Integer.parseInt(oldText);
        operation = "SUBTRACT";
        displayField.clear();
    }
    @FXML
    private void handleDividedButtonAction(ActionEvent event) {
        String oldText = displayField.getText();
        number1 = Double.parseDouble(oldText);
        operation = "DIVIDE";
        displayField.clear();
    }

    @FXML
    private void handleMultipleButtonAction(ActionEvent event){
        if(!hasParsialComputation){
        String oldText = displayField.getText();
        number1 = Double.parseDouble(oldText);
        operation = "MULTIPLE";
        displayField.clear();
        hasParsialComputation = true;
        }
        else{
            String oldText = displayField.getText();
        number2 = Double.parseDouble(oldText);
        double result ;
        
        switch (operation) {
            case "MULLTIPLE":
                result = number1 + number2;
                displayField.setText("" + result);
                break;
            case "SUBTRACT":
                result = number1 - number2;
                displayField.setText("" + result);
                break;
            case "DIVIDE":
                result = number1 / number2;
                displayField.setText("" + result);
                break;
            case "MULTIPLE":
                result = number1 * number2;
                displayField.setText("" + result);
                break;
            default:
                break;
        }

        hasParsialComputation = false;
        }
    }

    @FXML
    private void handleONButtonAction(ActionEvent event) {
    }
    
}
