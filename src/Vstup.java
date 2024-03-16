import java.util.Scanner;

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

    public String nactiJmeno(){
        jmeno = scanner.nextLine().trim();
        return jmeno;
    }

    public String getJmeno(){
        return jmeno;
    }

    public String nactiPrijmeni(){
        prijmeni = scanner.nextLine().trim();
        return prijmeni;
    }

    public String getPrijmeni(){
        return prijmeni;
    }

    public String nactiTelefon(){
        telefon = scanner.nextLine().trim();
        return telefon;
    }

    public String getTelefon(){
        return telefon;
    }

    public int nactivek(){
        vek = Integer.parseInt(scanner.nextLine().trim());
        return vek;
    }

    public void setVek(int vek){
        this.vek = vek;
    }

    public int getVek(){
        return vek;
    }



    public int nactiVolbu(){
        volba = Integer.parseInt(scanner.nextLine().trim());
        return volba;
    }



    public int getVolba(){
        return volba;
    }

    public void setVolba(int volba){
        this.volba = volba;
    }

    public void cekejNaEnter(){
        scanner.nextLine();
    }




}
