public class DaneZawodowe extends DaneOsobowe{
    public String stanowsiko;
    protected String poprzednieStanowisko;
    protected String hobby;



    public DaneZawodowe(String imie, String nazwisko, int rokUrodzenia, int numerTelefonu, String email, int id, String stanowisko, String poprzednieStanowisko, String hobby) {
        super(imie, nazwisko, rokUrodzenia, numerTelefonu, email,id); // ID przypisuje nadklasa DaneOsobowe
        this.stanowsiko = stanowisko;
        this.poprzednieStanowisko = poprzednieStanowisko;
        this.hobby = hobby;
    }

    public String getStanowsiko() {
        return stanowsiko;
    }

    public void setStanowsiko(String stanowsiko) {
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throws NieprawidłoweDaneException();
        }
        this.stanowsiko = stanowsiko;
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

    //Metoda wymuszona przez klasę abstract wypisująca dane
    @Override
    protected String wypiszDane() {
        return "DaneZawodowe{" +
                "hobby='" + hobby + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", numerTelefonu=" + numerTelefonu +
                ", email='" + email + '\'' +
                ", stanowsiko='" + stanowsiko + '\'' +
                ", poprzednieStanowisko='" + poprzednieStanowisko + '\'' +
                '}';
    }
}
