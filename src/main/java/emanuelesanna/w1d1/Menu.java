package emanuelesanna.w1d1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Menu {
    private List<Pizze> pizze;
    private List<Bevande> bevande;
    private List<Toppings> toppings;

    public Menu(List<Pizze> pizze, List<Bevande> bevande, List<Toppings> toppings) {
        this.pizze = pizze;
        this.bevande = bevande;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizze \n" + pizze +
                " Bevande \n" + bevande +
                " Toppings \n" + toppings;
    }
}
