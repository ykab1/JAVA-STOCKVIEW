package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
    @FXML
    protected void viewStock() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("stockHistory.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Stock History");
            stage.setScene(new Scene(root1));
            stage.show();

        } catch (Exception e) {
            System.out.print("viewStock work");
        }
    }
    @FXML
    protected void openCalc() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("calc.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage2 = new Stage();
            stage2.setTitle("Calculator");
            stage2.setScene(new Scene(root1));
            stage2.show();

        } catch (Exception e) {
            System.out.print("Not opening for some reason"+"\n"+e);
        }
    }
}

