/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.dao;

import sistempakar.koneksi.Koneksi;
import sistempakar.model.ModelLearning;
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
public class DaoLearning implements ImplementLearning{
    Connection connection;
    final String select = "SELECT * FROM learning";
    
    public DaoLearning(){
        connection = Koneksi.connection();
    }
  
    /**
     *
     * @return
     */
    @Override
    public List<ModelLearning> getAll(){
        List<ModelLearning> lg = null;
        try{
            lg = new ArrayList<ModelLearning>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                ModelLearning l = new ModelLearning();
                l.setId_ln(rs.getInt("id_ln"));
                l.setPertumbuhan(rs.getString("pertumbuhan"));
                l.setGerakan(rs.getString("gerakan"));
                l.setNafsu_makan(rs.getString("nafsu_makan"));
                l.setGesekan_badan_jaring(rs.getString("gesekan_badan_jaring"));
                l.setFlashing(rs.getString("flashing"));
                l.setPendarahan_mata(rs.getString("pendarahan_mata"));
                l.setPendarahan_mulut(rs.getString("pendarahan_mulut"));
                l.setPendarahan_hidung(rs.getString("pendarahan_hidung"));
                l.setPendarahan_tutup_insang(rs.getString("pendarahan_tutup_insang"));
                l.setBorok(rs.getString("borok"));
                l.setMata(rs.getString("mata"));
                l.setInsang(rs.getString("insang"));
                l.setSisik(rs.getString("sisik"));
                l.setSirip(rs.getString("sirip"));
                l.setPathogen(rs.getString("pathogen"));
                l.setLender(rs.getString("lender"));
                l.setTubuh(rs.getString("tubuh"));
                l.setLintah(rs.getString("lintah"));
                l.setEkor(rs.getString("ekor"));
                l.setMati(rs.getString("mati"));
                
                lg.add(l);
            }
        }catch (SQLException ex){
            Logger.getLogger(DaoLearning.class.getName()).log(Level.SEVERE,null,ex);
        }
        return lg;
    }
}
