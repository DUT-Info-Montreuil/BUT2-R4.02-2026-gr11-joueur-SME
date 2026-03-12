package universite_Paris8.iut.qdev.tp2026.gr11.enums;

public enum LangueEnum {
    FR(1, "Français"),
    EN(2, "Anglais"),
    ES(3, "Espagnol"),
    DE(4, "Allemand");

    private final int id;
    private final String nomComplet;

    LangueEnum(int id, String nomComplet) {
        this.id = id;
        this.nomComplet = nomComplet;
    }

    public int getId() {
        return id;
    }

    public String getNomComplet() {
        return nomComplet;
    }
}