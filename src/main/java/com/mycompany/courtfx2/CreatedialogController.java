/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.courtfx2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author clear
 */
public class CreatedialogController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    private boolean state;
    
    @FXML private TextField nickname;
    
    public String getText(){
        return nickname.getText();
    }
    
    @FXML private void create(ActionEvent ev){
        state = true;
        Stage stage = (Stage) nickname.getScene().getWindow();    
        stage.close();
    }
    
    @FXML private void hide(ActionEvent ev){
        Stage stage = (Stage) nickname.getScene().getWindow();    
        stage.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        state = false;
        // TODO
    }    

    private static class closeButton {

        public closeButton() {
        }
    }
    
}
