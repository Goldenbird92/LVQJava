/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.dao;

import sistempakar.koneksi.Koneksi;
import sistempakar.model.ModelTarget;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author adesuryansyah
 */
public class DaoTarget implements ImplementTarget{

    Connection connection;
    final  String select = "select * from target";
    final String update = "UPDATE target set penyakit=? where id_target=?;";
    final String insert = "INSERT INTO target (penyakit) values (?)";
    final String delete = "DELETE FROM target where id_target=?;";
    
    public DaoTarget(){
        connection = Koneksi.connection();
    }
    @Override
    public List<ModelTarget> getAll() {
        List<ModelTarget> lt = null;
        try {
            lt = new ArrayList<ModelTarget>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                ModelTarget t = new ModelTarget();
                t.setId_target(rs.getInt("id_target"));
                t.setPenyakit(rs.getString("penyakit"));
                lt.add(t);
            }
        } catch (Exception e) {
            Logger.getLogger(DaoTarget.class.getName()).log(Level.SEVERE, null, e);
        }
        return lt;
    }
    
    @Override
    public void insert (ModelTarget t) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, t.getPenyakit());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                t.setId_target(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public void update(ModelTarget t) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, t.getPenyakit());
            statement.setInt(2, t.getId_target());
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
    public void delete(int id_target) {
       PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            
            statement.setInt(1, id_target);
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
    
}
