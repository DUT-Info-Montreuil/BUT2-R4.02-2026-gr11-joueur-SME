package mocks;

import universite_Paris8.iut.qdev.tp2026.gr11.commons.entites.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr11.interfaces.IservicesJoueur;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.DonneeInvalideException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.JoueurNonTrouveException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.PseudoDejaExistantException;

public class SupprimerJoueurInexistantMock implements IservicesJoueur {

    @Override
    public void supprimerJoueur(String pseudo) throws JoueurNonTrouveException {
        throw new JoueurNonTrouveException(pseudo);
    }

    @Override public void ajouterJoueur(JoueurDTO joueur)  throws PseudoDejaExistantException { }
    @Override public JoueurDTO getJoueur(String pseudo)                               { return null; }
    @Override public void mettreAJourScore(String pseudo, int score)  throws DonneeInvalideException { }
    @Override public void mettreAJourCentresInteret(String pseudo, String[] centres)  { }

}