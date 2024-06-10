package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Professeur;

public class ProfesseurRepositories extends Database{
    private final String SQL_INSERT="INSERT INTO professeur (nci,nomcomplet,grade) VALUES (?,?,?);";
    private final String SQL_LAST_VALUE_INSERT="SELECT Max (id_professeur) as max FROM professeur";

    public void insert(Professeur professeur){
        try{
            ouvrirConnexion();
            initPrepareStatement(SQL_INSERT);
            statement.setInt(1,professeur.getNCI());
            statement.setString(2,professeur.getNomComplet());
            executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }


public Professeur selectlastProfesseur(){
    Professeur professeur =null;
    try{
        ouvrirConnexion();
        initPrepareStatement(SQL_INSERT);
        //statement.setInt(1,professeur.getId());
        //statement.setString(2, professeur.getNomComplet());
        //statement.setString(3, professeur.getProfesseurDeClasses());
        ResultSet rs = executeSelect();
        return new Professeur(rs.getInt("id"), rs.getString("nomComplet"));
    }catch(SQLException e){
        e.printStackTrace();
        return null;
    }
}
 }