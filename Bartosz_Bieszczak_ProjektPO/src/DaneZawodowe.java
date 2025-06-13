public class DaneZawodowe extends DaneOsobowe{
    public String stanowsiko;
    String poprzednieStanowisko;
    String hobby;



    public DaneZawodowe(String imie, String nazwisko, int rokUrodzenia, int numerTelefonu, String email, String stanowisko, String poprzednieStanowisko, String hobby) {
        super(imie, nazwisko, rokUrodzenia, numerTelefonu, email); // ID przypisuje nadklasa DaneOsobowe
        this.stanowsiko = stanowisko;
        this.poprzednieStanowisko = poprzednieStanowisko;
        this.hobby = hobby;
    }


    //Metoda wymuszona przez klasę abstract wypisująca dane
    @Override
    public String wypiszDane() {
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
