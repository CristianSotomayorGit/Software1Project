package com.example.software1project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddPartController implements Initializable {


    @FXML
    private Button cancelBtn;

    @FXML
    void oneExitButtonClick() throws IOException {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();

    }

    //These variables are sued to create new part objects
    @FXML
    private TextField idTxtFld;
    @FXML
    private TextField nameTxtFld;
    @FXML
    private TextField priceTxtFld;
    @FXML
    private TextField stockTxtFld;
    @FXML
    private TextField minTxtFld;
    @FXML
    private TextField maxTxtFld;

    @FXML
    private Button saveBtn;


    /**
     * This method will create a new Part object and add it to the table.
     */
    @FXML
    public void addPartButtonPushed() throws IOException {
        Part newPart = new Part(Integer.parseInt(idTxtFld.getText()), nameTxtFld.getText(), Double.parseDouble(priceTxtFld.getText()), Integer.parseInt(stockTxtFld.getText()), Integer.parseInt(minTxtFld.getText()), Integer.parseInt(maxTxtFld.getText()));

        Inventory.addPart(newPart);

        Stage stage = new Stage();

        Parent root = FXMLLoader.load(getClass().getResource("mainform.fxml"));
        Scene scene = new Scene(root, 1200, 800);
        stage.setTitle("Inventory Management System!");
        stage.setScene(scene);
        stage.show();

        stage = (Stage) saveBtn.getScene().getWindow();
        stage.close();

    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}