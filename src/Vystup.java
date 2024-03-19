/**
 * Třída která předává zvalidované uživatelské vstupy na výstup
 */
public class Vystup {
    /**
     * Založení instance Validator
     */
    Validator validator = new Validator();

    /**
     * Založení instance Vstup
     */
    Vstup vstup = new Vstup();

    /**
     * Metoda komunikující s uživatel, vyžadující jméno uživatele
     * @return jmeno Uživatele
     */
    public String vyzadejJmeno() {
        do {
            System.out.println("Zadejte jméno pojištěného:");
            if (!validator.validaceVstupu(vstup.nactiJmeno())) {
                System.out.println("Neplatná volba");
            }
        } while (!validator.validaceVstupu(vstup.getJmeno()));
        return vstup.getJmeno();
    }

    /**
     * Metoda komunikující s uživatel, vyžadující příjmení uživatele
     * @return prijmeni Uživatele
     */
    public String vyzadejPrijmeni() {
        do {
            System.out.println("Zadejte přijmení pojištěného:");
            if (!validator.validaceVstupu(vstup.nactiPrijmeni())) {
                System.out.println("Neplatná volba");
            }
        } while (!validator.validaceVstupu(vstup.getPrijmeni()));
        if (vstup.getVolba() == 3) { // odřádkování pokud chci jen vyhledat uživatele
            System.out.println();
        }
        return vstup.getPrijmeni();
    }

    /**
     * Metoda komunikující s uživatel, vyžadující telefon uživatele
     * @return telefon Uživatele
     */
    public String vyzadejTelefon() {
        do {
            System.out.println("Zadejte telefon pojištěného:");
            if (!validator.validaceVstupu(vstup.nactiTelefon())) {
                System.out.println("Neplatná volba");
            }
        } while (!validator.validaceVstupu(vstup.getTelefon()));
        return vstup.getTelefon();
    }

    /**
     * Metoda komunikující s uživatel, vyžadující věk uživatele
     * @return vek Uživatele
     */
    public int vyzadejVek() {
        do {
            try {
                System.out.println("Zadejte věk pojištěného:");
                if (!validator.validaceVstupu(vstup.nactivek())) {
                    System.out.printf("Nemůžeš zadat věk: %s ...\n ", vstup.getVek());
                }
            } catch (Exception e) {
                System.out.println("Chyba, věk musí být ve formátu celého kladného nenulového čísla...");
                vstup.setVek(0); // v případě, že dojde k vyjímce, naství třída Vstup svůj atribut věk na "0"
            }
        } while (!validator.validaceVstupu(vstup.getVek()));
        return vstup.getVek();
    }

    /**
     * Metoda vypisující výzvy
     */
    public void zahlasVyzvu(){
        if (vstup.getVolba() == 1){
            System.out.println();
            System.out.println("Data byla uložena. Pokračujte stisknutím klávesy ENTER...");
            vstup.cekejNaEnter();
        } else if (vstup.getVolba() > 1 && vstup.getVolba() < 5) {
            System.out.println();
            System.out.println("Pokračujte stisknutím klávesy ENTER...");
            vstup.cekejNaEnter();
        } else {
            System.out.println();
            System.out.println("Neplatná volba...");
        }
    }

    /**
     * Metoda pro vypsání nabídky
     * @return volba Uživatele
     */
    public int vytiskniMenu() {
        System.out.println("------------------------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("------------------------------------------");
        System.out.println();
        System.out.println("Vyberete si akci: ");
        System.out.println("1 - Přidej nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
        try {
            validator.validaceVstupu(vstup.nactiVolbu());
            System.out.println();
        } catch (Exception e) {
            vstup.setVolba(0); // v případě, že dojde k vyjímce, nastaví třída Vstup svůj atribut volba na "0"
        }
        return vstup.getVolba();
    }
}
