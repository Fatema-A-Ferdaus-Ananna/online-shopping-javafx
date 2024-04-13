package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class CosmaticsPage implements Initializable {
    @FXML
    private Button item_01_details_btn;

    @FXML
    private Button item_01_order_btn;

    @FXML
    private Label item_01_price_tv;

    @FXML
    private VBox item_01_container;

    @FXML
    private Button item_02_details_btn;

    @FXML
    private Button item_02_order_btn;

    @FXML
    private Label item_02_price_tv;

    @FXML
    private VBox item_02_container;

    @FXML
    void item_01_details_viewer(MouseEvent event) {
        item_01_details_btn.setStyle("-fx-background-color:green");
        item_01_container.setVisible(true);
    }

    @FXML
    void item_01_details_viewer_close(MouseEvent event) {
        item_01_details_btn.setStyle("-fx-background-color:black");
        item_01_container.setVisible(false);
    }

    @FXML
    void item_01_order_viewer(MouseEvent event) {
        item_01_order_btn.setStyle("-fx-background-color:#03056b");
    }

    @FXML
    void item_01_order_viewer_close(MouseEvent event) {
        item_01_order_btn.setStyle("-fx-background-color:black");
    }

    @FXML
    void item_02_details_viewer(MouseEvent event) {
        item_02_details_btn.setStyle("-fx-background-color:green");
        item_02_container.setVisible(true);
    }

    @FXML
    void item_02_details_viewer_close(MouseEvent event) {
        item_02_details_btn.setStyle("-fx-background-color:black");
        item_02_container.setVisible(false);
    }

    @FXML
    void item_02_order_viewer(MouseEvent event) {
        item_02_order_btn.setStyle("-fx-background-color:#03056b");
    }

    @FXML
    void item_02_order_viewer_close(MouseEvent event) {
        item_02_order_btn.setStyle("-fx-background-color:black");
    }

    @FXML
    void order_manager_01(MouseEvent event) {
        int limit = Controller.op.getCounter();
        if(limit<5){
            int[] order = Controller.op.getOrder();
            order[4] = 1;
            Controller.op.setCounter((limit+1));
        }
        else{
            System.out.println("Limit exceeded");
        }
    }

    @FXML
    void order_manager_02(MouseEvent event) {
        int limit = Controller.op.getCounter();
        if(limit<5){
            int[] order = Controller.op.getOrder();
            order[5] = 1;
            Controller.op.setCounter((limit+1));
        }
        else{
            System.out.println("Limit exceeded");
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        item_01_price_tv.setText(""+Controller.op.getPrices().get(4));
        item_02_price_tv.setText(""+Controller.op.getPrices().get(5));
    }
}
