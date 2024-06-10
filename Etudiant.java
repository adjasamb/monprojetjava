package entities;

public class Etudiant {
    private int id;
    private String matricule;
    private String nomComplet;
    private String Tuteur;
    public String getTuteur() {
        return Tuteur;
    }
    public void setTuteur(String tuteur) {
        Tuteur = tuteur;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
}
