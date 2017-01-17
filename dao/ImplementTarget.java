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
public interface ImplementTarget {
    
    public void insert(ModelTarget t);
    
    public void update(ModelTarget t);
    
    public void delete(int id_target);
    
    public List<ModelTarget> getAll();
}

