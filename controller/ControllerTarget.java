/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.controller;

import sistempakar.dao.DaoTarget;
import sistempakar.dao.ImplementTarget;
import sistempakar.model.ModelTarget;
import sistempakar.model.TableModelTarget;
import sistempakar.view.ViewTarget;
import java.util.List;
import javax.swing.JOptionPane;
import sistempakar.view.popUPTarget;
/**
 *
 * @author adesuryansyah
 */
public class ControllerTarget {
    popUPTarget frUPTarget;
    ViewTarget frame;
    ImplementTarget implementTarget;
    List<ModelTarget> lt;
    
    public ControllerTarget(ViewTarget frame){
        this.frame = frame;
        implementTarget = new DaoTarget();
        lt = implementTarget.getAll();
    }
    
    public ControllerTarget(popUPTarget frUPTarget){
        this.frUPTarget = frUPTarget;
        implementTarget = new DaoTarget();
        lt = implementTarget.getAll();
    }
    
    public void isiTable(){
        lt = implementTarget.getAll();
        TableModelTarget tmb = new TableModelTarget(lt);
        frame.getTabletarget().setModel(tmb);
    }
    
    public void isifield(int row){
        frame.getTxtIDTarget().setText(lt.get(row).getId_target().toString());
        frame.getTxtKeterangan().setText(lt.get(row).getPenyakit().toString());
    }
    
    public  void reset(){
       
        frame.getTxtKeterangan().setText("");
        frame.getTxtIDTarget().setText("");
    }
    
    public void insert(){
        ModelTarget t= new ModelTarget();
        t.setPenyakit(frUPTarget.getTxtNamaPenyakit().getText());
        implementTarget.insert(t);
        JOptionPane.showMessageDialog(frUPTarget, "Data berhasil disimpan");
        
    }
    
    public void update(){
        ModelTarget t = new ModelTarget();
        t.setPenyakit(frame.getTxtKeterangan().getText());
        t.setId_target(Integer.parseInt(frame.getTxtIDTarget().getText()));
        implementTarget.update(t);
    }
    
    public void delete(){
        if (!frame.getTxtIDTarget().getText().trim().isEmpty()) {
            int id_target = Integer.parseInt(frame.getTxtIDTarget().getText());
            implementTarget.delete(id_target);
        }else{
            JOptionPane.showMessageDialog(frame, "Pilih Data Yang Akan Dihapus");
        }
    }
}
