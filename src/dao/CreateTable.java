package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import conection.ConnectionManager;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		Connection conn = ConnectionManager.getConnection();
		
		Statement stmt = null;
		try{
			stmt = conn.createStatement();
			System.out.println("Creando las tablas de las bases de datos...");
			String sql_direccion = "CREATE TABLE DIRECCION ("+
									"id_direccion NUMERIC,"+
									"calle VARCHAR(50),"+
									"numero NUMERIC,"+
									"codigo_postal NUMERIC,"+
									"localidad VARCHAR(50),"+
									"provincia VARCHAR(50),"+
									"CONSTRAINT cp_direccion PRIMARY KEY (id_direccion)"+
									");";
			String sql_credencial = " CREATE TABLE CREDENCIAL ("+
									"id_credencial NUMERIC,"+
									"nick_usuario VARCHAR(20),"+
									"password VARCHAR(50),"+
									"rol VARCHAR(30),"+
									"CONSTRAINT cp_credencial PRIMARY KEY (id_credencial),"+ 
									"CONSTRAINT calt_credencial UNIQUE (nick_usuario),"+
									"CONSTRAINT ri_credencial CHECK (rol='propietario' OR rol='administrador' OR rol='inquilino')"+
									");";
			String sql_factura = "CREATE TABLE FACTURA ("+
									"id_factura NUMERIC,"+
									"id_reserva NUMERIC,"+
									"fecha_factura DATE,"+
									"precio_factura FLOAT(2),"+
									"iva NUMERIC,"+
									"CONSTRAINT cp_factura PRIMARY KEY (id_factura),"+
									"CONSTRAINT ca_factura_reserva FOREIGN KEY (id_reserva) REFERENCES reserva(id_reserva) ON UPDATE CASCADE ON DELETE RESTRICT"+
									");";
			String sql_usuario = "CREATE TABLE USUARIO ("+
									"id_usuario NUMERIC,"+
									"id_credencial NUMERIC,"+
									"nombre VARCHAR(20),"+
									"apellido VARCHAR(50),"+
									"nif VARCHAR(9),"+
									"email VARCHAR(50),"+
									"id_direccion NUMERIC,"+
									"fecha_registro DATE,"+
									"telefono NUMERIC,"+
									"estado_usuario BOOLEAN"+
									"CONSTRAINT cp_usuario PRIMARY KEY (id_usuario),"+
									"CONSTRAINT ca_usuario_credencial FOREIGN KEY (id_credencial) REFERENCES credencial(id_credencial) ON DELETE RESTRICT ON UPDATE RESTRICT,"+
									"CONSTRAINT ca_usuario_direccion FOREIGN KEY (id_direccion) REFERENCES direccion(id_direccion) ON DELETE RESTRICT ON UPDATE CASCADE,"+
									"CONSTRAINT calt_usuario UNIQUE (nif)"+
									");";
			String sql_respuesta_puntuacion = "CREATE TABLE RESPUESTA_PUNTUACION ("+
									"id_respuesta NUMERIC,"+
									"id_puntuacion NUMERIC,"+
									"respuesta VARCHAR(1000),"+
									"CONSTRAINT cp_respuesta_puntuacion PRIMARY KEY (id_respuesta),"+
									"CONSTRAINT ca_respuesta_puntuacion_puntuacion FOREIGN KEY (id_puntuacion) REFERENCES puntuacion(id_puntuacion) ON UPDATE CASCADE ON DELETE CASCADE"+
									");";
			String sql_reserva = "CREATE TABLE RESERVA ("+
									"id_reserva NUMERIC,"+
									"id_usuario NUMERIC,"+
									"id_propiedad NUMERIC,"+
									"fecha_reserva DATE,"+
									"fecha_checkin DATE,"+
									"fecha_checkout DATE,"+
									"precio_reserva FLOAT(2),"+
									"estado VARCHAR(20),"+
									"CONSTRAINT cp_reserva PRIMARY KEY (id_reserva),"+
									"CONSTRAINT ca_reserva_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario) ON UPDATE CASCADE ON DELETE RESTRICT,"+
									"CONSTRAINT ca_reserva_propiedad FOREIGN KEY (id_propiedad) REFERENCES propiedad(id_propiedad) ON UPDATE CASCADE ON DELETE RESTRICT,"+
									"CONSTRAINT ri_reserva_status CHECK (estado='conformada' OR estado='denegada' OR estado='pendiente')"+
									");";
			String sql_puntuacion = "CREATE TABLE PUNTUACION ("+
									"id_puntuacion NUMERIC,"+
									"id_propiedad NUMERIC,"+
									"id_usuario NUMERIC,"+
									"valor_puntuacion NUMERIC,"+
									"comentario VARCHAR(1000),"+
									"CONSTRAINT cp_puntuacion PRIMARY KEY (id_puntuacion),"+
									"CONSTRAINT ca_puntuacion_propiedad FOREIGN KEY (id_propiedad) REFERENCES propiedad(id_propiedad) ON DELETE CASCADE ON UPDATE CASCADE,"+
									"CONSTRAINT ca_puntuacion_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario) ON DELETE RESTRICT ON UPDATE CASCADE"+
									");";
			String sql_propiedad = "CREATE TABLE PROPIEDAD ("+
									"id_propiedad NUMERIC,"+
									"id_usuario NUMERIC,"+
									"titulo VARCHAR(50),"+
									"descripcion VARCHAR(1000),"+
									"tipo VARCHAR(50),"+
									"capacidad NUMERIC,"+
									"num_habitaciones NUMERIC,"+
									"num_camas NUMERIC,"+
									"area NUMERIC,"+
									"servicios VARCHAR(100),"+
									"precio_propiedad FLOAT(2),"+
									"id_direccion NUMERIC,"+
									"url_mapa VARCHAR (100),"+
									"CONSTRAINT cp_propiedad PRIMARY KEY (id_propiedad),"+
									"CONSTRAINT ca_propiedad_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario) ON DELETE RESTRICT ON UPDATE CASCADE,"+
									"CONSTRAINT ca_propiedad_direccion FOREIGN KEY (id_direccion) REFERENCES direccion(id_direccion) ON DELETE RESTRICT ON UPDATE CASCADE"+
									");";
			String sql_periodo = "CREATE TABLE PERIODO ("+
									"id_periodo NUMERIC,"+
									"id_propiedad NUMERIC,"+
									"inicio DATE,"+
									"fin DATE,"+
									"CONSTRAINT cp_periodo PRIMARY KEY (id_periodo),"+
									"CONSTRAINT ca_periodo_propiedad FOREIGN KEY (id_propiedad) REFERENCES propiedad(id_propiedad) ON UPDATE CASCADE ON DELETE CASCADE"+
									");";
			String sql_imagen = "CREATE TABLE IMAGEN ("+
									"id_imagen NUMERIC,"+
									"id_propiedad NUMERIC,"+
									"pie_foto VARCHAR(50),"+
									"referencia VARCHAR(50),"+
									"CONSTRAINT cp_imagen PRIMARY KEY (id_imagen),"+
									"CONSTRAINT ca_imagen_propiedad FOREIGN KEY (id_propiedad) REFERENCES propiedad(id_propiedad) ON DELETE CASCADE ON UPDATE CASCADE"+
									");";
			stmt.executeUpdate(sql_direccion);
			stmt.executeUpdate(sql_credencial);
			stmt.executeUpdate(sql_usuario);
  			stmt.executeUpdate(sql_propiedad);  			
  			stmt.executeUpdate(sql_periodo);
  			stmt.executeUpdate(sql_imagen);
  			stmt.executeUpdate(sql_reserva);
  			stmt.executeUpdate(sql_factura);
  			stmt.executeUpdate(sql_puntuacion);
  			stmt.executeUpdate(sql_respuesta_puntuacion);
  			
  			
  			System.out.println("Tablas creadas...");
		}catch (SQLException e) {
			System.out.println("No s'ha pogut crear la taula.... ");
			e.printStackTrace();
			return;
		}finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					System.out.println("Error tancant PreparedStatement");
					e.printStackTrace();
				}
			}
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Error tancant connexi� JDBC");				
				e.printStackTrace();
			}
		}

	}

}
