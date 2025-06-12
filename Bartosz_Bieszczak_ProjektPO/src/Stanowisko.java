public class Stanowisko extends DaneOsobowe{
    private String stanowsiko;
    String poprzednieStanowiska;



    public Stanowisko(String imie, String nazwisko, int rokUrodzenia, int numerTelefonu, String email) {
        super(imie, nazwisko, rokUrodzenia, numerTelefonu, email);
    }



    @Override
    public String wypiszDane() {
        return "Stanowisko{" +
                "stanowsiko='" + stanowsiko + '\'' +
                ", poprzednieStanowiska='" + poprzednieStanowiska + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", numerTelefonu=" + numerTelefonu +
                ", email='" + email + '\'' +
                '}';
    }
}
