package emanuelesanna.w1d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class W1d1Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(W1d1Application.class, args);
        
        Menu menu = ctx.getBean(Menu.class);

        System.out.println("----------------- MENU DELLA PIZZERIA -----------------");
        System.out.println(menu);
        System.out.println("-----------------------------------------------------");

        ctx.close();
    }

}
