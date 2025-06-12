public class DaneException extends Exception {
    public DaneException(String wiadomość) {
        super(wiadomość);
    }
}

class rokUrodzeniaException extends DaneException {
    public rokUrodzeniaException() {
        super("Rok urodzenia musi być większy niż rok 1900 oraz nie może większy niż aktualny rok!");
    }
}

class niepełnoletniException extends DaneException {
    public niepełnoletniException() {
        super("Rok urodzenia jest zbyt niski aby podjąć prace!");
    }
}
