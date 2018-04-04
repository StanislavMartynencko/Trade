package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.awt.*;
import java.io.IOException;
public class Controller {
    public static Label money;
    @FXML
    public void onClickAddPact(){
        /*Parent root = null;
        try {
            Stage stage = new Stage();
            root = FXMLLoader.load(getClass().getResource("AddPact.fxml"));
            stage.setTitle("Заключение договора ");
            stage.setScene(new Scene(root, 300, 275));
            money.setText("1000");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        money = new Label();
        money.setText("1000");
    }




}
