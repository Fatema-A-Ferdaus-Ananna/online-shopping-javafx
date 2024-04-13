package sample;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private Pane root_content;

    @FXML
    private ImageView toolbar_minimize;

    @FXML
    private BorderPane root_container;

    @FXML
    private ImageView toolbar_exit;

    @FXML
    private Button catagories_opt_btn;

    @FXML
    private Button order_list_btn;

    @FXML
    private AnchorPane main_view;

    private double x,y;

    public static OrderProcessor op;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            op = new OrderProcessor();
            configure_icon();
            toolbar_exit.setOnMouseClicked(mouseEvent ->
                    close_application(mouseEvent));

            toolbar_minimize.setOnMouseClicked(mouseEvent ->
                    minimize_application(mouseEvent));

        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error in Controller");
        }
    }

    private void configure_icon() {
        try{
            Image image_exit = new Image("/sample/exit.png");
            toolbar_exit.setImage(image_exit);

            Image image_minimizer = new Image("/sample/minimizer.png");
            toolbar_minimize.setImage(image_minimizer);

        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error in Controller : Configure Icon");
        }
    }


    private void move_to_homepage(MouseEvent mouseEvent) {

    }


    private void minimize_application(MouseEvent event){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }
    private void close_application(MouseEvent event){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void drag_screen_to_place(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(event.getScreenX()-x);
        stage.setY(event.getScreenY()-y);
    }

    @FXML
    void press_to_pick_screen(MouseEvent event) {
        x = event.getX();
        y = event.getY();
    }

    @FXML
    void move_to_catagories(MouseEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("product_menu.fxml"));
            main_view.getChildren().setAll(root);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void move_to_order_list(MouseEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("order_list_page.fxml"));
            main_view.getChildren().setAll(root);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
