public class Adres extends DaneOsobowe {
    public String ulica;
    public String miasto;
    public String kodPocztowy;
    public String numerDomu;

    //Konstruktor zawierające dane obecnej klasy oraz odziedzicozne po klasie DaneOsobowe
    public Adres(String imie, String nazwisko, int rokUrodzenia, int numerTelefonu, String email, String miasto, String ulica, String numerDomu, String kodPocztowy) {
        super(imie, nazwisko, rokUrodzenia, numerTelefonu, email);
        this.miasto = miasto;
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        this.numerDomu = numerDomu;
    }

    //Metoda wymuszona przez klasę abstract wypisująca dane
    @Override
    public String wypiszDane() {
        return "Adres{" +
                "numerDomu='" + numerDomu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", numerTelefonu=" + numerTelefonu +
                ", email='" + email + '\'' +
                ", ulica='" + ulica + '\'' +
                ", miasto='" + miasto + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                '}';
    }
}
