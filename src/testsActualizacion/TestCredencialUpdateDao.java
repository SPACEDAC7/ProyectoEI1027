package testsActualizacion;
import dao.Credencial;
import dao.CredencialDao;

public class TestCredencialUpdateDao {

	public static void main(String[] args) {
		CredencialDao credeDao = new CredencialDao();
//		Credencial cre = new Credencial(1,"bbtsjb69","figura2","propietario");
//		credeDao.updateCredencial(cre);
//
//		System.out.println("Credencial "  + cre.getId_credencial() + " actualizada");
		
		Credencial cre = new Credencial(2,"almolo","feria2","administrador");
		credeDao.updateCredencial(cre);
		
		System.out.println("Credencial "  + cre.getId_credencial() + " actualizada");
		
		cre = new Credencial(3,"eslavo","feten2","propietario");
		credeDao.updateCredencial(cre);
		
		System.out.println("Credencial "  + cre.getId_credencial() + " actualizada");
		
		cre = new Credencial(4,"muzcka","rusos2","inquilino");
		credeDao.updateCredencial(cre);
		
		System.out.println("Credencial "  + cre.getId_credencial() + " actualizada");
		
		cre = new Credencial(5,"traca","valen2","administrador");
		credeDao.updateCredencial(cre);
		
		System.out.println("Credencial "  + cre.getId_credencial() + " actualizada");
		
		cre = new Credencial(6,"renato","niño2","inquilino");
		credeDao.updateCredencial(cre);
		
		System.out.println("Credencial "  + cre.getId_credencial() + " actualizada");

	}

}
