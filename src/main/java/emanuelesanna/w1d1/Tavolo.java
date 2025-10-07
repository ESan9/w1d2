package emanuelesanna.w1d1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Tavolo {
    private int number;
    private int numeroCoperti;
    private StatoTavolo stato;

    public Tavolo(int number, int numeroCoperti, StatoTavolo stato) {
        this.number = number;
        this.numeroCoperti = numeroCoperti;
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "number=" + number +
                ", numeroCoperti=" + numeroCoperti +
                ", stato=" + stato +
                '}';
    }
}
