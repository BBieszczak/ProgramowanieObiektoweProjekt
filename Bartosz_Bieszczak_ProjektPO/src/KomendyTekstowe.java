import java.util.Scanner;

public class KomendyTekstowe {

    //Metoda wyświetlana przy uruchomieniu programu
    public static void startProgramu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w programie do zarządzania CV");

        int numerOperacji;
        while (true) {
            System.out.println("===Wybierz opcję===");
            System.out.println("1 -> Dodaj nowe CV \n2 -> Usuń CV \n3 -> Przeglądaj CV\n");
            numerOperacji = scanner.nextInt();
            if (numerOperacji == 1 || numerOperacji == 2 || numerOperacji == 3 || numerOperacji == 4) {
                break;
            } else {
                System.out.println("Podałeś błeną opcje wprowadź cydrę jeszcze raz");
            }

            //Instrukacja case przekierewująca do dopowiedniej metody w klasie OperacjeCV
            switch (numerOperacji) {
                case 1 ->
                case 2 ->
                case 3 ->
                case 4 ->
                case 5 ->
                default ->

            }
        }
    }
}
