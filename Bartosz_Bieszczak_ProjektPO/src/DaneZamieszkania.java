public class DaneZamieszkania extends DaneOsobowe {
    public String ulica;
    public String miasto;
    public String kodPocztowy;
    public String numerDomu;

    //Konstruktor zawierające dane obecnej klasy oraz odziedzicozne po klasie DaneOsobowe

    public DaneZamieszkania(String imie, String nazwisko, int rokUrodzenia, int numerTelefonu, String email, int id, String stanowisko, String poprzednieStanowisko, String hobby, String ulica, String miasto, String kodPocztowy, String numerDomu) {
        super(imie, nazwisko, rokUrodzenia, numerTelefonu, email, id, stanowisko, poprzednieStanowisko, hobby);
        this.ulica = ulica;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.numerDomu = numerDomu;
    }

    public DaneZamieszkania(String imie, String nazwisko, int rokUrodzenia, String ulica, String miasto, String kodPocztowy, String numerDomu) {
        super(imie, nazwisko, rokUrodzenia);
        this.ulica = ulica;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.numerDomu = numerDomu;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.ulica = ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.kodPocztowy = kodPocztowy;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.numerDomu = numerDomu;
    }

    //Metoda wymuszona przez klasę abstract wypisująca dane

    @Override
    public String toString() {
        return super.toString() +
                ", Ulica: " + ulica +
                ", Miasto: " + miasto +
                ", Kod pocztowy: " + kodPocztowy +
                ", Numer domu: " + numerDomu;
    }
}
