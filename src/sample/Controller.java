package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.awt.*;
import java.io.File;
import java.io.IOException;
public class Controller {
    @FXML
    public static Label money;
    @FXML
    public static Label date;

    private Stage stage;

    @FXML
    public void onClickAddPact(){
        stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("AddPact.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Заключение контракта");
        stage.show();
    }

    @FXML
    public void onClickBuildings(){
        stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Buildings.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Инфраструктура острова");
        stage.show();
    }

    @FXML
    public void onClickSettings(){
        stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("SettingsController.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Настройки");
        stage.show();
    }

    @FXML
    public void onClickEndStep(){

    }




}