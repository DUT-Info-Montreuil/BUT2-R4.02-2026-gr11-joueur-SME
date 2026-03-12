package universite_Paris8.iut.qdev.tp2026.gr11.interfaces;
import universite_Paris8.iut.qdev.tp2026.gr11.commons.entites.Dtos.JoueurDTO;

public interface IservicesJoueur {


    void ajouterJoueur(JoueurDTO joueur);


    void supprimerJoueur(String pseudo);


    void mettreAJourScore(String pseudo, int nouveauScore);


    void mettreAJourCentresInteret(String pseudo, String[] centresInteret);

}
