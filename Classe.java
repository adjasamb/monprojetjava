package entities;

import java.util.List;

public class Classe {
    private int id;
    private String libelle;
    private String filiere;
    private String niveau;
    List<Inscription> inscriptions;
    List<ProfesseurDeClasse> ProfesseurDeClasse;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String getFiliere() {
        return filiere;
    }
    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
    public String getNiveau() {
        return niveau;
    }
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}