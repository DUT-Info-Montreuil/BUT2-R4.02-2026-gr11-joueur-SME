package universite_Paris8.iut.qdev.tp2026.gr11.interfaces;
import universite_Paris8.iut.qdev.tp2026.gr11.commons.entites.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.DonneeInvalideException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.JoueurNonTrouveException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.PseudoDejaExistantException;

public interface IservicesJoueur {


    void ajouterJoueur(JoueurDTO joueur) throws PseudoDejaExistantException;


    void supprimerJoueur(String pseudo) throws JoueurNonTrouveException;


    void mettreAJourScore(String pseudo, int nouveauScore) throws DonneeInvalideException;


    void mettreAJourCentresInteret(String pseudo, String[] centresInteret);

    JoueurDTO getJoueur(String pseudo);
}
