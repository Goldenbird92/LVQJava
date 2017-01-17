/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.dao;

import sistempakar.koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistempakar.model.ModelBobot;
/**
 *
 * @author adesuryansyah
 */
public class DaoBobot implements ImplementBobot{
    Connection connection;
    final String select = "SELECT id_bobot, pertumbuhan, gerakan, nafsu_makan, gesekan_badan_jaring, flashing, pendarahan_mata, pendarahan_mulut, pendarahan_hidung, pendarahan_tutup_insang, borok, mata, insang, sisik, sirip, pathogen, lender, tubuh, lintah, ekor, mati FROM bobot";
    
    public DaoBobot(){
        connection = Koneksi.connection();
    }
  
    /**
     *
     * @return
     */
    @Override
    public List<ModelBobot> getAll(){
        List<ModelBobot> lg = null;
        try{
            lg = new ArrayList<>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                ModelBobot l = new ModelBobot();
                
                Integer IDBobot = (rs.getInt("id_bobot"));
                l.setIDBobot(IDBobot);
                
                String pertumbuhan = rs.getString("Pertumbuhan");
                l.setPertumbuhan(pertumbuhan);
                
                String gerakan = rs.getString("gerakan");
                l.setGerakan(gerakan);
                
                String nafsu_makan = (rs.getString("nafsu_makan"));
                l.setNafsu_makan(nafsu_makan);
                
                String gesekanBadan = (rs.getString("gesekan_badan_jaring"));
                l.setGesekan_badan_jaring(gesekanBadan);
                
                String flashing = (rs.getString("flashing"));
                l.setFlashing(flashing);
                
                String pendarahan_mata = (rs.getString("pendarahan_mata"));
                l.setPendarahan_mata(pendarahan_mata);
                
                String pendarahan_mulut = (rs.getString("pendarahan_mulut"));
                l.setPendarahan_mulut(pendarahan_mulut);
                
                String pendarahan_hidung = (rs.getString("pendarahan_hidung"));
                l.setPendarahan_hidung(rs.getString("pendarahan_hidung"));
                
                String pendarahan_tutup_insang = (rs.getString("pendarahan_tutup_insang"));
                l.setPendarahan_tutup_insang(rs.getString("pendarahan_tutup_insang"));
                
                String borok = (rs.getString("borok"));
                l.setBorok(rs.getString("borok"));
                
                String mata = (rs.getString("mata"));
                l.setMata(mata);
                
                String insang = (rs.getString("insang"));
                l.setInsang(insang);
                
                String sisik = (rs.getString("sisik"));
                l.setSisik(sisik);
                
                String sirip = (rs.getString("sirip"));
                l.setSirip(sirip);
                
                String pathogen = (rs.getString("pathogen"));
                l.setPathogen(pathogen);
                
                String lender = (rs.getString("lender"));
                l.setLender(lender);
                
                String tubuh = (rs.getString("tubuh"));
                l.setTubuh(tubuh);
                
                String lintah = (rs.getString("lintah"));
                l.setLintah(lintah);
                
                String ekor = (rs.getString("ekor"));
                l.setEkor(ekor);
                
                String mati = (rs.getString("mati"));
                l.setMati(mati);
                
                lg.add(l);
            }
        }catch (SQLException ex){
            Logger.getLogger(DaoLearning.class.getName()).log(Level.SEVERE,null,ex);
        }
        return lg;
    }
}
