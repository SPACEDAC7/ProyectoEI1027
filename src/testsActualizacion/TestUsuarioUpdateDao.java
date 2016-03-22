package testsActualizacion;

import java.sql.Date;

import dao.Usuario;
import dao.UsuarioDao;

public class TestUsuarioUpdateDao {
	
	public static void main(String[] args) {
		
		UsuarioDao usuarioDao = new UsuarioDao();
		System.out.println("Llista de usuarios a la base de dades:");
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(1);
		usuario.setNombre("Pepito");
		usuario.setApellido("pepote");
		usuario.setTelefono(666555444);
		usuario.setEmail("mail@mail.com");
		usuario.setEstadoUsuario(true);
		usuario.setFechaRegistro(new Date(2016, 03, 21));
		usuario.setIdCredencial(1);
		usuario.setIdDireccion(1);
		usuario.setNif("20102010X");
		
		usuarioDao.updateUsuario(usuario);
		System.out.println("Usuario " + usuario.getIdUsuario() + " borrado");
		
		usuario = new Usuario(2,3,"Paco2","Mus","53444444H","paco@mail.com",2,new Date(2016,03,22),654598744,true);
		usuarioDao.updateUsuario(usuario);
		System.out.println("Usuario " + usuario.getIdUsuario() + " borrado");
		
		usuario = new Usuario(3,6,"Carlos2","Mollón","53445464F","carlos@mail.com",3,new Date(2016,02,22),698765444,true);
		usuarioDao.updateUsuario(usuario);
		System.out.println("Usuario " + usuario.getIdUsuario() + " borrado");
		
		usuario = new Usuario(4,5,"David2","Guapo","53498774P","david@mail.com",4,new Date(2016,01,22),654565987,false);
		usuarioDao.updateUsuario(usuario);
		System.out.println("Usuario " + usuario.getIdUsuario() + " borrado");
		
		usuario = new Usuario(5,4,"Isra2","Boss","53443244H","isra@mail.com",5,new Date(2016,03,10),654598764,true);
		usuarioDao.updateUsuario(usuario);
		System.out.println("Usuario " + usuario.getIdUsuario() + " borrado");
		
		usuario = new Usuario(6,2,"Oscar2","Ballester","53411144W","oscar@mail.com",6,new Date(2015,03,22),987665444,true);
		usuarioDao.updateUsuario(usuario);
		System.out.println("Usuario " + usuario.getIdUsuario() + " borrado");
		
	}

}
