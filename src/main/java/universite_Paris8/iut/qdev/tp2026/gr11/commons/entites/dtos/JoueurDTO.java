package universite_Paris8.iut.qdev.tp2026.gr11.commons.entites.dtos;

import universite_Paris8.iut.qdev.tp2026.gr11.enums.LangueEnum;

public class JoueurDTO {

    private String prenom;
    private String pseudo;
    private int anneeNaissance;
    private LangueEnum languePreferee;
    private int scoreTotal;
    private String[] centresInteret;

    public JoueurDTO(String prenom, String pseudo, int anneeNaissance, LangueEnum languePreferee, String[] centresInteret) {
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.anneeNaissance = anneeNaissance;
        this.languePreferee = languePreferee;
        this.scoreTotal = 0;
        this.centresInteret = centresInteret;
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

    public String[] getCentresInteret() {
        return centresInteret;
    }

    public void setScoreTotal(int scoreTotal) {
        this.scoreTotal = scoreTotal;
    }

    public void setCentresInteret(String[] centresInteret) {
        this.centresInteret = centresInteret;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "prenom='" + prenom + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", anneeNaissance=" + anneeNaissance +
                ", langue=" + languePreferee +
                ", scoreTotal=" + scoreTotal +
                '}';
    }
}
