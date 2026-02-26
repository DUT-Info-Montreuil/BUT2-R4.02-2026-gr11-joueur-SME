package universite_Paris8.iut.qdev.tp2026.gr11.commonsDtos;

import universite_Paris8.iut.qdev.tp2026.gr11.enums.LangueEnum;

public class JoueurDTO {

    private String prenom;
    private String pseudo;
    private int anneeNaissance;
    private LangueEnum languePreferee;
    private int scoreTotal;

    public JoueurDTO(String prenom, String pseudo, int anneeNaissance, LangueEnum languePreferee) {
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.anneeNaissance = anneeNaissance;
        this.languePreferee = languePreferee;
        this.scoreTotal = 0;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public LangueEnum getLanguePreferee() {
        return languePreferee;
    }

    public int getScoreTotal() {
        return scoreTotal;
    }
}
