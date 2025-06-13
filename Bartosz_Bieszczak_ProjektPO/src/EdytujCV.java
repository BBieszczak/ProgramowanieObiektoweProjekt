import java.io.IOException;
import java.util.*;


public class EdytujCV {

    static ArrayList<DaneZawodowe> daneZawodowe = new ArrayList<>();
    static ArrayList<Adres> adresy = new ArrayList<>();

    // Metoda dodające informacje z CV
    public static void dodawanie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===MENU DODAWANIA POJAZDU===");
        System.out.println("1 -> Dodaj dane personalne");
        System.out.println("2 -> Dodaj dane zawodowe");
        System.out.print("Wybierz opcję: ");

        int numerOpcji = scanner.nextInt();
        scanner.nextLine(); // Czyścimy bufor
    }

}
