/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482_david_kruggel.view_controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 *
 * @author david
 */
public class MainFormController implements Initializable {
    
    @FXML
    private Button mainFrmExitButton;
    @FXML
    private Button button;
    @FXML
    private Button button1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    } 

    @FXML
    private void handleExitButton(ActionEvent event) {
        System.exit(0);
    }
}
