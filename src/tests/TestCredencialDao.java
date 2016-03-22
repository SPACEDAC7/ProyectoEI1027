package tests;
import dao.Credencial;
import dao.CredencialDao;

public class TestCredencialDao {

	public static void main(String[] args) {
		CredencialDao credeDao = new CredencialDao();
		Credencial cre = new Credencial(1,"bbtsjb69","figura","propietario");
		credeDao.addCredencial(cre);

		System.out.println("Credencial "  + cre.getId_credencial() + " creada");
		
		cre = new Credencial(2,"almolo","feria","administrador");
		credeDao.addCredencial(cre);
		
		System.out.println("Credencial "  + cre.getId_credencial() + " creada");
		
		cre = new Credencial(3,"eslavo","feten","propietario");
		credeDao.addCredencial(cre);
		
		System.out.println("Credencial "  + cre.getId_credencial() + " creada");
		
		cre = new Credencial(4,"muzcka","rusos","inquilino");
		credeDao.addCredencial(cre);
		
		System.out.println("Credencial "  + cre.getId_credencial() + " creada");
		
		cre = new Credencial(5,"traca","valen","administrador");
		credeDao.addCredencial(cre);
		
		System.out.println("Credencial "  + cre.getId_credencial() + " creada");
		
		cre = new Credencial(6,"renato","niño","inquilino");
		credeDao.addCredencial(cre);
		
		System.out.println("Credencial "  + cre.getId_credencial() + " creada");

	}

}
