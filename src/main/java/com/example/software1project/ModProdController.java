package com.example.software1project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ModProdController implements Initializable{


    @FXML
    private Button cancelBtn;

    @FXML
    void oneExitButtonClick() throws IOException{
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}