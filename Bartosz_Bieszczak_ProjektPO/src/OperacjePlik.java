import java.io.*;
import java.util.List;

public class OperacjePlik {
    // Metoda zapisująca dane z CV do pliku tekstowego
    public void zapiszDaneZawodowe(List<DaneZawodowe> daneZawodowe, String DaneZawodowe) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DaneZawodowe))) {
            for (DaneZawodowe e : daneZawodowe) {
                writer.write(e.wypiszDane());
                writer.newLine();
            }
            System.out.println("Dane zostały zapisane:\n " + DaneZawodowe);
        } catch (IOException e) {
            System.err.println("Błąd zapisu: " + e.getMessage());
        }
    }

    public void zapiszDaneZamieszkania(List<DaneZamieszkania> daneZamieszkania, String DaneZamieszkania) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DaneZamieszkania))) {
            for (DaneZamieszkania e : daneZamieszkania) {
                writer.write(e.wypiszDane());
                writer.newLine();
            }
            System.out.println("Dane zostały zapisane:\n " + DaneZamieszkania);
        } catch (IOException e) {
            System.err.println("Błąd zapisu: " + e.getMessage());
        }
    }

    // Metoda odczytująca tekst zawarty w pilku i wyświetla go
    public void wczytajCV(String nazwaPliku) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
            String l;
            while ((l = reader.readLine()) != null) {
                System.out.println(l);
            }
        } catch (IOException e) {
            System.err.println("Błąd odczytu: " + e.getMessage());
        }
    }
}
