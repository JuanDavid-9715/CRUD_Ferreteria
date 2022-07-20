package utilities;

import javax.swing.table.DefaultTableModel;

//@author Juan David Medellin Calderon
public class ModeloTabla extends DefaultTableModel{
			String[] title;
			Object[][] data;
			
			public ModeloTabla() {
						
			}
			
			public ModeloTabla(Object[][] data, String[] title) {
						super();
						this.title = title;
						this.data = data;
						setDataVector(this.data, this.title);
			}
}
