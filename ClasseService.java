package services;

import java.util.List;

import entities.Classe;
import repositories.ClasseRepositories;

public class ClasseService {
    ClasseRepositories classeRepositories=new ClasseRepositories();
     
      public void ajouterclasse(Classe classe){
        classeRepositories.insertClasse(classe);
      }

      public List<Classe>listerClasse(){
        return classeRepositories.selectAllClasse();
      }

      public Classe findClasseById(int id){
        return classeRepositories.selectClasseByid(id);
      }
      public Classe findClasseByNom(String nomClasse){
        return classeRepositories.selectClasseByNom();
      }
}
