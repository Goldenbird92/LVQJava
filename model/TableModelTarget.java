/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author adesuryansyah
 */
public class TableModelTarget extends AbstractTableModel{
    List<ModelTarget> lt;

    public TableModelTarget(List<ModelTarget> lt){
        this.lt = lt;
    }
    
    @Override
    public int getRowCount() {
        return lt.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0: 
                return "Satuan Nilai";
            case 1:
                return "Keterangan";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column){
            case 0: 
                return lt.get(row).getId_target();
            case 1:
                return lt.get(row).getPenyakit();
            default:
                return null;
    }
    }
    
}
