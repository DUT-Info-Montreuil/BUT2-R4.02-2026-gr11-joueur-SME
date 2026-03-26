package mocks;

import universite_Paris8.iut.qdev.tp2026.gr11.commons.entites.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr11.enums.LangueEnum;
import universite_Paris8.iut.qdev.tp2026.gr11.interfaces.IservicesJoueur;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.DonneeInvalideException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.PseudoDejaExistantException;

public class SupprimerJoueurMock implements IservicesJoueur {

    private boolean joueurSupprime = false;

    @Override
    public void supprimerJoueur(String pseudo) {
        // Simule une suppression réussie
        this.joueurSupprime = true;
    }

    @Override
    public JoueurDTO getJoueur(String pseudo) {
        // Après suppression, on retourne null comme attendu
        if (joueurSupprime) return null;
        return new JoueurDTO("Alice", pseudo, 1999, LangueEnum.FR, new String[]{"Foot"});
    }

    @Override public void ajouterJoueur(JoueurDTO joueur) throws PseudoDejaExistantException {

    }
    @Override public void mettreAJourScore(String pseudo, int score)  throws DonneeInvalideException { }
    @Override public void mettreAJourCentresInteret(String pseudo, String[] centres)  { }
}