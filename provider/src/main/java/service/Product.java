package service;

public class Product implements IProduct{
    public String getProduct(String name) {
        return "producing "+name + "....  please wait for a minute";
    }
}
