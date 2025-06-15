public class DaneZamieszkania extends DaneOsobowe {
    protected String ulica;
    protected String miasto;
    protected String kodPocztowy;
    protected String numerDomu;

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
        if (ulica == null || ulica.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole ulica nie może być puste");
        }
        this.ulica = ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if (miasto == null || miasto.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole miasto nie może być puste");
        }
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if (kodPocztowy == null || kodPocztowy.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole kodPocztowy nie może być puste");
        }
        this.kodPocztowy = kodPocztowy;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        if ( numerDomu == null ||  numerDomu.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.numerDomu = numerDomu;
    }

    //metoda wyświetlająca dane z obecnej klasy i klasy dziedzicącej
    @Override
    protected String podajDane() {
        return super.toString() +
                ", Ulica: " + ulica +
                ", Miasto: " + miasto +
                ", Kod pocztowy: " + kodPocztowy +
                ", Numer domu: " + numerDomu;
    }
}
