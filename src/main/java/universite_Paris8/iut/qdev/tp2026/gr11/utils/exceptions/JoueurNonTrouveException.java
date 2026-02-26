package universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions;

public class JoueurNonTrouveException extends Exception {
    public JoueurNonTrouveException(String message) {
        super("Joueur non trouvé");
    }
}