package mocks;

import universite_Paris8.iut.qdev.tp2026.gr11.commons.entites.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr11.enums.LangueEnum;
import universite_Paris8.iut.qdev.tp2026.gr11.interfaces.IservicesJoueur;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.DonneeInvalideException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.JoueurNonTrouveException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.PseudoDejaExistantException;

public class GetJoueurMock implements IservicesJoueur {

    @Override
    public JoueurDTO getJoueur(String pseudo) {
        // Retourne directement le joueur attendu en test
        return new JoueurDTO("Alice", "alice42", 1999, LangueEnum.FR, new String[]{"Foot", "Musique"});
    }

    @Override public void ajouterJoueur(JoueurDTO joueur)  throws PseudoDejaExistantException { }
    @Override
    public void supprimerJoueur(String pseudo) throws JoueurNonTrouveException { }
    @Override public void mettreAJourScore(String pseudo, int score) throws DonneeInvalideException {}
    @Override public void mettreAJourCentresInteret(String pseudo, String[] centres)  { }

}