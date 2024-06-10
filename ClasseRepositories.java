package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Classe;

public class ClasseRepositories extends Database{
    private List<Classe> tcClasses=new ArrayList<>();
    //select
    public  List<Classe> selectAll(){
       return tcClasses;
    }
    public  Classe selectByClasse(String filiere){
        for (Classe classe : tcClasses) {
             if (classe.getFiliere().compareTo(filiere)==0) {
                  return classe;
             } 
        }
         return null;
     }
    public  void insert(Classe classe){
        tcClasses.add(classe);
     }

    public void insertClasse(Classe classe) {
        throw new UnsupportedOperationException("Unimplemented method 'insertClasse'");
    }

    public List<Classe> selectAllClasse() {
        throw new UnsupportedOperationException("Unimplemented method 'selectAllClasse'");
    }

    public Classe selectClasseByid(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'selectClasseByid'");
    }

    public Classe selectClasseByNom() {
        throw new UnsupportedOperationException("Unimplemented method 'selectClasseByNom'");
    }

}
