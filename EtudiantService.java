package services;

import repositories.EtudiantRepositories;

import java.util.List;

import entities.Etudiant;

public class EtudiantService {
    EtudiantRepositories EtudiantRepositories=new EtudiantRepositories();

    public void ajouterEtudiant(Etudiant etudiant){
        EtudiantRepositories.insert(etudiant);
    }

    public  Etudiant rechercherEtudianttParMatricule(String matricule){
        return EtudiantRepositories.selectEtudiantByMatricule(matricule);
    }

    public List<Etudiant> listerEtudiant() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listerEtudiant'");
    }
}
