import java.util.ArrayList;
import java.util.Scanner;

public class OperacjeCV implements Interface {
    private final ArrayList<DaneZamieszkania> daneZamieszkania = new ArrayList<DaneZamieszkania>();
    private final ArrayList<DaneOsobowe> daneOsobowe = new ArrayList<DaneOsobowe>();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    //metoda tworząca CV
    public void createCV() {
        System.out.println("Podaj w jaki sposób została przeprowadzona rekrutacja\n1 -> Wewnętrznie\n2 -> Zewnętrznie");
        int rodzajRekrutacji = scanner.nextInt();

        if (rodzajRekrutacji >= 3 || rodzajRekrutacji <= 0) {
            throw new IllegalArgumentException();
        }

        System.out.println("Podaj imie:");
        String imie = scanner.next();
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        System.out.println("Podaj nazwisko:");
        String nazwisko = scanner.next();
        if (nazwisko == null || nazwisko.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być nazwisko");
        }
        System.out.println("Podaj rok urodzenia:");
        int rokUrodzenia = scanner.nextInt();
        if (rokUrodzenia <= 1900 || rokUrodzenia >= 2010) {
            throw new IllegalArgumentException("Rok urodzeia musi być wieksze od 1900 i mniejszy niż 2010.");
        }
        System.out.println("Podaj numer telefonu:");
        int numerTelefonu = scanner.nextInt();
        if (numerTelefonu <= 0) {
            throw new IllegalArgumentException("Numer telefonu nie może być ujemny.");
        }
        System.out.println("Podaj email:");
        String email = scanner.next();
        if (email== null || email.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole email nie może być puste");
        }
        System.out.println("Podaj id:");
        int id = scanner.nextInt();
        if (id <= 0) {
            throw new IllegalArgumentException("ID nie może być ujemny.");
        }
        System.out.println("Podaj na jakie stanowisko chcesz aplikować:");
        String stanowisko = scanner.next();
        if (stanowisko == null || stanowisko.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole stanowisko nie może być puste");
        }
        System.out.println("Podaj poprzednie stanowisko pracy:");
        String poprzednieStanowisko = scanner.next();
        System.out.println("Podaj swoje hobby:");
        String hobby = scanner.next();
        scanner.nextLine();
        if (hobby == null || hobby.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole hobby nie może być puste");
        }

        if (rodzajRekrutacji == 1) {
            daneOsobowe.add(new DaneOsobowe(imie, nazwisko, rokUrodzenia, numerTelefonu, email, id, stanowisko, poprzednieStanowisko, hobby));
        }

        if (rodzajRekrutacji == 2) {
            System.out.println("Podaj ulice zamieszkania:");
            String ulica = scanner.next();
            if (ulica == null || ulica.replace(" ", " ").isEmpty()) {
                throw new IllegalArgumentException("Pole ulica nie może być puste");
            }
            System.out.println("Podaj zamieszkaną przez ciebie miejscowość:");
            String miasto = scanner.next();
            if (miasto == null || miasto.replace(" ", " ").isEmpty()) {
                throw new IllegalArgumentException("Pole miasto nie może być puste");
            }
            System.out.println("Podaj podaj kod pocztowy:");
            String kodPocztowy = scanner.next();
            if (kodPocztowy == null || kodPocztowy.replace(" ", " ").isEmpty()) {
                throw new IllegalArgumentException("Pole kodPocztowy nie może być puste");
            }
            System.out.println("Podaj numer domu:");
            String numerDomu = scanner.next();
            if ( numerDomu == null ||  numerDomu.replace(" ", " ").isEmpty()) {
                throw new IllegalArgumentException("Pole imie nie może być puste");
            }
            daneZamieszkania.add(new DaneZamieszkania(imie, nazwisko, rokUrodzenia, numerTelefonu, email, id, stanowisko, poprzednieStanowisko, hobby, ulica, miasto, kodPocztowy, numerDomu));
        }
    }

    @Override
    //metoda wyświetlająca CV
    public void viewCV() {
        System.out.println("Podaj w jaki sposób została przeprowadzona rekrutacja\n1 -> Wewnętrznie\n2 -> Zewnętrznie");
        int rodzajRekrutacji = scanner.nextInt();

        if (rodzajRekrutacji >= 3 || rodzajRekrutacji <= 0) {
            throw new IllegalArgumentException("Niepoprawna opcja rekrutacji.");
        }

        if (rodzajRekrutacji == 1) {
            if (daneOsobowe.isEmpty()) {
                System.out.println("Brak CV z rekrutacji wewnętrznej.");
            } else {
                for (DaneOsobowe x : daneOsobowe) {
                    System.out.println(x.podajDane());
                }
            }
        }

        if (rodzajRekrutacji == 2) {
            if (daneZamieszkania.isEmpty()) {
                System.out.println("Brak CV z rekrutacji zewnętrznej.");
            } else {
                for (DaneZamieszkania x : daneZamieszkania) {
                    System.out.println(x.podajDane());
                }
            }
        }
    }

    @Override
    //metoda aktualizująca CV
    public void updateCV() {
        System.out.println("Podaj w jaki sposób została przeprowadzona rekrutacja\n1 -> Wewnętrznie\n2 -> Zewnętrznie");
        int rodzajRekrutacji = scanner.nextInt();

        if (rodzajRekrutacji >= 3 || rodzajRekrutacji <= 0) {
            throw new IllegalArgumentException("Niepoprawna opcja rekrutacji.");
        }

        System.out.println("Podaj id CV");
        int id = scanner.nextInt();

        if (id <= 0) {
            throw new IllegalArgumentException("ID nie może być ujemne.");
        }

        if (rodzajRekrutacji == 1) {
            DaneOsobowe osoba = findAccountById(id);
            if (osoba == null) {
                System.out.println("Nie znaleziono użytkownika.");
                return;
            }

            System.out.println("Co chcesz zmienić?\n1 -> Email\n2 -> Numer telefonu\n3 -> Hobby");
            int opcja = scanner.nextInt();

            switch (opcja) {
                case 1 -> {
                    System.out.println("Podaj nowy email:");
                    osoba.setEmail(scanner.next());
                }

                case 2 -> {
                    System.out.println("Podaj nowy numer telefonu:");
                    osoba.setNumerTelefonu(scanner.nextInt());
                }

                case 3 -> {
                    System.out.println("Podaj nowe hobby:");
                    scanner.nextLine(); // Czyszczenie bufora
                    osoba.setHobby(scanner.nextLine());
                }
                default -> System.out.println("Niepoprawna opcja.");

            }
        } else {
            DaneZamieszkania osoba = findAccountByIdZewnetrzna(id);
            if (osoba == null) {
                System.out.println("Nie znaleziono użytkownika.");
                return;
            }

            System.out.println("Co chcesz zmienić?\n1 -> Email\n2 -> Numer telefonu\n3 -> Miasto");
            int opcja = scanner.nextInt();

            switch (opcja) {
                case 1 -> {
                    System.out.println("Podaj nowy email:");
                    osoba.setEmail(scanner.next());
                }

                case 2 -> {
                    System.out.println("Podaj nowy numer telefonu:");
                    osoba.setNumerTelefonu(scanner.nextInt());
                }

                case 3 -> {
                    System.out.println("Podaj nowe miasto:");
                    osoba.setMiasto(scanner.next());
                }

                default -> System.out.println("Niepoprawna opcja.");

            }
        }
    }


    @Override
    //Metoda usuwająca CV
    public void deleteCV() {
        System.out.println("Podaj w jaki sposób została przeprowadzona rekrutacja\n1 -> Wewnętrznie\n2 -> Zewnętrznie");
        int rodzajRekrutacji = scanner.nextInt();

        if (rodzajRekrutacji >= 3 || rodzajRekrutacji <= 0) {
            throw new IllegalArgumentException("Niepoprawna opcja rekrutacji.");
        }

        System.out.println("Podaj ID użytkownika do usunięcia:");
        int id = scanner.nextInt();
        if (id <= 0) {
            throw new IllegalArgumentException("ID nie może być ujemne.");
        }

        boolean usunieto = false;

        if (rodzajRekrutacji == 1) {
            usunieto = daneOsobowe.removeIf(x -> x.getId() == id);
        } else {
            usunieto = daneZamieszkania.removeIf(x -> x.getId() == id);
        }

        if (usunieto) {
            System.out.println("Użytkownik o ID " + id + " został usunięty.");
        } else {
            System.out.println("Nie znaleziono użytkownika o ID " + id + ".");
        }
    }

    //metody znajdujące CV po id
    public DaneOsobowe findAccountById(int id) {
        for (DaneOsobowe x : daneOsobowe) {
            if (x.getId() == id) {
                System.out.println(x.podajDane());
                return x;
            }
        }
        return null;
    }

    public DaneZamieszkania findAccountByIdZewnetrzna(int id) {
        for (DaneZamieszkania x : daneZamieszkania) {
            if (x.getId() == id) {
                System.out.println(x.podajDane());
                return x;
            }
        }
        return null;
    }
}

