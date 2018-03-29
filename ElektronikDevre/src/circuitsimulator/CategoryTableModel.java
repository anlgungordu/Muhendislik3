package circuitsimulator;
import javax.swing.table.AbstractTableModel;

public class CategoryTableModel extends AbstractTableModel {

    String[] columnNames = {
        "Aletler",
        "Kategori",
        "Açıklama"
    };
        Object[][] data = CircuitSimulator.data;
    
        public CategoryTableModel() {
System.out.println("anil");
    }
    @Override
    public int getRowCount() {
        return data.length;
    }
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    public String getColumnName(int col) {
        return columnNames[col];
    }
}
