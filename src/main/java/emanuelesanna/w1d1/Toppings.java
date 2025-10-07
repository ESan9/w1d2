package emanuelesanna.w1d1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Toppings extends OggettoMenu {

    public Toppings(String name, double price, int informazioni) {
        super(name, price, informazioni);
    }

    @Override
    public String toString() {
        return "Toppings " + super.toString();
    }
}
