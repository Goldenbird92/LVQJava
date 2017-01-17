/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sistempakar.view.ViewDiagnosa;

/**
 *
 * @author adesuryansyah
 */
public class TableModelDiagnosa extends AbstractTableModel{

    List<ModelDiagnosa> ld;
    
   public TableModelDiagnosa(List<ModelDiagnosa> ld){
        this.ld = ld;
    }
    
    @Override
    public int getRowCount() {
        return ld.size();
    }

    @Override
    public int getColumnCount() {
        return 19;
    }
    
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "ID";
            case 1:
                return "Pertumbuhan";
            case 2:
                return "Gerakan";
            case 3:
                return "Nafsu Makan";
            case 4:
                return "Gesekan Badan";
            case 5:
                return "Flashing";
            case 6:
                return "Pendarahan Mata";
            case 7:
                return "Pendarahan Mulut";
            case 8:
                return "Pendarahan Hidung";
            case 9:
                return "Pendarahan Tutup Insang";
            case 10:
                return "Borok";
            case 11:
                return "Mata";
            case 12:
                return "Insang";
            case 13:
                return "Sisik";
            case 14:
                return "Pathogen";
            case 15:
                return "Lender";
            case 16:
                return "Tubuh";
            case 17:
                return "Lintah";
            case 18:
                return "Ekor";
            case 19:
                return "Mati";
//            case 20:
//                return "id_target";
            default :
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column){
            case 0:
                return ld.get(row).getId_pemeriksaan();
            case 1:
                return ld.get(row).getPertumbuhan();
            case 2:
                return ld.get(row).getGerakan();
            case 3:
                return ld.get(row).getNafsu_makan();
            case 4:
                return ld.get(row).getGesekan_badan_jaring();
            case 5:
                return ld.get(row).getFlashing();
            case 6:
                return ld.get(row).getPendarahan_mata();
            case 7:
                return ld.get(row).getPendarahan_mulut();
            case 8:
                return ld.get(row).getPendarahan_hidung();
            case 9:
                return ld.get(row).getPendarahan_tutup_insang();
            case 10:
                return ld.get(row).getBorok();
            case 11:
                return ld.get(row).getMata();
            case 12:
                return ld.get(row).getInsang();
            case 13:
                return ld.get(row).getSisik();
            case 14:
                return ld.get(row).getSirip();
            case 15:
                return ld.get(row).getLender();
            case 16:
                return ld.get(row).getTubuh();
            case 17:
                return ld.get(row).getLintah();
            case 18:
                return ld.get(row).getEkor();
            case 19:
                return ld.get(row).getMati();
//            case 20:
//                return ld.get(row).getMati();
//            case 21:
//                return lg.get(row).getId_target();
            default:
                return null;
        }
    }
    
    
    
    
}
