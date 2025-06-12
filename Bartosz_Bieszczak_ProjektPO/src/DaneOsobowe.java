public abstract class DaneOsobowe {
    protected String imie;
    protected String nazwisko;
    protected int rokUrodzenia;
    protected int numerTelefonu;
    protected String email;

    //Utworzenie przeciążonego konstruktora
    public DaneOsobowe(String imie, String nazwisko, int rokUrodzenia, int numerTelefonu, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
    }

    public DaneOsobowe(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    //Utworzenie geterów i seterów
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    public int getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(int numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Dodanie metody abstrakcyjnej
    public abstract String wypiszDane();
}
