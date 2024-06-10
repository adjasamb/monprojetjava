package entities;

public class ProfesseurDeClasse {
    private int id;
    Professeur professeur;
    private int Classe;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Professeur getProfesseur() {
        return professeur;
    }
    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    public int getClasse() {
        return Classe;
    }
    public void setClasse(int classe) {
        Classe = classe;
    }
}
