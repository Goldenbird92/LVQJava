/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistempakar.koneksi.Koneksi;
import sistempakar.model.ModelUser;

/**
 *
 * @author adesuryansyah
 */
public class DaoUser implements ImplementUser{
    Connection connection;
    final String insert = "INSERT INTO user (username, password,nm_user) values (?,?,?)";
    final String update = "UPDATE user set username=?, password=? where id_user=?;";
    final String delete = "DELETE FROM user where id_user=?;";
    final String select = "SELECT * FROM user";
    final String carinama = "SELECT * FROM user WHERE username like?";

 
     public DaoUser() {
        connection = Koneksi.connection();
    }


    @Override
    public void insert(ModelUser u) {
       PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, u.getUsername());
            statement.setString(2, u.getPassword());
            statement.setString(3, u.getNama());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()){
                u.setIDUser(rs.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

  
    @Override
    public void update(ModelUser u) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, u.getUsername());
            statement.setString(2, u.getPassword());
            statement.setInt(3, u.getIDUser());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

   
    @Override
    public void delete(int id_user) {
       PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            
            statement.setInt(1, id_user);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }


    @Override
    public List<ModelUser> getAll() {
        List<ModelUser> lu = null;
        try {
            lu = new ArrayList<ModelUser>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                ModelUser u = new ModelUser();
                u.setIDUser(rs.getInt("id_user"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setNama(rs.getString("nm_user"));
                lu.add(u);
            }
        } catch (SQLException e) {
            Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE, null, e);
        }
        return lu;
    }

    @Override
    public List<ModelUser> getCariUsername(String username) {
        List<ModelUser> lu = null;
        try {
            lu = new ArrayList<ModelUser>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + username + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                ModelUser u = new ModelUser();
                u.setIDUser(rs.getInt("id_user"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setNama(rs.getString("nm_user"));
                lu.add(u);
            }
        } catch (SQLException e) {
            Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE, null, e);
        }
        return lu;
    }

 
}
