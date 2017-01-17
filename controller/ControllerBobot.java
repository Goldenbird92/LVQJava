/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.controller;

import sistempakar.dao.DaoLearning;
import sistempakar.dao.ImplementLearning;
import sistempakar.model.ModelLearning;
import sistempakar.model.TableModelLearning;
import sistempakar.view.ViewLearning;
import java.util.List;
import javax.swing.JOptionPane;
import sistempakar.dao.DaoBobot;
import sistempakar.dao.DaoDiagnosa;
import sistempakar.dao.ImplementBobot;
import sistempakar.model.ModelBobot;
import sistempakar.model.TableModelBobot;
import sistempakar.view.popUPTarget;
import sistempakar.view.popUpDiagnosa;
/**
 *
 * @author adesuryansyah
 */
public class ControllerBobot {
    popUpDiagnosa formDiagnosa;
    ImplementBobot implementBobot;
    List<ModelBobot> ld;
    
    public ControllerBobot(popUpDiagnosa formDiagnosa){
        this.formDiagnosa = formDiagnosa;
        implementBobot = new DaoBobot(); 
        ld = implementBobot.getAll();
    }
    
    public void isiTable(){
        ld = implementBobot.getAll();
        TableModelBobot tmb = new TableModelBobot(ld);
        formDiagnosa.getTableBobot().setModel(tmb);
        
    }
}
