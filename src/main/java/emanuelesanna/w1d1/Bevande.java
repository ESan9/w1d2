package emanuelesanna.w1d1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Bevande extends OggettoMenu {
    private double volumeLitri;
    private double gradazione;

    public Bevande(String name, double price, int informazioni, double volumeLitri, double gradazione) {
        super(name, price, informazioni);
        this.volumeLitri = volumeLitri;
        this.gradazione = gradazione;
    }

    @Override
    public String toString() {
        return "Bevande " +
                "volumeLitri=" + volumeLitri +
                ", gradazione=" + gradazione +
                "} " + super.toString();
    }
}
