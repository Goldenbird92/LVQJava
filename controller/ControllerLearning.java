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
import sistempakar.view.popUPTarget;
/**
 *
 * @author adesuryansyah
 */
public class ControllerLearning {
   ViewLearning frame;
   ImplementLearning implementLearning;
   List<ModelLearning> lg;
    
    public ControllerLearning (ViewLearning frame){
        this.frame = frame;
        implementLearning = new DaoLearning();
        lg = implementLearning.getAll();
        
    }
    
    public void isiTable(){
        lg = implementLearning.getAll();
        TableModelLearning tmb = new TableModelLearning(lg);
        frame.getTableLearning().setModel(tmb);
    }
}
