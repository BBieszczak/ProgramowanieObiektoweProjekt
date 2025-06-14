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
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.nazwisko = nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.rokUrodzenia = rokUrodzenia;
    }

    public int getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(int numerTelefonu) {
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.numerTelefonu = numerTelefonu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowsiko) {
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            //throw new NieprawidłoweDaneException("Pole nie może być puste");
        }
        this.stanowisko = stanowisko;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.hobby = hobby;
    }

    public String getPoprzednieStanowisko() {
        return poprzednieStanowisko;
    }

    public void setPoprzednieStanowisko(String poprzednieStanowisko) {
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.poprzednieStanowisko = poprzednieStanowisko;
    }

    @Override
    public String toString() {
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
