/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.model;

import java.util.List;
import javafx.scene.paint.Color;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author adesuryansyah
 */
public class TableModelUser extends AbstractTableModel{
    List<ModelUser> lu;
    
    public TableModelUser(List<ModelUser> lu){
        this.lu = lu;
    }
      
    public int getRowCount() {
        return lu.size();
    }

    public int getColumnCount() {
        return 4;
    }
    
   

    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "ID User";
            case 1:
                return "Username";
            case 2:
                return "Password";
            case 3:
                return "Nama";
            default:
                return null;
        }
    }
 
    public Object getValueAt(int row, int column) {
        switch (column){
            case 0:
                return lu.get(row).getIDUser();
            case 1:
                return lu.get(row).getUsername();
            case 2:
                return lu.get(row).getPassword();
            case 3:
                return lu.get(row).getNama();
            default:
                return null;
        }
    }
}
