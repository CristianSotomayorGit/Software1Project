package com.example.software1project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {



    @FXML
    private Button addPartBtn;

    @FXML
    void onAddPartButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addpart.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Add Part");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    @FXML
    private Button modPartBtn;

    @FXML
    void onModPartButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("modifypart.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Modify Part");
        stage.setScene(new Scene(root1));
        stage.show();

    }

    @FXML
    private Button addProdBtn;

    @FXML
    void onAddProdButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addproduct.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Add Product");
        stage.setScene(new Scene(root1));
        stage.show();

    }

    @FXML
    private Button modProdBtn;

    @FXML
    void onModProdButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("modifyproduct.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Modify Product");
        stage.setScene(new Scene(root1));
        stage.show();

    }

    @FXML
    private Button exitBtn;

    @FXML
    void oneExitButtonClick() throws IOException {
        Stage stage = (Stage) exitBtn.getScene().getWindow();
        stage.close();

    }

    @FXML
    public TableView<Part> mainPartTableView;
    @FXML
    TableColumn<Part, Integer> partId;
    @FXML
    TableColumn<Part, Integer> partName;
    @FXML
    TableColumn<Part, Double> partStock;
    @FXML
    TableColumn<Part, Integer> partPrice;

    @FXML

    public void initialize(URL url, ResourceBundle resourceBundle) {
        partId.setCellValueFactory(new PropertyValueFactory<>("Id"));
        partName.setCellValueFactory(new PropertyValueFactory<>("name"));
        partStock.setCellValueFactory(new PropertyValueFactory<>("stock"));
        partPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        mainPartTableView.setItems(Inventory.getAllParts());

    }
}