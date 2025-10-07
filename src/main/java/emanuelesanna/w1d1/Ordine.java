package emanuelesanna.w1d1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Ordine {
    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDate oraAcquisizione;
    private double importoTotale;
    private List<OggettoMenu> oggetti = new ArrayList<>();
    private Tavolo tavolo;

    public Ordine(int numeroOrdine, StatoOrdine statoOrdine, LocalDate oraAcquisizione, int numeroCoperti, Tavolo tavolo) {
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = statoOrdine;
        this.oraAcquisizione = oraAcquisizione;
        this.numeroCoperti = numeroCoperti;
        this.tavolo = tavolo;

        if (this.tavolo != null) {
            this.tavolo.setStato(StatoTavolo.OCCUPATO);
        }
    }

    public void aggiungiElemento(OggettoMenu oggetto, int quantita) {
        if (quantita <= 0 || oggetto == null) return;
        for (int i = 0; i < quantita; i++) {
            oggetti.add(oggetto);
        }
    }

    public void calcolaTotale(double costoCoperto) {
        double somma = oggetti.stream().mapToDouble(OggettoMenu::getPrice).sum();
        this.importoTotale = somma + (numeroCoperti * costoCoperto);
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "numeroOrdine=" + numeroOrdine +
                ", statoOrdine=" + statoOrdine +
                ", numeroCoperti=" + numeroCoperti +
                ", oraAcquisizione=" + oraAcquisizione +
                ", importoTotale=" + importoTotale +
                ", oggetti=" + oggetti +
                ", tavolo=" + tavolo +
                '}';
    }
}
