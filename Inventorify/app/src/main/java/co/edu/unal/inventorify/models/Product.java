package co.edu.unal.inventorify.models;

/**
 * Inventorify
 * Created by Jhon Ramirez on 8/29/17.
 * Universidad Nacional de Colombia
 */
public class Product {

    public String uid;
    public String name;
    public int price;

    public Product(String uid){
        this.uid = uid;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

}
