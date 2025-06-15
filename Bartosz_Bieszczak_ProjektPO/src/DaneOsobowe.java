public class DaneOsobowe {
    protected String imie;
    protected String nazwisko;
    protected int rokUrodzenia;
    protected int numerTelefonu;
    protected String email;
    protected int id;
    protected String stanowisko;
    protected String poprzednieStanowisko;
    protected String hobby;

    //Utworzenie przeciążonego konstruktora
    public DaneOsobowe(String imie, String nazwisko, int rokUrodzenia, int numerTelefonu, String email, int id, String stanowisko, String poprzednieStanowisko, String hobby) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
        this.id = id;
        this.stanowisko = stanowisko;
        this.poprzednieStanowisko = poprzednieStanowisko;
        this.hobby = hobby;
    }

    protected DaneOsobowe(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    //Utworzenie geterów i seterów
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko == null || nazwisko.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być nazwisko");
        }
        this.nazwisko = nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        if (rokUrodzenia <= 1900 || rokUrodzenia >= 2010) {
            throw new IllegalArgumentException("Rok urodzeia musi być wieksze od 1900 i mniejszy niż 2010.");
        }
        this.rokUrodzenia = rokUrodzenia;
    }

    public int getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(int numerTelefonu) {
        if (numerTelefonu <= 0) {
            throw new IllegalArgumentException("Numer telefonu nie może być ujemny.");
        }
        this.numerTelefonu = numerTelefonu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email== null || email.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole email nie może być puste");
        }
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID musi być wieksze od zera.");
        }
        this.id = id;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        if (stanowisko == null || stanowisko.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole stanowisko nie może być puste");
        }
        this.stanowisko = stanowisko;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        if (hobby == null || hobby.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole hobby nie może być puste");
        }
        this.hobby = hobby;
    }

    public String getPoprzednieStanowisko() {
        return poprzednieStanowisko;
    }

    public void setPoprzednieStanowisko(String poprzednieStanowisko) {
        if (poprzednieStanowisko == null || poprzednieStanowisko.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole poprzdnie stanowisko nie może być puste");
        }
        this.poprzednieStanowisko = poprzednieStanowisko;
    }

    //metoda wyświetlająca dane
    protected String podajDane() {
        return "Imię: " + imie +
                ", Nazwisko: " + nazwisko +
                ", Rok urodzenia: " + rokUrodzenia +
                ", Telefon: " + numerTelefonu +
                ", Email: " + email +
                ", ID: " + id +
                ", Stanowisko: " + stanowisko +
                ", Poprzednie stanowisko: " + poprzednieStanowisko +
                ", Hobby: " + hobby;
    }

}
