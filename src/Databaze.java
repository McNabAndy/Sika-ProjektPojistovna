import java.util.ArrayList;
import java.util.List;

/**
 * Třída představuje databázy pojištěných osob
 */

public class Databaze {

    /**
     * Kolekce obsahující instance Osob
     */
    private List<Osoba> databazePojistenych = new ArrayList<>();

    /**
     * Kolekce obsahující vyhledáné instance Osob
     */
    private List<Osoba> nalezeneOsoby = new ArrayList<>();

    /**
     * Metoda přidávající Osobu do databáze
     * @param osoba Osoba kterou přidávám do databáze
     */
    public void pridejPojisteneho(Osoba osoba) {
        databazePojistenych.add(osoba);
    }

    /**
     * Getter databáze
     * @return Kolekci všech osob v databázi
     */
    public List<Osoba> getDatabazePojistenych() {
        return databazePojistenych;
    }

    /**
     * Metoda vyhledávající osobu v databázi
     * @param jmeno Jméno osoby
     * @param prijmeni Příjmení osoby
     * @return Kolekci všech nalezených osob v databázi
     */
    public List<Osoba> vyhledejPojisteneho(String jmeno, String prijmeni) {
        nalezeneOsoby.clear();  // vyčištění předchozí kolekce pomocí, které jsem vyhledával (pokud tam něco bylo)
        for (Osoba osoba : databazePojistenych) {
            if (jmeno.equals(osoba.getJmeno()) && prijmeni.equals(osoba.getPrijmeni())) {
                nalezeneOsoby.add(osoba);
            }
        }
        return nalezeneOsoby;
    }
}
