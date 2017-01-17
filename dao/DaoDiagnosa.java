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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistempakar.model.ModelDiagnosa;
import sistempakar.model.ModelTarget;
import sistempakar.view.ViewDiagnosa;

/**
 *
 * @author adesuryansyah
 */
public class DaoDiagnosa implements ImplementDiagnosa{
    
    Connection connection;
    final String insert = "INSERT INTO pemeriksaan (usia, pertumbuhan, gerakan, nafsu_makan, gesekan_badan_jaring, flashing, pendarahan_mata, pendarahan_mulut, pendarahan_hidung, pendarahan_tutup_insang, borok, insang, sirip, sisik, lender, pathogen, lintah, mata, mati, tubuh, ekor) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    final String select = "SELECT * FROM pemeriksaan";
    
    public DaoDiagnosa(){
        connection = Koneksi.connection();
    }
    

    @Override
    public void insert(ModelDiagnosa d) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
//            ngambil method dari model
            statement.setString(1, d.getUsia());
            statement.setString(2, d.getPertumbuhan());
            statement.setString(3, d.getGerakan());
            statement.setString(4, d.getNafsu_makan());
            statement.setString(5, d.getGesekan_badan_jaring());
            statement.setString(6, d.getFlashing());
            statement.setString(7, d.getPendarahan_mata());
            statement.setString(8, d.getPendarahan_mulut());
            statement.setString(9, d.getPendarahan_hidung());
            statement.setString(10, d.getPendarahan_tutup_insang());
            statement.setString(11, d.getBorok());
            statement.setString(12, d.getInsang());
            statement.setString(13, d.getSirip());
            statement.setString(14, d.getSisik());
            statement.setString(15, d.getLender());
            statement.setString(16, d.getPathogen());
            statement.setString(17, d.getLintah());
            statement.setString(18, d.getMata());
            statement.setString(19, d.getMati());
            statement.setString(20, d.getTubuh());
            statement.setString(21, d.getEkor());
            
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                d.setId_pemeriksaan(rs.getInt(1));
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
    public List<ModelDiagnosa> getAll(){
    
         List<ModelDiagnosa> lt = null;
        try {
            lt = new ArrayList<>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
        
            while (rs.next()) {
                float total = 0;
                float temp = 0;
                float tambah = 1;
                
                ModelDiagnosa t = new ModelDiagnosa();
                
                Integer IDpemeriksaan = (rs.getInt("id_pemeriksaan"));
                t.setId_pemeriksaan(IDpemeriksaan);
                
                String pertumbuhan = (rs.getString("Pertumbuhan"));
                t.setPertumbuhan(pertumbuhan);
                
                String gerakan = rs.getString("gerakan");
                t.setGerakan(gerakan);
                
                String nafsu_makan = (rs.getString("nafsu_makan"));
                t.setNafsu_makan(nafsu_makan);
                
                String gesekanBadan = (rs.getString("gesekan_badan_jaring"));
                t.setGesekan_badan_jaring(gesekanBadan);
                
                String flashing = (rs.getString("flashing"));
                t.setFlashing(flashing);
                
                String pendarahan_mata = (rs.getString("pendarahan_mata"));
                t.setPendarahan_mata(pendarahan_mata);
                
                String pendarahan_mulut = (rs.getString("pendarahan_mulut"));
                t.setPendarahan_mulut(pendarahan_mulut);
                
                String pendarahan_hidung = (rs.getString("pendarahan_hidung"));
                t.setPendarahan_hidung(rs.getString("pendarahan_hidung"));
                
                String pendarahan_tutup_insang = (rs.getString("pendarahan_tutup_insang"));
                t.setPendarahan_tutup_insang(rs.getString("pendarahan_tutup_insang"));
                
                String borok = (rs.getString("borok"));
                t.setBorok(rs.getString("borok"));
                
                String mata = (rs.getString("mata"));
                t.setMata(mata);
                
                String insang = (rs.getString("insang"));
                t.setInsang(insang);
                
                String sisik = (rs.getString("sisik"));
                t.setSisik(sisik);
                
                String sirip = (rs.getString("sirip"));
                t.setSirip(sirip);
                
                String pathogen = (rs.getString("pathogen"));
                t.setPathogen(pathogen);
                
                String lender = (rs.getString("lender"));
                t.setLender(lender);
                
                String tubuh = (rs.getString("tubuh"));
                t.setTubuh(tubuh);
                
                String lintah = (rs.getString("lintah"));
                t.setLintah(lintah);
                
                String ekor = (rs.getString("ekor"));
                t.setEkor(ekor);
                
                String mati = (rs.getString("mati"));
                t.setMati(mati);
                
                lt.add(t);
            }
        } catch (Exception e) {
            Logger.getLogger(DaoTarget.class.getName()).log(Level.SEVERE, null, e);
        }
        return lt;
}
}
