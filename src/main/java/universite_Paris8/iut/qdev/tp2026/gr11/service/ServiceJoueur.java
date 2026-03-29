package universite_Paris8.iut.qdev.tp2026.gr11.service;


import universite_Paris8.iut.qdev.tp2026.gr11.commons.entites.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr11.interfaces.IservicesJoueur;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.*;

import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.DonneeInvalideException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.JoueurNonTrouveException;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.PseudoDejaExistantException;

import java.util.HashMap;
import java.util.Map;

public class ServiceJoueur implements IservicesJoueur {

    // stockage en mémoire (pseudo -> joueur)
    private Map<String, JoueurDTO> joueurs = new HashMap<>();

    // =========================================================
    // ajouterJoueur
    // =========================================================
    @Override
    public void ajouterJoueur(JoueurDTO joueur) throws PseudoDejaExistantException {

        if (joueur == null || joueur.getPseudo() == null) {
            return; // protection
        }

        if (joueurs.containsKey(joueur.getPseudo())) {
            throw new PseudoDejaExistantException(joueur.getPseudo());
        }

        joueurs.put(joueur.getPseudo(), joueur);
    }

    // =========================================================
    // supprimerJoueur
    // =========================================================
    @Override
    public void supprimerJoueur(String pseudo) throws JoueurNonTrouveException {

        if (!joueurs.containsKey(pseudo)) {
            throw new JoueurNonTrouveException(pseudo);
        }

        joueurs.remove(pseudo);
    }

    // =========================================================
    // mettreAJourScore
    // =========================================================
    @Override
    public void mettreAJourScore(String pseudo, int nouveauScore) throws DonneeInvalideException {

        JoueurDTO joueur = joueurs.get(pseudo);

        if (joueur == null) {
            //
            return;
        }

        if (nouveauScore < 0) {
            throw new DonneeInvalideException("Score négatif interdit");
        }

        // ajout au score existant
        joueur.setScoreTotal(joueur.getScoreTotal() + nouveauScore);
    }

    // =========================================================
    // mettreAJourCentresInteret
    // =========================================================
    @Override
    public void mettreAJourCentresInteret(String pseudo, String[] centresInteret) {

        JoueurDTO joueur = joueurs.get(pseudo);

        if (joueur != null) {
            joueur.setCentresInteret(centresInteret);
        }
    }

    // =========================================================
    // getJoueur
    // =========================================================
    @Override
    public JoueurDTO getJoueur(String pseudo) {
        return joueurs.get(pseudo);
    }
}