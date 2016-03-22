package testsActualizacion;

import dao.Direccion;
import dao.DireccionDao;

public class TestDireccionUpdateDao {
	public static void main(String[] args){
		DireccionDao dirDao = new DireccionDao();
		Direccion dir = new Direccion(1,"ameba2",3,12540,"zorri","caquita");
		dirDao.updateDireccion(dir);
		
		System.out.println("Direccion " + dir.getId_direccion() + " actualizada");
		
		dir = new Direccion(2,"peregil2",76,12592,"xilxes","valencia");
		dirDao.updateDireccion(dir);
		
		System.out.println("Direccion " + dir.getId_direccion() + " actualizada");
		
		dir = new Direccion(3,"italia2",123,12540,"vila","castellon");
		dirDao.updateDireccion(dir);
		
		System.out.println("Direccion " + dir.getId_direccion() + " actualizada");
		
		
		dir = new Direccion(4,"zaragoza2",23,12592,"cs","cs");
		dirDao.updateDireccion(dir);
		
		System.out.println("Direccion " + dir.getId_direccion() + " actualizada");
		
		dir = new Direccion(5,"sin salida2",13,12540,"xilxes","castellon");
		dirDao.updateDireccion(dir);
		
		System.out.println("Direccion " + dir.getId_direccion() + " actualizada");
		
		dir = new Direccion(6,"cerrada2",21,12592,"vila","caquita");
		dirDao.updateDireccion(dir);
		
		System.out.println("Direccion " + dir.getId_direccion() + " actualizada");
		
	}
}
