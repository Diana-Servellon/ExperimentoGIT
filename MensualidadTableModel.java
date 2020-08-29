/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamodisplay;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Diana Servellón
 * 
 * table model extends abstract tablemodel // implicitamente usa TableModel
 * Table model.java
 */
public class MensualidadTableModel extends AbstractTableModel implements TableModel{
    
    String[] cols = {"Mensualidad", "Saldo", "Interés", "Amortización"}; 
    List<Mensualidad> rows; 
    
    public MensualidadTableModel(List<Mensualidad> rows){
        this.rows = rows; //lista de mensualidades por líneas
    }
    
    @Override 
    public int getColumnCount(){
        return 4; 
    }
    
    public String getColumnName(int col){
        return cols[col]; 
    }
    
    public int getRowCount(){
        return rows.size(); 
    }
    
    public Class<?> getColumnClass(int columnIndex){
        return Integer.class; 
    }
    
    @Override
    public Object getValueAt(int row, int col){
        Mensualidad m = rows.get(row); 
        Object ob= 0; 
        switch(col){ //cada caso es una columna 
            case 0: ob = m.getNumber(); break; 
            case 1: ob = Math.round(m.getCurrentAmount()); break; 
            case 2: ob= Math.round(m.getInterestAmount()); break; 
            case 3: ob= Math.round(m.getAmortizationAmount()); break; 
        }
        
        return ob; 
    }
    
}


