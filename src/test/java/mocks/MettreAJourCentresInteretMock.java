package mocks;

import universite_Paris8.iut.qdev.tp2026.gr11.commons.entites.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr11.enums.LangueEnum;
import universite_Paris8.iut.qdev.tp2026.gr11.interfaces.IservicesJoueur;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.DonneeInvalideException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.JoueurNonTrouveException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.PseudoDejaExistantException;

public class MettreAJourCentresInteretMock implements IservicesJoueur {

    private String[] centresMisAJour = null;

    @Override
    public void mettreAJourCentresInteret(String pseudo, String[] centresInteret) {
        // Simule la mise à jour des centres
        this.centresMisAJour = centresInteret;
    }

    @Override
    public JoueurDTO getJoueur(String pseudo) {
        // Retourne le joueur avec les nouveaux centres
        JoueurDTO joueur = new JoueurDTO("Alice", pseudo, 1999, LangueEnum.FR, centresMisAJour);
        return joueur;
    }

    @Override public void ajouterJoueur(JoueurDTO joueur)  throws PseudoDejaExistantException { }
    @Override
    public void supprimerJoueur(String pseudo) throws JoueurNonTrouveException { }
    @Override public void mettreAJourScore(String pseudo, int score) throws DonneeInvalideException {}
}