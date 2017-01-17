/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.dao;

import java.util.List;
import sistempakar.model.*;


/**
 *
 * @author adesuryansyah
 */
public interface ImplementDiagnosa {
    public void insert(ModelDiagnosa d);
    
    /**
     *
     * @return
     */
    public List<ModelDiagnosa> getAll();
    
    
}
