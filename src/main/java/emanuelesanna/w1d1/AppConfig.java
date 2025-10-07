package emanuelesanna.w1d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Toppings Cheese() {
        return new Toppings("Cheese", 0.69, 92);
    }

    @Bean
    public Toppings Ham() {
        return new Toppings("Ham", 0.99, 35);
    }

    @Bean
    public Toppings Onions() {
        return new Toppings("Onions", 0.69, 22);
    }

    @Bean
    public Toppings Pineapple() {
        return new Toppings("Pineapple", 0.79, 24);
    }

    @Bean
    public Toppings Salami() {
        return new Toppings("Salami", 0.99, 86);
    }

    @Bean

    public Pizze PizzaMargherita() {
        return new Pizze("Pizza Margherita", 4.99, 1104, "(tomato, cheese)", true);
    }

    @Bean

    public Pizze PizzaHawaiana() {
        return new Pizze("Pizza Hawaiana", 6.49, 1024, "(tomato, cheese, ham, pineapple)", true);
    }

    @Bean

    public Pizze PizzaSalami() {
        return new Pizze("Pizza Salami", 5.99, 1160, "(tomato, cheese, salami)", true);
    }

    @Bean
    public Bevande Lemonade() {
        return new Bevande("Lemonade", 1.29, 128, 0.33, 0.0);
    }

    @Bean
    public Bevande Water() {
        return new Bevande("Water", 1.29, 0, 0.5, 0.0);
    }

    @Bean
    public Bevande Wine() {
        return new Bevande("Wine", 7.49, 607, 0.75, 13);
    }

    @Bean
    public Menu menu() {
        return new Menu(
                List.of(PizzaMargherita(), PizzaHawaiana(), PizzaSalami()),
                List.of(Lemonade(), Water(), Wine()),
                List.of(Cheese(), Ham(), Onions(), Pineapple(), Salami())
        );
    }

}
