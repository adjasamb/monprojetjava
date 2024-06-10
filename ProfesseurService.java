package services;

import java.util.List;

import entities.Professeur;
import entities.ProfesseurDeClasse;
import repositories.ProfesseurDeClasseRepositories;
import repositories.ProfesseurRepositories;

public class ProfesseurService {
    ProfesseurRepositories professseurrepositories=new ProfesseurRepositories();
    ProfesseurDeClasseRepositories professeurdeclasserepositories=new ProfesseurDeClasseRepositories();

    public void ajouterUnprofesseur(Professeur professeur){
        professseurrepositories.insert(professeur);
        Professeur lastprofesseur=professseurrepositories.selectlastProfesseur();
        List<ProfesseurDeClasse> professeurdeclasses=professeur.getProfesseurDeClasses();
        for (ProfesseurDeClasse pc : professeurdeclasses){
            pc.setProfesseur(lastprofesseur);
            professeurdeclasserepositories.insert(pc);
        }
    }

    public static List<Professeur> listerProfesseurs() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listerProfesseurs'");
    }
}
