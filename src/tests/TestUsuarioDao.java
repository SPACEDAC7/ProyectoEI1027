package tests;

import java.sql.Date;

import dao.CredencialDao;
import dao.Direccion;
import dao.DireccionDao;
import dao.Credencial;
import dao.Usuario;
import dao.UsuarioDao;

public class TestUsuarioDao {
	
	public static void main(String[] args) {
//		CredencialDao credeDao = new CredencialDao();
//		Credencial cre = new Credencial(0,"bbtsjb69","figura","propietario");
//		credeDao.addCredencial(cre);
//
//		System.out.println("Credencial creada");
		
		DireccionDao dirDao = new DireccionDao();
		Direccion dir = new Direccion(0,"ameba",3,12540,"zorri","caquita");
		dirDao.addDireccion(dir);
		
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
		usuario.setNif("20102010X");
		
		usuarioDao.addUsuario(usuario);
	}

}
