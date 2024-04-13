package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ProductMenu implements Initializable {
    @FXML
    private Button cloth_opt_btn;

    @FXML
    private Button shoes_otp_btn;

    @FXML
    private Button cosmetics_opt_btn;

    @FXML
    private AnchorPane sub_viewer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void move_to_clothes_panel(MouseEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("clothe_page.fxml"));
            sub_viewer.getChildren().setAll(root);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void move_to_cosmetics_panel(MouseEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("cosmetics_page.fxml"));
           sub_viewer.getChildren().setAll(root);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void move_to_shoes_panel(MouseEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("shoes_page.fxml"));
            sub_viewer.getChildren().setAll(root);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
