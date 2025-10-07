package emanuelesanna.w1d1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

//Lo metto come component per fare queste azioni all'avvio

@Component
public class Ristorante implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(Ristorante.class);
    private final Menu menu;

    //    Inietto il valore della proprietà che si trova in application.properties scegliendo la maniera più semplice quindi prima dell'attributo
    @Value("${ristorante.costo.coperto}")
    private double costoCoperto;

    //    Innietto il menu nel costruttore automaticamente, era un bean
    public Ristorante(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void run(String... args) {
        logger.info("=== MENU ===");
        menu.getPizze().forEach(p -> logger.info("Pizze " + p.getName() + " - €" + p.getPrice()));
        menu.getBevande().forEach(b -> logger.info("Bevande " + b.getName() + " - €" + b.getPrice()));
        menu.getToppings().forEach(b -> logger.info("Toppings " + b.getName() + " - €" + b.getPrice()));

        Tavolo tavolo = new Tavolo(1, 4, StatoTavolo.LIBERO);
        Ordine ordine = new Ordine(1, StatoOrdine.INCORSO, LocalDate.now(), 2, tavolo);

        Pizze margherita = menu.getPizze().getFirst();
        Bevande lemonade = menu.getBevande().getFirst();

        ordine.aggiungiElemento(margherita, 2);
        ordine.aggiungiElemento(lemonade, 2);

        ordine.calcolaTotale(costoCoperto);

        logger.info("Ordine creato: {}", ordine);
        logger.info("Stato tavolo: {}", tavolo.getStato());
    }
}
