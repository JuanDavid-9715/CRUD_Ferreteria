package utilities;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

//@author Juan David Medellin Calderon
public class GestionCeldas extends DefaultTableCellRenderer {
			private String tipo = "text";

			private Font normal = new Font("Verdana", Font.PLAIN, 12);
			private Font bold = new Font("Verdana", Font.BOLD, 12);
			
			//etiqueta que almacenará el icono a mostrar
			private JLabel label = new JLabel();
			
			//iconos disponibles para ser mostrados en la etiqueta dependiendo de la columna que lo contenga
			private ImageIcon imagenModify = new ImageIcon(getClass().getResource("/utilities/images/iconModify.png"));
			private ImageIcon imagenRemover = new ImageIcon(getClass().getResource("/utilities/images/iconRemover.png"));

			public GestionCeldas() {
						
			}

			public GestionCeldas(String tipo) {
						this.tipo = tipo;
			}

			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {

						/*
		 * Este metodo controla toda la tabla, podemos obtener el valor que contiene
		 * definir que celda está seleccionada, la fila y columna al tener el foco en ella.
		 * 
		 * cada evento sobre la tabla invocará a este metodo
						 */
						//definimos colores por defecto
						Color colorFondo = null;
						Color colorFondoPorDefecto = new Color(192, 192, 192);
						Color colorFondoSeleccion = new Color(140, 140, 140);

						/*
         * Si la celda del evento es la seleccionada se asigna el fondo por defecto para la selección
						 */
						if (selected)
						{
									this.setBackground(colorFondoPorDefecto);
						} else
						{
									//Para las que no están seleccionadas se pinta el fondo de las celdas de blanco
									this.setBackground(new Color(255,255,255));
						}

						/*
         * Se definen los tipos de datos que contendrán las celdas basado en la instancia que
         * se hace en la ventana de la tabla al momento de construirla
						 */
						if (tipo.equals("texto"))
						{
									//si es tipo texto define el color de fondo del texto y de la celda así como la alineación
									if (focused)
									{
												colorFondo = colorFondoSeleccion;
									} else
									{
												colorFondo = colorFondoPorDefecto;
									}
									this.setHorizontalAlignment(JLabel.LEFT);
									this.setText((String) value);
									//this.setForeground( (selected)? new Color(255,255,255) :new Color(0,0,0) );   
									//this.setForeground( (selected)? new Color(255,255,255) :new Color(32,117,32) );
									this.setBackground((selected) ? colorFondo : new Color(255,255,255));
									this.setFont(normal);
									//this.setFont(bold);
									return this;
						}

						//si el tipo es icono entonces valida cual icono asignar a la etiqueta.
						if (tipo.equals("icono"))
						{
									if (String.valueOf(value).equals("MODIFY"))
									{
												label.setIcon(new ImageIcon(imagenModify.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH)));
									} else if (String.valueOf(value).equals("REMOVER"))
									{
												label.setIcon(new ImageIcon(imagenRemover.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH)));
									}
									label.setHorizontalAlignment(JLabel.LEFT);
									label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
//            return boton;
									return label;
						}

						//definie si el tipo de dato el numerico para personalizarlo
						if (tipo.equals("numerico"))
						{
									if (focused)
									{
												colorFondo = colorFondoSeleccion;
									} else
									{
												colorFondo = colorFondoPorDefecto;
									}
									// System.out.println(value);
									this.setHorizontalAlignment(JLabel.CENTER);
									this.setText((String) value);
									this.setForeground((selected) ? new Color(185, 131, 255) : new Color(124, 62, 102));
									this.setBackground((selected) ? colorFondo : new Color(255,255,255));
									// this.setBackground( (selected)? colorFondo :Color.MAGENTA);
									this.setFont(bold);
									return this;
						}
						

						return this;
			}
}
