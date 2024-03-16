public class Vystup {

    Validator validator = new Validator();
    Vstup vstup = new Vstup();


    public String vyzadejJmeno() {
        do {
            System.out.println("Zadejte jméno pojištěného:");
            if (!validator.validaceVstupu(vstup.nactiJmeno())) {
                System.out.println("Neplatná volba");
            }
        } while (!validator.validaceVstupu(vstup.nactiJmeno()));
        return vstup.getJmeno();
    }
    public String vyzadejPrijmeni() {
        do {
            System.out.println("Zadejte přijmení pojištěného:");
            if (!validator.validaceVstupu(vstup.nactiPrijmeni())) {
                System.out.println("Neplatná volba");
            }
        } while (!validator.validaceVstupu(vstup.nactiPrijmeni()));
        return vstup.getPrijmeni();
    }

    public String vyzadejTelefon() {
        do {
            System.out.println("Zadejte telefon pojištěného:");
            if (!validator.validaceVstupu(vstup.nactiTelefon())) {
                System.out.println("Neplatná volba");
            }
        } while (!validator.validaceVstupu(vstup.nactiTelefon()));
        return vstup.getTelefon();
    }

    public int vyzadejVek() {
        do {
            try {
                System.out.println("Zadejte věk pojištěného:");
                if (!validator.validaceVstupu(vstup.nactivek())) {
                    System.out.printf("Nemůžeš zadat věk: %s ...\n ", vstup.nactivek());
                }
            } catch (Exception e) {
                System.out.println("Chyba, věk musí být ve formátu celého kladného nenulového čísla...");
                vstup.setVek(0); // v případě, že dojde k vyjímce, vynujue třída Vstup svůj atribut věk na "0"
            }
        } while (!validator.validaceVstupu(vstup.nactivek()));
        return vstup.getVek();
    }

    public void zahlasVyzvu(){
        if (vstup.getVolba() == 1){
            System.out.println("Data byla uložena. Pokračujte stisknutím klávesy ENTER...");
            vstup.cekejNaEnter();
        } else if (vstup.getVolba() > 1 && vstup.getVolba() < 5) {
            System.out.println("Pokračujte stisknutím klávesy ENTER...");
            vstup.cekejNaEnter();
        } else {
            System.out.println("Neplatná volba...");
        }
    }

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
        System.out.println();
        try {
            validator.validaceVstupu(vstup.nactiVolbu());
        } catch (Exception e) {
            vstup.setVolba(0); // v případě, že dojde k vyjímce, vynujue třída Vstup svůj atribut volba na "0"
        }
        return vstup.getVolba();
    }
}
