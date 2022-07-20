package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;



//@author Juan David Medellin Calderon
public class CRUD extends Conexion {
			
			PreparedStatement ps = null;
			ResultSet rs;
			
//			Agregar
			public boolean Insert(Store data) throws ClassNotFoundException {
						
						int id = data.getId();
						String name = data.getName();
						String category = data.getCategory();
						double PurchaseValue = data.getPurchaseValue();
						double SeleValue= data.getSeleValue();
						int Quantity = data.getQuantity();
						
						try
						{
									Connection con = getConexion();
									ps = con.prepareStatement("INSERT INTO `Store` (id, name, category, PurchaseValue, SeleValue, Quantity)"+ "VALUES(?,?,?,?,?,?)");
									
									ps.setInt(1, id);
									ps.setString(2, name);
									ps.setString(3, category);
									ps.setDouble(4, PurchaseValue);
									ps.setDouble(5, SeleValue);
									ps.setInt(6, Quantity);
									ps.execute();
									
									System.out.println("*** data agregado -> \"" + id + ", " + name + ", " + category + ", " + PurchaseValue + ", " + SeleValue + ", " + Quantity + "\" ***");
									
									return true;
						} catch (SQLException ex)
						{
									JOptionPane.showMessageDialog(null, ex.toString());
									
									return false;
						}
			}
			
//			Eliminar
			public boolean delete(Store data) throws ClassNotFoundException{
						
						int id = data.getId();
						String name = data.getName();
						String category = data.getCategory();
						double PurchaseValue = data.getPurchaseValue();
						double SeleValue= data.getSeleValue();
						int Quantity = data.getQuantity();
						
						try
						{
									Connection con = getConexion();
									ps = con.prepareStatement("DELETE FROM `Store` WHERE id = ?");
									
									ps.setInt(1, id);
									ps.execute();
									
									System.out.println("*** data eliminado -> \"" + id + name + category + PurchaseValue + SeleValue+ Quantity + "\" ***");
									
									return true;
						} catch (SQLException ex)
						{
									JOptionPane.showMessageDialog(null, ex.toString());
									
									return false;
						}
			}
			
//			Editar
			public boolean update(Store data) throws ClassNotFoundException {
						
						int id = data.getId();
						String name = data.getName();
						String category = data.getCategory();
						double PurchaseValue = data.getPurchaseValue();
						double SeleValue= data.getSeleValue();
						int Quantity = data.getQuantity();
						
						try
						{
									Connection con = getConexion();
									ps = con.prepareStatement("UPDATE `Store` SET id = ?, name = ?, category = ?, PurchaseValue = ?, SeleValue = ?, Quantity = ? where id = ?");
									
									ps.setInt(1, id);
									ps.setString(2, name);
									ps.setString(3, category);
									ps.setDouble(4, PurchaseValue);
									ps.setDouble(5, SeleValue);
									ps.setInt(6, Quantity);
									ps.setInt(7, id);
									ps.execute();
									
									System.out.println("*** Edita = \"" + id + "\" -> \"" + id + name + category + PurchaseValue + SeleValue+ Quantity + "\" ***");
									
									return true;
						} catch (SQLException ex)
						{
									JOptionPane.showMessageDialog(null, ex.toString());
									
									return false;
						}
			}
			
//			Traer tabla
			public ArrayList<Store> List() {
						
						ArrayList<Store> list = new ArrayList<>();

						try
						{
									Connection con = getConexion();
									ps = con.prepareStatement("SELECT * FROM `Store`");
									rs = ps.executeQuery();

									while (rs.next())
									{
												list.add(new Store(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5), rs.getInt(6)));
									}
									
									System.out.println("*** Se traguieron los datas de la base de datas ***");
						} catch (SQLException ex)
						{
									JOptionPane.showMessageDialog(null, ex.toString());
						}

						return list;
			}
			
//			Buscador de codigo
			public ArrayList<Store> search(int id) {
						
						ArrayList<Store> lista = new ArrayList<>();

						try
						{
									Connection con = getConexion();
									ps = con.prepareStatement("SELECT * FROM `Store` WHERE id = ?");
									ps.setInt(1, id);
									rs = ps.executeQuery();

									while (rs.next())
									{
												lista.add(new Store(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5), rs.getInt(6)));
									}
									
									System.out.println("*** Se tragieron los datas del id = \"" + id + "\" ***");
						} catch (SQLException ex)
						{
									JOptionPane.showMessageDialog(null, ex.toString());
						}

						return lista;
			}
}
