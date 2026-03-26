package mocks;

import universite_Paris8.iut.qdev.tp2026.gr11.commons.entites.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr11.interfaces.IservicesJoueur;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.DonneeInvalideException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.JoueurNonTrouveException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.PseudoDejaExistantException;

public class AjouterJoueurMock implements IservicesJoueur {

    private JoueurDTO joueurAjoute = null;

    @Override
    public void ajouterJoueur(JoueurDTO joueur) throws PseudoDejaExistantException {
        // Simule un ajout réussi
        this.joueurAjoute = joueur;
    }

    @Override
    public JoueurDTO getJoueur(String pseudo) {
        return joueurAjoute;
    }

    @Override
    public void supprimerJoueur(String pseudo) throws JoueurNonTrouveException { }

    @Override
    public void mettreAJourScore(String pseudo, int score) throws DonneeInvalideException { }

    @Override
    public void mettreAJourCentresInteret(String pseudo, String[] centres) { }
}
