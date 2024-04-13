package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class OrderListPage implements Initializable {
    @FXML
    private Label order__product_id_01;

    @FXML
    private Label order__product_id_02;

    @FXML
    private Label order__product_id_03;

    @FXML
    private Label order__product_id_04;

    @FXML
    private Label order__product_id_05;

    @FXML
    private Label order_price_01;

    @FXML
    private Label order_price_02;

    @FXML
    private Label order_price_03;

    @FXML
    private Label order_price_04;

    @FXML
    private Label order_price_05;

    @FXML
    private Label order_price_total;

    private int counter = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int[] order = Controller.op.getOrder();
        Label ui_order_product[] = new Label[]{order__product_id_01,order__product_id_02,
                                  order__product_id_03,order__product_id_04,
                                  order__product_id_05};

        Label ui_order_price[] = new Label[]{order_price_01,order_price_02,
                                  order_price_03,order_price_04,
                                  order_price_05};

        int switcher = 0;
        int total = 0;
        while (counter<6){
            if(order[counter]==1 && switcher<5){
                ui_order_product[switcher].setText(Controller.op.getProduct_id().get(counter));
                int single_price = Controller.op.getPrices().get(counter);
                ui_order_price[switcher].setText(""+single_price);
                total = single_price+total;
                switcher++;
            }
            counter++;
        }
        order_price_total.setText(""+total);
    }
}
