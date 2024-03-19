/**
 * Třída představuje Evidenci pojištěných osob
 */
public class Evidence {
    public static void main(String[] args) {
        Vystup vystup = new Vystup();  // Založení instabce Vystup
        Databaze databaze = new Databaze(); // Založení instance Databaze
        boolean pokracuj = true;
        do {
            switch (vystup.vytiskniMenu()) {
                case 1:
                    databaze.pridejPojisteneho(new Osoba(vystup.vyzadejJmeno(), vystup.vyzadejPrijmeni(), vystup.vyzadejVek(), vystup.vyzadejTelefon()));
                    vystup.zahlasVyzvu();
                    break;
                case 2:
                    for (Osoba osoba : databaze.getDatabazePojistenych()) {
                        System.out.println(osoba);
                    }
                    vystup.zahlasVyzvu();
                    break;
                case 3:
                    for (Osoba osoba : databaze.vyhledejPojisteneho(vystup.vyzadejJmeno(), vystup.vyzadejPrijmeni())) {
                        System.out.println(osoba);
                    }
                    vystup.zahlasVyzvu();
                    break;
                case 4:
                    pokracuj = false;
                    break;
                default:
                    vystup.zahlasVyzvu();
                    break;
            }
        } while (pokracuj);

    }
}
