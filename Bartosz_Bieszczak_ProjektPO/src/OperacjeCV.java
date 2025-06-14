import java.util.ArrayList;
import java.util.Scanner;

public class OperacjeCV implements Interface {
    private final ArrayList<DaneZamieszkania> daneZamieszkania = new ArrayList<DaneZamieszkania>();
    private final ArrayList<DaneOsobowe> daneOsobowe = new ArrayList<DaneOsobowe>();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void createAccount() {
        System.out.println("Podaj w jaki sposób została przeprowadzona rekrutacja\n1 -> Wewnętrznie\n2 -> Zewnętrznie");
        int rodzajRekrutacji = scanner.nextInt();

        if (rodzajRekrutacji >= 3 || rodzajRekrutacji <= 0) {
            throw new IllegalArgumentException();
        }

        System.out.println("Podaj imie:");
        String imie = scanner.next();
        System.out.println("Podaj nazwisko:");
        String nazwisko = scanner.next();
        System.out.println("Podaj rok urodzenia:");
        int rokUrodzenia = scanner.nextInt();
        System.out.println("Podaj numer telefonu:");
        int numerTelefonu = scanner.nextInt();
        System.out.println("Podaj email:");
        String email = scanner.next();
        System.out.println("Podaj id:");
        int id = scanner.nextInt();
        System.out.println("Podaj na jakie stanowisko chcesz aplikować:");
        String stanowisko = scanner.next();
        System.out.println("Podaj poprzednie stanowisko pracy:");
        String poprzednieStanowisko = scanner.next();
        System.out.println("Podaj swoje hobby:");
        String hobby = scanner.next();
        scanner.nextLine();

        if (rodzajRekrutacji == 1) {
            daneOsobowe.add(new DaneOsobowe(imie, nazwisko, rokUrodzenia, numerTelefonu, email, id, stanowisko, poprzednieStanowisko, hobby));
        }

        if (rodzajRekrutacji == 2) {
            System.out.println("Podaj ulice zamieszkania:");
            String ulica = scanner.next();
            System.out.println("Podaj zamieszkaną przez ciebie miejscowość:");
            String miasto = scanner.next();
            System.out.println("Podaj podaj kod pocztowy:");
            String kodPocztowy = scanner.next();
            System.out.println("Podaj numer domu:");
            String numerDomu = scanner.next();
            daneZamieszkania.add(new DaneZamieszkania(imie, nazwisko, rokUrodzenia, numerTelefonu, email, id, stanowisko, poprzednieStanowisko, hobby, ulica, miasto, kodPocztowy, numerDomu));
        }


    }

    @Override
    public void viewAccounts() {
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
                    System.out.println(x.toString());
                }
            }
        }

        if (rodzajRekrutacji == 2) {
            if (daneZamieszkania.isEmpty()) {
                System.out.println("Brak CV z rekrutacji zewnętrznej.");
            } else {
                for (DaneZamieszkania x : daneZamieszkania) {
                    System.out.println(x.toString());
                }
            }
        }
    }

    @Override
    public void updateAccounts() {
        System.out.println("Podaj w jaki sposób została przeprowadzona rekrutacja\n1 -> Wewnętrznie\n2 -> Zewnętrznie");
        int rodzajRekrutacji = scanner.nextInt();

        if (rodzajRekrutacji >= 3 || rodzajRekrutacji <= 0) {
            throw new IllegalArgumentException("Niepoprawna opcja rekrutacji.");
        }

        System.out.println("Podaj id CV");
        int id = scanner.nextInt();

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

            System.out.println("Co chcesz zmienić?\n1 - Email\n2 - Numer telefonu\n3 - Miasto");
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
    public void deleteAccounts() {
        System.out.println("Podaj w jaki sposób została przeprowadzona rekrutacja\n1 -> Wewnętrznie\n2 -> Zewnętrznie");
        int rodzajRekrutacji = scanner.nextInt();

        if (rodzajRekrutacji >= 3 || rodzajRekrutacji <= 0) {
            throw new IllegalArgumentException("Niepoprawna opcja rekrutacji.");
        }

        System.out.println("Podaj ID użytkownika do usunięcia:");
        int idDoUsuniecia = scanner.nextInt();

        boolean usunieto = false;

        if (rodzajRekrutacji == 1) {
            usunieto = daneOsobowe.removeIf(x -> x.getId() == idDoUsuniecia);
        } else {
            usunieto = daneZamieszkania.removeIf(x -> x.getId() == idDoUsuniecia);
        }

        if (usunieto) {
            System.out.println("Użytkownik o ID " + idDoUsuniecia + " został usunięty.");
        } else {
            System.out.println("Nie znaleziono użytkownika o ID " + idDoUsuniecia + ".");
        }
    }


    public DaneOsobowe findAccountById(int id) {
        for (DaneOsobowe x : daneOsobowe) {
            if (x.getId() == id) return x;
        }
        return null;
    }

    public DaneZamieszkania findAccountByIdZewnetrzna(int id) {
        for (DaneZamieszkania x : daneZamieszkania) {
            if (x.getId() == id) return x;
        }
        return null;
    }
}

