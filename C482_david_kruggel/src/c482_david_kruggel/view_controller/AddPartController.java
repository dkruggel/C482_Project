/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author dkruggel
 */
public class AddPartController implements Initializable {

    @FXML
    private ToggleGroup AddPartToggleGroup;
    @FXML
    private Label AddPartMachineIDLabel;
    @FXML
    private TextField AddPartMachineIDTextBox;
    @FXML
    private RadioButton AddPartIn_HouseRadioButton;
    @FXML
    private RadioButton AddPartOutsourcedRadioButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        AddPartIn_HouseRadioButton.setSelected(true);
        AddPartOutsourcedRadioButton.setSelected(false);
    }    

    @FXML
    private void handleRadioButtonChange(ActionEvent event) {
    }
    
}
