/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import sistempakar.dao.DaoUser;
import sistempakar.dao.ImplementUser;
import sistempakar.model.TableModelUser;
import sistempakar.model.ModelUser;
import sistempakar.view.ViewPengguna;

/**
 *
 * @author adesuryansyah
 */
public class ControllerUser {
    ViewPengguna frameuser;
    ImplementUser implementUser;
    List<ModelUser> lu;
    private TableModel tmb;
    
    public ControllerUser(ViewPengguna frameuser) {
        this.frameuser = frameuser;
        implementUser = new DaoUser();
        lu = implementUser.getAll();
    }
    
   
    public  void reset(){
        frameuser.getTextIDUser().setText("");
        frameuser.getTextUsername().setText("");
        frameuser.getTextPassword().setText("");
        frameuser.getTextNama().setText("");
    }
  
    public void isitable(){
        lu = implementUser.getAll();
        TableModelUser tmb = new TableModelUser(lu);
        frameuser.getTableDataUser().setModel(tmb);
    }
    
    public void isiField(int row){
        frameuser.getTextIDUser().setText(lu.get(row).getIDUser().toString());
        frameuser.getTextUsername().setText(lu.get(row).getUsername());
        frameuser.getTextPassword().setText(lu.get(row).getPassword());
        frameuser.getTextNama().setText(lu.get(row).getNama());
    }
    
    public void insert(){
        ModelUser u = new ModelUser();
        u.setUsername(frameuser.getTextUsername().getText());
        u.setPassword(frameuser.getTextPassword().getText());
        u.setNama(frameuser.getTextNama().getText());
        implementUser.insert(u);
        JOptionPane.showMessageDialog(frameuser, "Data berhasil disimpan");
    }
    
    public void update(){
        ModelUser u = new ModelUser();
        u.setUsername(frameuser.getTextUsername().getText());
        u.setPassword(frameuser.getTextPassword().getText());
        u.setIDUser(Integer.parseInt(frameuser.getTextIDUser().getText()));
        implementUser.update(u);
    }
    
    public void delete(){
        if(!frameuser.getTextIDUser().getText().trim().isEmpty()){
            int id_user = Integer.parseInt(frameuser.getTextIDUser().getText());
            implementUser.delete(id_user);
            JOptionPane.showMessageDialog(frameuser, "Data berhasil dihapus");
        }else{
            JOptionPane.showMessageDialog(frameuser, "Pilih data yang akan dihapus");
        }
    }
    
    public void isitabelcarinama(){
        lu = implementUser.getCariUsername(frameuser.getTextCariNama().getText());
        TableModelUser tmb = new TableModelUser(lu);
        frameuser.getTableDataUser().setModel(tmb);
    }
    
    public void cariUsername(){
        if(!frameuser.getTextCariNama().getText().trim().isEmpty()){
            implementUser.getCariUsername(frameuser.getTextCariNama().getText());
            isitabelcarinama();
        }else{
            JOptionPane.showMessageDialog(frameuser, "Data masukan masih kosong");
        }
    }
}
