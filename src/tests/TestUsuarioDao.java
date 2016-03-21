package tests;

import java.sql.Date;

import dao.Usuario;
import dao.UsuarioDao;

public class TestUsuarioDao {
	
	public static void main(String[] args) {
		UsuarioDao usuarioDao = new UsuarioDao();
		System.out.println("Llista de usuarios a la base de dades:");
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(0);
		usuario.setNombre("Pepito");
		usuario.setApellido("pepote");
		usuario.setTelefono(666555444);
		usuario.setEmail("mail@mail.com");
		usuario.setEstadoUsuario(true);
		usuario.setFechaRegistro(new Date(2016, 03, 21));
		usuario.setIdCredencial(0);
		usuario.setIdDireccion(0);
		usuario.setNif("20102010-X");
		
		usuarioDao.addUsuario(usuario);
	}

}
