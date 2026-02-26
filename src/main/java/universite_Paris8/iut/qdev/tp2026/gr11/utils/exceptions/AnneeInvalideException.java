package universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions;

public class AnneeInvalideException extends Exception {
    public AnneeInvalideException(String message) {
        super("L'année est invalide");
    }
}