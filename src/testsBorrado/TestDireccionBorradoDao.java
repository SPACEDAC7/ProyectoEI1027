package testsBorrado;

import dao.Direccion;
import dao.DireccionDao;

public class TestDireccionBorradoDao {
	public static void main(String[] args){
		DireccionDao dirDao = new DireccionDao();
		Direccion dir = new Direccion(1,"ameba",3,12540,"zorri","caquita");
		dirDao.deleteDireccion(dir);
		
		System.out.println("Direccion " + dir.getId_direccion() + " borrada");
		
		dir = new Direccion(2,"peregil",76,12592,"xilxes","valencia");
		dirDao.deleteDireccion(dir);
		
		System.out.println("Direccion " + dir.getId_direccion() + " borrada");
		
		dir = new Direccion(3,"italia",123,12540,"vila","castellon");
		dirDao.deleteDireccion(dir);
		
		System.out.println("Direccion " + dir.getId_direccion() + " borrada");
		
		
		dir = new Direccion(4,"zaragoza",23,12592,"cs","cs");
		dirDao.deleteDireccion(dir);
		
		System.out.println("Direccion " + dir.getId_direccion() + " borrada");
		
		dir = new Direccion(5,"sin salida",13,12540,"xilxes","castellon");
		dirDao.deleteDireccion(dir);
		
		System.out.println("Direccion " + dir.getId_direccion() + " borrada");
		
		dir = new Direccion(6,"cerrada",21,12592,"vila","caquita");
		dirDao.deleteDireccion(dir);
		
		System.out.println("Direccion " + dir.getId_direccion() + " borrada");
		
	}
}
