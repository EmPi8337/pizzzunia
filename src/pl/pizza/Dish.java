package pl.pizza;

public class Dish {
    private int id;
    private double price;
    private String name;

    private Dish(int id, double price, String name){
        this.id = id;
        this.price = price;
        this.name = name;
    }

    Dish dish_1 = new Dish(0,19.99,"Margeritta");




}
