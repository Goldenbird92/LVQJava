/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.dao;

import java.util.List;
import sistempakar.model.ModelUser;
import sistempakar.model.TableModelUser;

/**
 *
 * @author adesuryansyah
 */
public interface ImplementUser {
    public void insert(ModelUser u);
    
    public void update(ModelUser u);
    
    public void delete(int id_user);
    
    public List<ModelUser> getAll();
    
    public List<ModelUser> getCariUsername(String username);
}
    
