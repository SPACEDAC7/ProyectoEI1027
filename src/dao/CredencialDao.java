package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import conection.ConnectionManager;

public class CredencialDao {
	private final static Logger Log = Logger.getLogger(DireccionDao.class.getName()); 
	private Connection conn = null;
	
	Credencial getCredencial(int id_credencial) {
		Connection conn = null;
		try {
			conn = ConnectionManager.getConnection();
		}
		catch (ClassNotFoundException e) {
			Log.severe("Driver JDBC no trobat");
			e.printStackTrace();
			return null;
		}
		catch (SQLException e) {
			Log.severe("Error creant connexió JDBC");
			e.printStackTrace();
			return null;
		}
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Credencial credencial = null;
		try {
			String sql = "SELECT id_credencial, nick_usuario, password, rol" + 
						"FROM credencial WHERE id_credencial = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id_credencial);
			rs = stmt.executeQuery();
			if ( rs != null){
				while(rs.next()){
					credencial.setId_credencial(rs.getInt(1));
					credencial.setNick_usuario(rs.getString(2));
					credencial.setPassword(rs.getString(3));
					credencial.setRol(rs.getString(4));
				}
			}
		} 
		catch (SQLException e) {
			Log.severe("Error executant PreparedStatement");
			e.printStackTrace();
			return null;
		}
		finally {
			if (rs != null) {
				try {
					rs.close();
				}
				catch (SQLException e) {
					Log.warning("Error tancant ResultSet");
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					Log.warning("Error tancant PreparedStatement");
					e.printStackTrace();
				}
			}
			try {
				conn.close();
			} catch (SQLException e) {
				Log.warning("Error tancant connexió JDBC");				
				e.printStackTrace();
			}
		}
		return credencial;
	}
	
	
	void addCredencial(Credencial credencial) {
		Connection conn = null;
		try {
			conn = ConnectionManager.getConnection();
		}
		catch (ClassNotFoundException e) {
			Log.severe("Driver JDBC no trobat");
			e.printStackTrace();
			return;
		}
		catch (SQLException e) {
			Log.severe("Error creant connexió JDBC");
			e.printStackTrace();
			return;
		}
		PreparedStatement stmt = null;
		try {
			 stmt = conn.prepareStatement(
					"insert into direccion(id_direccion, calle, numero, codigo_postal, localidad, provincia) "
					+ "values(?, ?, ?, ?, ?, ?)");
			stmt.setInt(1, direccion.getId_direccion());
			stmt.setString(2, direccion.getCalle());
			stmt.setInt(3, direccion.getNumero());
			stmt.setInt(4, direccion.getCodigo_postal());
			stmt.setString(5, direccion.getLocalidad());
			stmt.setString(6, direccion.getProvincia());
			stmt.execute();	
		}
		catch (SQLException e) {
			Log.severe("Error executant PreparedStatement");
			e.printStackTrace();
		}
		finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					Log.warning("Error tancant PreparedStatement");
					e.printStackTrace();
				}
			}
			try {
				conn.close();
			} catch (SQLException e) {
				Log.warning("Error tancant connexió JDBC");				
				e.printStackTrace();
			}
		}
	}
	
	void updateDireccion(Direccion direccion) {
		Connection conn = null;
		try {
			conn = ConnectionManager.getConnection();
		}
		catch (ClassNotFoundException e) {
			Log.severe("Driver JDBC no trobat");
			e.printStackTrace();
			return;
		}
		catch (SQLException e) {
			Log.severe("Error creant connexió JDBC");
			e.printStackTrace();
			return;
		}
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement(
					"update direccion "
					+ "set calle = ?,"
					+ "numero = ?"
					+ "codigo_postal = ?"
					+ "localidad = ?"
					+ "provincia = ?"
					+ "where id_direccion = ?");
			stmt.setString(1, direccion.getCalle());
			stmt.setInt(2, direccion.getNumero());
			stmt.setInt(3, direccion.getCodigo_postal());
			stmt.setString(4, direccion.getLocalidad());
			stmt.setString(5, direccion.getProvincia());
			stmt.setInt(6, direccion.getId_direccion());
			stmt.execute();	
		}
		catch (SQLException e) {
			Log.severe("Error executant PreparedStatement");
			e.printStackTrace();
		}
		finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					Log.warning("Error tancant PreparedStatement");
					e.printStackTrace();
				}
			}
			try {
				conn.close();
			} catch (SQLException e) {
				Log.warning("Error tancant connexió JDBC");				
				e.printStackTrace();
			}
		}
	}

	void deleteDireccion(Direccion direccion) {
		Connection conn = null;
		try {
			conn = ConnectionManager.getConnection();
		}
		catch (ClassNotFoundException e) {
			Log.severe("Driver JDBC no trobat");
			e.printStackTrace();
			return;
		}
		catch (SQLException e) {
			Log.severe("Error creant connexió JDBC");
			e.printStackTrace();
			return;
		}
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement(
					"DELETE FROM direccion WHERE id_direccion = ?");
			stmt.setInt(1, direccion.getId_direccion());
			stmt.execute();	
		}
		catch (SQLException e) {
			Log.severe("Error executant PreparedStatement");
			e.printStackTrace();
		}
		finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					Log.warning("Error tancant PreparedStatement");
					e.printStackTrace();
				}
			}
			try {
				conn.close();
			} catch (SQLException e) {
				Log.warning("Error tancant connexió JDBC");				
				e.printStackTrace();
			}
		}
	}
	
}
