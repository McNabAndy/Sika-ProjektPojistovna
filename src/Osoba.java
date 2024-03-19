/**
 * Třída představuje Osobu, které chci vytvořit pojištění
 */
public class Osoba {
    /**
     * Jméno osoby
     */
    private String jmeno;

    /**
     * Přijmení osoby
     */
    private String prijmeni;

    /**
     * Věk osoby
     */
    private int vek;

    /**
     * Telefon osoby
     */
    private String telefon;


    /**
     * Konstruktor, který nastaví jednotlivé atributy
     * @param jmeno Jméno osoby
     * @param prijmeni Příjmení osoby
     * @param vek Věk osoby
     * @param telefon Telefon Osoby
     */
    public Osoba (String jmeno, String prijmeni, int vek, String telefon){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    /**
     * Getter
     * @return jmeno
     */
    public String getJmeno(){
        return jmeno;
    }

    /**
     * Getter
     * @return prijmení
     */
    public String getPrijmeni(){
        return prijmeni;
    }
    /**
     * Getter
     * @return vek
     */
    public int getVek(){
        return vek;
    }

    /**
     * Getter
     * @return telefon
     */
    public String getTelefon(){
        return telefon;
    }

    /**
     * Překrytá metodoa pro výpis objektu Osoba
     * @return Naformátovaný textový řetezec, který je složen ze jména, příjmení, věku a telefonu osoby
     */
    @Override
    public String toString() {
        return String.format("%-14s %-14s %-5s %-14s", jmeno, prijmeni, vek, telefon);
    }
}
