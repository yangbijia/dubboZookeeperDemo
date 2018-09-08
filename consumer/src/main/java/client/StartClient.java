package client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IOrder;
import service.IProduct;

public class StartClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        IProduct helloService = (IProduct) context.getBean("productService");
        String result = helloService.getProduct("A");
        IOrder orderService = (IOrder) context.getBean("orderService");
        String result1 = orderService.getOrderId("12",result);
        System.out.println(result+","+result1);
    }
}
