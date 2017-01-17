/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.controller;

import java.util.List;
import javax.swing.JOptionPane;
import sistempakar.dao.DaoDiagnosa;
import sistempakar.dao.ImplementDiagnosa;
import sistempakar.model.ModelDiagnosa;
import sistempakar.model.TableModelDiagnosa;
import sistempakar.view.ViewDiagnosa;
import sistempakar.view.popUpDiagnosa;

/**
 *
 * @author adesuryansyah
 */
public class ControllerDiagnosa {
    
    popUpDiagnosa formDiagnosa;
    ViewDiagnosa frame;
    ImplementDiagnosa implementDiagnosa;
    List<ModelDiagnosa> ld;
    
    public ControllerDiagnosa(ViewDiagnosa frame){
        this.frame = frame;
        implementDiagnosa = new DaoDiagnosa(); 
        
    }
    
    public ControllerDiagnosa(popUpDiagnosa formDiagnosa){
        this.formDiagnosa = formDiagnosa;
        implementDiagnosa = new DaoDiagnosa(); 
        ld = implementDiagnosa.getAll();
    }
    
    
    public void insert(){
        ModelDiagnosa d = new ModelDiagnosa();
        d.setUsia(frame.getUsia().getText());
        d.setPertumbuhan(frame.getbgPertumbuhan().getSelection().getActionCommand());
        d.setGerakan(frame.getbgGerakan().getSelection().getActionCommand());
        d.setNafsu_makan(frame.getbgNafsuMakan().getSelection().getActionCommand());
        d.setGesekan_badan_jaring(frame.getbgGesekanBadanJaring().getSelection().getActionCommand());
        d.setFlashing(frame.getbgFlashing().getSelection().getActionCommand());
        d.setPendarahan_mata(frame.getbgPendrahanMata().getSelection().getActionCommand());
        d.setPendarahan_mulut(frame.getbgPendarahanMulut().getSelection().getActionCommand());
        d.setPendarahan_hidung(frame.getbgPendarahanHidung().getSelection().getActionCommand());
        d.setPendarahan_tutup_insang(frame.getbgTutupInsang().getSelection().getActionCommand());
        d.setBorok(frame.getBgBorok().getSelection().getActionCommand());
        d.setInsang(frame.getBgInsang().getSelection().getActionCommand());
        d.setSirip(frame.getBgInsang().getSelection().getActionCommand());
        d.setSisik(frame.getBgSisik().getSelection().getActionCommand());
        d.setLender(frame.getBgLendir().getSelection().getActionCommand());
        d.setPathogen(frame.getBgPatogen().getSelection().getActionCommand());
        d.setLintah(frame.getBgLintah().getSelection().getActionCommand());
        d.setMata(frame.getCbMata());
        d.setMati(frame.getCbMati());
        d.setTubuh(frame.getCbTubuh());
        d.setEkor(frame.getCbEkor());
        
        implementDiagnosa.insert(d);
        JOptionPane.showMessageDialog(frame, "Data berhasil disimpan");

    }
    
    public void isiTable(){
        ld = implementDiagnosa.getAll();
        TableModelDiagnosa tmb = new TableModelDiagnosa(ld);
        formDiagnosa.getTableDiagnosa().setModel(tmb);
    }
    
    
    
    
}
