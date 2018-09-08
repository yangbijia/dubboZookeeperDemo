package server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartServer {
    public static Logger logger = LoggerFactory.getLogger(StartServer.class);
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();

        logger.info("dubbo service begin to start");
        try {
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
