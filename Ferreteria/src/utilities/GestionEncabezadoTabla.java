package utilities;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

//@author Juan David Medellin Calderon
public class GestionEncabezadoTabla implements TableCellRenderer {
			
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
						JComponent jcomponent = null;
						if (value instanceof String string)
						{
									jcomponent = new JLabel(string);
									((JLabel) jcomponent).setHorizontalAlignment(SwingConstants.CENTER);
									((JLabel) jcomponent).setSize(30, jcomponent.getWidth());
									((JLabel) jcomponent).setPreferredSize(new Dimension(6, jcomponent.getWidth()));
						}

						jcomponent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(54,48,98)));
						jcomponent.setOpaque(true);
						jcomponent.setBackground(new Color(54,48,98));
						jcomponent.setToolTipText("Tabla Seguimiento");
						jcomponent.setForeground(Color.white);
						
						return jcomponent;
			}
}
