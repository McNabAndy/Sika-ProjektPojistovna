/**
 * Třída představuje, validátor vstupů od uživatele
 */
public class Validator {

    /**
     * Metoda kontrolující délku vstupu
     * @param vstup Textovž řetezec
     * @return true v případě, že je na vstupu textový řetězec, jinak false
     */
    public boolean validaceVstupu(String vstup){
        if (vstup.length() > 0) {
            return true;
        }
        return false;
    }

    /**
     * Metoda kontrolující velikost vstupu
     * @param vstup Číselná hodnota
     * @return true v případě, že je vstup větší jak 0, jinak false
     */
    public boolean validaceVstupu(int vstup){  // přetížená metoda
        if (vstup > 0) {
            return true;
        }
        return false;
    }
}
