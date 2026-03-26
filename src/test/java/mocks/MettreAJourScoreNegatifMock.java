package mocks;

import universite_Paris8.iut.qdev.tp2026.gr11.commons.entites.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr11.interfaces.IservicesJoueur;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.DonneeInvalideException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.JoueurNonTrouveException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.PseudoDejaExistantException;

public class MettreAJourScoreNegatifMock implements IservicesJoueur {

    @Override
    public void mettreAJourScore(String pseudo, int pointsAjoutes) throws DonneeInvalideException {
        throw new DonneeInvalideException("Score négatif interdit");
    }

    @Override public void ajouterJoueur(JoueurDTO joueur) throws PseudoDejaExistantException { }
    @Override public void supprimerJoueur(String pseudo) throws JoueurNonTrouveException { }
    @Override public JoueurDTO getJoueur(String pseudo)                               { return null; }
    @Override public void mettreAJourCentresInteret(String pseudo, String[] centres)  { }
}