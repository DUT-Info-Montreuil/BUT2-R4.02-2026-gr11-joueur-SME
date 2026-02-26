package universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions;

public class PseudoDejaExistantException extends Exception {
    public PseudoDejaExistantException(String message) {
        super("Ce pseudo est déjà utilisé");
    }
}