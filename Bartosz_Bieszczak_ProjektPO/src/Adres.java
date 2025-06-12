public class Adres extends DaneOsobowe {
    public String ulica;
    public String miasto;
    public String kodPocztowy;
    public int numerBudynku;
    public int numerMieszkania;

    public Adres(String imie, String nazwisko, int rokUrodzenia, int numerTelefonu, String email) {
        super(imie, nazwisko, rokUrodzenia, numerTelefonu, email);
    }



    @Override
    public String wypiszDane() {
        return "";
    }
}
