public class DaneException extends Exception {
    public DaneException(String wiadomość) {
        super(wiadomość);
    }
}

class RokUrodzeniaException extends DaneException {
    public RokUrodzeniaException() {
        super("Rok urodzenia musi być większy niż rok 1900 oraz nie może większy niż aktualny rok!");
    }
}

class NiepełnoletniException extends DaneException {
    public NiepełnoletniException() {
        super("Rok urodzenia jest zbyt niski aby podjąć prace!");
    }
}

class NieprawidłoweDaneException extends DaneException {
    public NieprawidłoweDaneException() {
        super("Wprowadzone dane są nieprawidłowe");
    }
}
