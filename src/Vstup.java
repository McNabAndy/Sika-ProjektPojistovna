import java.util.Scanner;

/**
 * Třída přijíma a předává uživateslké vstupy ke zpracování
 */

public class Vstup {
    /**
     * Uživatelská volba
     */
    private int volba;

    /**
     * Jméno zadané úživatelem
     */
    private String jmeno;

    /**
     * Příjmení zadané úživatelem
     */
    private String prijmeni;

    /**
     * telefon zadaný úživatelem
     */
    private String telefon;

    /**
     * Věk zadaný úživatelem
     */
    private int vek;

    /**
     * Založení instance Scanner
     */
    public Scanner scanner = new Scanner(System.in);

    /**
     * Načtení a otrimování vstupu - jména od uživatele
     * @return jmeno
     */
    public String nactiJmeno(){
        jmeno = scanner.nextLine().trim();
        return jmeno;
    }

    /**
     * Getter pro získání jména
     * @return jmeno
     */
    public String getJmeno(){
        return jmeno;
    }

    /**
     * Načtení a otrimování vstupu - příjmení od uživatele
     * @return prijmeni
     */
    public String nactiPrijmeni(){
        prijmeni = scanner.nextLine().trim();
        return prijmeni;
    }

    /**
     * Getter pro zisk příjmení
     * @return prijmeni
     */
    public String getPrijmeni(){
        return prijmeni;
    }

    /**
     * Načtení a otrimování vstupu - telefon od uživatele
     * @return telefon
     */
    public String nactiTelefon(){
        telefon = scanner.nextLine().trim();
        return telefon;
    }

    /**
     * Getter pro zisk telefonu
     * @return telefon
     */
    public String getTelefon(){
        return telefon;
    }

    /**
     * Načtení a otrimování vstupu - věk od uživatele
     * @return vek
     */
    public int nactivek(){
        vek = Integer.parseInt(scanner.nextLine().trim());
        return vek;
    }

    /**
     * Setter pro nastavení věku
     * @param vek Věk, který chci nastavit
     */
    public void setVek(int vek){
        this.vek = vek;
    }

    /**
     * Getter pro zisk věku
     * @return vek
     */
    public int getVek(){
        return vek;
    }

    /**
     * Načttení uživateslké volby
     * @return volba
     */
    public int nactiVolbu(){
        volba = Integer.parseInt(scanner.nextLine().trim());
        return volba;
    }

    /**
     * Getter pro zisk volby uživatele
     * @return volba
     */
    public int getVolba(){
        return volba;
    }

    /**
     * Setter pro nastavení volby
     * @param volba Volbu, kterou chci nastavit
     */
    public void setVolba(int volba){
        this.volba = volba;
    }

    /**
     * Metoda čekající na stisk klávesy ENTER
     */
    public void cekejNaEnter(){
        scanner.nextLine();
    }




}
