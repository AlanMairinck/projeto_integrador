/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author alanm
 */
public class TableView {
    
       
    
    public static void viewTable(JTable table, Object[][] rows, Object[] columns )
    {
        table.setDefaultRenderer(Object.class, new Render());
        
        DefaultTableModel d = new DefaultTableModel
                (
                        rows,
                        columns
                ){
                    public boolean isCellEditable(int row, int column)
                    {
                        return false;
                    }
                };
        
        table.setModel(d);
        TableColumnModel cod = table.getColumnModel();
        cod.removeColumn(cod.getColumn(0));
    }
    
}
