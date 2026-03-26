package universite_Paris8.iut.qdev.tp2026.gr11;

import mocks.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import universite_Paris8.iut.qdev.tp2026.gr11.commons.entites.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr11.enums.LangueEnum;
import universite_Paris8.iut.qdev.tp2026.gr11.interfaces.IservicesJoueur;
import universite_Paris8.iut.qdev.tp2026.gr11.utils.exceptions.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests ServicesJoueur")
class ServicesJoueurTest {

    // =========================================================
    // ajouterJoueur
    // =========================================================

    @Test
    @DisplayName("ajouterJoueur : cas nominal")
    void ajouterJoueur_casNominal()  throws PseudoDejaExistantException  {
        IservicesJoueur service = new AjouterJoueurMock();
        JoueurDTO alice = new JoueurDTO("Alice", "alice42", 1999, LangueEnum.FR, new String[]{"Foot"});

        service.ajouterJoueur(alice);

        JoueurDTO recupere = service.getJoueur("alice42");
        assertNotNull(recupere);
        assertEquals("Alice", recupere.getPrenom());
    }

    @Test
    @DisplayName("ajouterJoueur : pseudo déjà existant lève exception")
    void ajouterJoueur_pseudoExistant_leveException() throws PseudoDejaExistantException  {
        IservicesJoueur service = new AjouterJoueurPseudoExistantMock();
        JoueurDTO alice = new JoueurDTO("Alice", "alice42", 1999, LangueEnum.FR, new String[]{"Foot"});

        assertThrows(PseudoDejaExistantException.class,
                () -> service.ajouterJoueur(alice));
    }

    // =========================================================
    // supprimerJoueur
    // =========================================================

    @Test
    @DisplayName("supprimerJoueur : cas nominal")
    void supprimerJoueur_casNominal() throws JoueurNonTrouveException {
        IservicesJoueur service = new SupprimerJoueurMock();

        service.supprimerJoueur("alice42");

        assertNull(service.getJoueur("alice42"));
    }

    @Test
    @DisplayName("supprimerJoueur : joueur inexistant lève exception")
    void supprimerJoueur_joueurInexistant_leveException() throws JoueurNonTrouveException {
        IservicesJoueur service = new SupprimerJoueurInexistantMock();

        assertThrows(JoueurNonTrouveException.class,
                () -> service.supprimerJoueur("inconnu"));
    }

    // =========================================================
    // mettreAJourScore
    // =========================================================

    @Test
    @DisplayName("mettreAJourScore : cumule correctement")
    void mettreAJourScore_cumuleCorrectement() throws DonneeInvalideException  {
        IservicesJoueur service = new MettreAJourScoreMock();

        service.mettreAJourScore("alice42", 50);
        service.mettreAJourScore("alice42", 30);

        assertEquals(80, service.getJoueur("alice42").getScoreTotal());
    }

    @Test
    @DisplayName("mettreAJourScore : score négatif lève exception")
    void mettreAJourScore_scoreNegatif_leveException() throws DonneeInvalideException  {
        IservicesJoueur service = new MettreAJourScoreNegatifMock();

        assertThrows(DonneeInvalideException.class,
                () -> service.mettreAJourScore("alice42", -10));
    }

    // =========================================================
    // mettreAJourCentresInteret
    // =========================================================

    @Test
    @DisplayName("mettreAJourCentresInteret : remplace correctement")
    void mettreAJourCentresInteret_remplaceCorrectement() {
        IservicesJoueur service = new MettreAJourCentresInteretMock();
        String[] nouveauxCentres = {"Cinéma", "Lecture"};

        service.mettreAJourCentresInteret("alice42", nouveauxCentres);

        assertArrayEquals(nouveauxCentres,
                service.getJoueur("alice42").getCentresInteret());
    }

    // =========================================================
    // getJoueur
    // =========================================================

    @Test
    @DisplayName("getJoueur : retourne le bon joueur")
    void getJoueur_retourneBonJoueur() {
        IservicesJoueur service = new GetJoueurMock();

        JoueurDTO joueur = service.getJoueur("alice42");

        assertNotNull(joueur);
        assertEquals("alice42", joueur.getPseudo());
        assertEquals("Alice", joueur.getPrenom());
    }

    @Test
    @DisplayName("getJoueur : retourne null si inconnu")
    void getJoueur_retourneNull_siInconnu() {
        IservicesJoueur service = new GetJoueurMock() {
            @Override
            public JoueurDTO getJoueur(String pseudo) {
                return null;
            }
        };

        assertNull(service.getJoueur("inconnu"));
    }
}