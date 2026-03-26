package mocks;

import universite_Paris8.iut.qdev.tp2026.gr11.commons.entites.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr11.enums.LangueEnum;
import universite_Paris8.iut.qdev.tp2026.gr11.interfaces.IservicesJoueur;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.DonneeInvalideException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.JoueurNonTrouveException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.PseudoDejaExistantException;

public class MettreAJourScoreMock implements IservicesJoueur {

    // Score attendu en retour de test : 80 points
    private int scoreTotal = 0;

    @Override
    public void mettreAJourScore(String pseudo, int pointsAjoutes)  throws DonneeInvalideException {
        // Simule l'ajout de points
        this.scoreTotal += pointsAjoutes;
    }

    @Override
    public JoueurDTO getJoueur(String pseudo) {
        // Retourne le joueur avec le score mis à jour
        JoueurDTO joueur = new JoueurDTO("Alice", pseudo, 1999, LangueEnum.FR, new String[]{"Foot"});
        joueur.setScoreTotal(scoreTotal);
        return joueur;
    }

    @Override public void ajouterJoueur(JoueurDTO joueur)  throws PseudoDejaExistantException { }
    @Override
    public void supprimerJoueur(String pseudo) throws JoueurNonTrouveException { }
    @Override public void mettreAJourCentresInteret(String pseudo, String[] centres)  { }
}