package pl.pizza;

import java.util.HashMap;

public class Order {
    private int id;
    private double value;
    protected HashMap<Integer,Integer> meals = new HashMap<Integer,Integer>();

    public Order(int id){
        this.id = id;
    }

}
