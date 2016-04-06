package testsBorrado;
import dao.Credencial;
import dao.CredencialDao;

public class TestCredencialBorradoDao {

	public static void main(String[] args) {
		CredencialDao credeDao = new CredencialDao();
		Credencial cre = new Credencial(1,"bbtsjb69","figura","propietario");
		credeDao.deleteCredencial(cre);

		System.out.println("Credencial "  + cre.getId_credencial() + " borrada");
		
//		cre = new Credencial(2,"almolo","feria","administrador");
//		credeDao.deleteCredencial(cre);
//		
//		System.out.println("Credencial "  + cre.getId_credencial() + " borrada");
//		
//		cre = new Credencial(3,"eslavo","feten","propietario");
//		credeDao.deleteCredencial(cre);
//		
//		System.out.println("Credencial "  + cre.getId_credencial() + " borrada");
//		
//		cre = new Credencial(4,"muzcka","rusos","inquilino");
//		credeDao.deleteCredencial(cre);
//		
//		System.out.println("Credencial "  + cre.getId_credencial() + " borrada");
//		
//		cre = new Credencial(5,"traca","valen","administrador");
//		credeDao.deleteCredencial(cre);
//		
//		System.out.println("Credencial "  + cre.getId_credencial() + " borrada");
//		
//		cre = new Credencial(6,"renato","niño","inquilino");
//		credeDao.deleteCredencial(cre);
//		
//		System.out.println("Credencial "  + cre.getId_credencial() + " borrada");

	}

}
