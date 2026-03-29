package universite_Paris8.iut.qdev.tp2026.gr11.commons.entites.dtos;

public class ClassementDTO {

    private String pseudoJoueur;
    private int scoreMax;
    private double temps;

    public ClassementDTO(String pseudoJoueur, int scoreMax, double temps) {
        this.pseudoJoueur = pseudoJoueur;
        this.scoreMax = scoreMax;
        this.temps = temps;
    }

    public int getScoreMax() {
        return scoreMax;
    }
}
