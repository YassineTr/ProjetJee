package com.shadowyas.dao;

import com.shadowyas.dbutil.DbUtil;
import com.shadowyas.model.Utilisateur;

import javax.rmi.CORBA.Util;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtilisateurDao {
    private Connection connection;

    public UtilisateurDao() {
        connection = DbUtil.getConnection();
    }

    public List<Utilisateur> getAllUsers() {

        List<Utilisateur> users = new ArrayList<Utilisateur>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from utilisateur");
            while (rs.next()) {
                Utilisateur user = new Utilisateur();
                user.setlogin(rs.getString("Nom_U"));
                user.setnompre(rs.getString("Nom_Pre"));
                user.setpassword1(rs.getString("Mot_d_pass"));
                user.setpassword2(rs.getString("Confirm_pass"));
                user.setmail(rs.getString("Email"));
                user.setadresse(rs.getString("Adresse"));
                user.setcp(rs.getString("Code_postal"));
                user.setlieu(rs.getString("Lieu"));
                user.setmobile(rs.getString("Mobile"));
                user.setcin(rs.getString("CIN"));


                users.add(user);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public boolean isExist(String login , String password){
        boolean exist = false ;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from utilisateur where Nom_U=? and Mot_d_pass=?");
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                if(login.equals(rs.getString(2)) && password.equals(rs.getString(4))){
                    exist = true ;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return exist;
    }

    public Utilisateur getUser(String login , String password){
        Utilisateur user = new Utilisateur();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from utilisateur where Nom_U=? and Mot_d_pass=?");
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                if(login.equals(rs.getString(2)) && password.equals(rs.getString(4))){
                    user.setlogin(rs.getString("Nom_U"));
                    user.setnompre(rs.getString("Nom_Pre"));
                    user.setpassword1(rs.getString("Mot_d_pass"));
                    user.setpassword2(rs.getString("Confirm_pass"));
                    user.setmail(rs.getString("Email"));
                    user.setadresse(rs.getString("Adresse"));
                    user.setcp(rs.getString("Code_postal"));
                    user.setlieu(rs.getString("Lieu"));
                    user.setmobile(rs.getString("Mobile"));
                    user.setcin(rs.getString("CIN"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
