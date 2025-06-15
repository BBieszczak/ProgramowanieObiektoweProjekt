import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {

    //Metoda wyświetlana przy uruchomieniu programu
    public static void startProgramu() {
        Scanner scanner = new Scanner(System.in);
        OperacjeCV operacjeCV = new OperacjeCV();
        System.out.println("Witaj w programie do zarządzania CV");
        int numerOperacji;
        boolean d = true;
        while (d) {
            // menu użytkownika
            while (true) {
                System.out.println("=== Wybierz opcję ===");
                System.out.println("1 -> Dodaj nowe CV \n2 -> Wyświetl CV \n3 -> Edytuj CV\n4 -> Usuń CV\n5 -> Znajdź CV po ID\n6 -> Zakończ działanie");
                numerOperacji = scanner.nextInt();
                if (numerOperacji == 1 || numerOperacji == 2 || numerOperacji == 3 || numerOperacji == 4 || numerOperacji == 5 || numerOperacji == 6) {
                    break;
                } else {
                    System.out.println("Podałeś błeną opcje wprowadź cydrę jeszcze raz");
                }
            }
            //Instrukacja case przekierewująca do dopowiedniej metody w klasie OperacjeCV
            switch (numerOperacji) {
                case 1 -> {
                    System.out.println("Wybrałeś opcję dodaj CV");
                    operacjeCV.createCV();
                }
                case 2 -> {
                    System.out.println("Wybrałeś opcję wyświetl CV");
                    operacjeCV.viewCV();
                }
                case 3 -> {
                    System.out.println("Wybrałeś opcję edytuj CV");
                    operacjeCV.updateCV();
                }
                case 4 -> {
                    System.out.println("Wybrałeś opcję usuń CV");
                    System.out.println("Podaj id CV, które chcesz usunąć");
                    operacjeCV.deleteCV();
                }
                case 5 -> {
                    System.out.println("Podaj w jaki sposób została przeprowadzona rekrutacja\n1 -> Wewnętrznie\n2 -> Zewnętrznie");
                    int rodzajRekrutacji = scanner.nextInt();

                    if (rodzajRekrutacji >= 3 || rodzajRekrutacji <= 0) {
                        throw new IllegalArgumentException();
                    }

                    System.out.println("Wybrałeś opcję znajdź CV po id\n");
                    System.out.println("Podaj id CV, które chcesz znaleźć");
                    int id = scanner.nextInt();

                    if (rodzajRekrutacji == 1) {
                        operacjeCV.findAccountById(id);
                    } else {
                        operacjeCV.findAccountByIdZewnetrzna(id);
                    }
                }
                case 6 -> {
                    d = false;
                }
            }

        }
    }
}


