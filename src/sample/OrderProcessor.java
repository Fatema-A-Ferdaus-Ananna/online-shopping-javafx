package sample;

import java.util.ArrayList;

public class OrderProcessor {
    private ArrayList<String> product_id;
    private ArrayList<Integer> prices;
    private int[] order;
    private int counter;

    public OrderProcessor() {
        this.product_id = new ArrayList<String>();
        this.prices = new ArrayList<Integer>();
        this.order = new int[6];
        this.counter = 0;
        manage_products();
    }

    private void manage_products(){
        product_id.add("01");
        product_id.add("02");
        product_id.add("03");
        product_id.add("04");
        product_id.add("05");
        product_id.add("06");

        prices.add(500);
        prices.add(1000);
        prices.add(1500);
        prices.add(1200);
        prices.add(3000);
        prices.add(4000);

    }

    public void setOrder(int order_position) {
        order[order_position]= 1;
    }

    public ArrayList<String> getProduct_id() {
        return product_id;
    }

    public ArrayList<Integer> getPrices() {
        return prices;
    }

    public int[] getOrder() {
        return order;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
