package entities;

import java.util.List;
import java.util.Collections;

public class Professeur {
    private int id;
    private String nomComplet;
    private Grade grade;
    private String email;
    private int NCI;

    

    public Professeur() {
    }

    public Professeur(int id, String nomComplet) {
        this.id = id;
        this.nomComplet = nomComplet;
    }
    
    public int getNCI() {
        return NCI;
    }
    public void setNCI(int nCI) {
        
    this.NCI = nCI;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public Grade getGrade() {
        return grade;
    }
    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    public List<ProfesseurDeClasse> getProfesseurDeClasses() {
        // TODO Auto-generated method stub
        return Collections.emptyList();
    }
}
