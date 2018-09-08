package service;

public class Order implements IOrder{
    public String getOrderId(String id, String  productList) {
        return "your order " + id + " is created";
    }
}
