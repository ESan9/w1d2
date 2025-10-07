package emanuelesanna.w1d1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Pizze extends OggettoMenu {
    private String ingredienti;
    private boolean formatoXL;

    public Pizze(String name, double price, int informazioni, String ingredienti, boolean formatoXL) {
        super(name, price, informazioni);
        this.ingredienti = ingredienti;
        this.formatoXL = formatoXL;
    }

    public double getPrezzoPizzaXL() {
        return formatoXL ? getPrice() + 2.00 : getPrice();
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n  Ingredienti: " + ingredienti
                + "\n  Formato XL disponibile: " + formatoXL
                + "\n";
    }
}
