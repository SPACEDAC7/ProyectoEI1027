package testsActualizacion;

import dao.Propiedad;
import dao.PropiedadDao;

public class TestPropiedadUpdateDao {
	public static void main(String[] args){
		PropiedadDao propDao = new PropiedadDao();
		Propiedad prop = new Propiedad(1,1,"Casa Asdrubal","Es una ca molto grande","casa",6,5,5,150,"wifi",20.3F,1,"http://maps.google.com/CasaAsdrubal");
		propDao.updatePropiedad(prop);
		System.out.println("Propiedad " + prop.getId_propiedad() + " actualizada");
		
		prop = new Propiedad(2,3,"Casa Pepe","Parrapapapappa","casa",6,5,5,150,"bar",10.3F,1,"http://maps.google.com/CasaLoca");
		propDao.updatePropiedad(prop);
		System.out.println("Propiedad " + prop.getId_propiedad() + " actualizada");
	
		
		prop = new Propiedad(3,2,"Casa Colubi","La nevera esta llena","piso",8,5,5,150,"restaurante",14.3F,1,"http://maps.google.com/CasaHAHAHA");
		propDao.updatePropiedad(prop);
		System.out.println("Propiedad " + prop.getId_propiedad() + " actualizada");
		
		
		prop = new Propiedad(4,5,"Casa Pep","Comida para todos","casa",9,8,8,250,"wifi",16.3F,1,"http://maps.google.com/CasaDonLimpio");
		propDao.updatePropiedad(prop);
		System.out.println("Propiedad " + prop.getId_propiedad() + " actualizada");
		
		prop = new Propiedad(5,6,"Casa Pacopep","La donna é mobile","casa",6,3,3,100,"wifi",35.3F,1,"http://maps.google.com/CasaEjemplo");
		propDao.updatePropiedad(prop);
		System.out.println("Propiedad " + prop.getId_propiedad() + " actualizada");
		
		prop = new Propiedad(6,4,"Casa L","esto es un acertijo","casal",3,7,7,50,"bar",3.3F,1,"http://maps.google.com/CasaAcertijo");
		propDao.updatePropiedad(prop);
		System.out.println("Propiedad " + prop.getId_propiedad() + " actualizada");
		}
}
