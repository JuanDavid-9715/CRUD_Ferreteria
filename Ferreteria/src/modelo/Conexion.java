package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//@author Juan David Medellin Calderon
public class Conexion {
			Connection con = null;
			
			public Connection getConexion(){
						try {
									con = DriverManager.getConnection(Properties.url, Properties.user, Properties.password);
									
									if (con != null)
									{
											System.out.println("*** Connected to database ***");	
									}
						} catch (SQLException ex) {
									System.out.println("Ha ocurrido un SQLException " + ex.getMessage());
						}
						
						return con;
			}
			
						
}
