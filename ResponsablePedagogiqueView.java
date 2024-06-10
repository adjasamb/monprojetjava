import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Classe;
import entities.Professeur;
import services.ClasseService;
import services.ProfesseurService;

public class ResponsablePedagogiqueView {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1-Ajouter une classe");
            System.out.println("2-Lister les classes");
            System.out.println("3-Ajouter des professeurs");
            System.out.println("4-Lister les professeurs");
            System.out.println("5-Quitter");
            choix=sc.nextInt();
            sc.nextLine();
            List<Classe> classes = new ArrayList<>();
            Object classe;
            ClasseService classeService = new ClasseService(); 
            switch (choix) {
                case 1:
                System.out.println("Entrez le niveau de la classe(L1, L2, L3)");
                String niveau=sc.nextLine();
                System.out.println("Entrez la filière de la classe");
                String filiere=sc.nextLine();
                Classe cl= new Classe();
               
                cl.setNiveau(niveau);
                cl.setFiliere(filiere);
               // classeService.ajouterClasse(cl);
                System.out.println("Classe ajoutée avec succés");


                    break;
                case 2:
                List<Classe> listerClasse = classeService.listerClasse();
                for (Classe c : listerClasse) {
                  System.out.println("ID :"+c.getId());
                  System.out.println("Libelle :"+c.getNiveau());
                  System.out.println("PU: "+c.getFiliere());
                }
                break;
                case 3:
                  Professeur professeur=new Professeur();
                    System.out.println("Entrer le NCI");
                    professeur.setNCI(sc.nextInt());
                    sc.nextLine();
                      System.out.println("Entrer le nom complet");
                      professeur.setNomComplet(sc.nextLine());
                      classes=classeService.listerClasse();;
                      int response;
                      do {
                          for (Classe clItem : classes) {
                              System.out.println(clItem.getNiveau()+"-"+clItem.getFiliere());
                            }
                           System.out.println("Veuillez selectionner la classe à laquelle vous voulez affecter les etudiants");
                            String nomClasse=sc.nextLine(); 
                            classe= classeService.findClasseByNom(nomClasse);
                            if (classe!=null) {
  
                            }else{
                               System.out.println("Cette classse n'existe pas");
                               System.out.println("Voulez-vous créer une classe ? (1 : Oui, 0 : Non)");
                                while (true) {
                                    int rsp = sc.nextInt();
                                if (rsp == 1) {
                                    System.out.println("Entrer la classe");
                                    nomClasse=sc.nextLine();
                                    Classe classe2 = new Classe();
                                    classe2.setLibelle(nomClasse);
                                    classeService.ajouterclasse(classe2);
                                
                                    break;
                                } else if (rsp == 0) { 
                                    break;
                                } else {
                                    System.out.println("Commande inattendue, Veuillez entrer 1 si Oui et 0 si Non");
                                }
                            } 
                            System.out.println("Classe : "+classes);
                           response = 1;
                           }
                     }while(choix!=2);
                     
                     break;
                case 4:
                     System.out.println("Les professeurs sont les suivantes");
                     List<Professeur> professeurs= ProfesseurService.listerProfesseurs();
                     for (Professeur pc:professeurs){
                        System.out.println(pc.getGrade() +":"+ pc.getNomComplet());
                     }
                break;
             }
         }while(choix !=5);
    }
  }
 