package specifikacija;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface Interfejs {
	
	public void dodajKurs(GregorianCalendar datum, double prodajniKurs, 
			double srednjiKurs, double kupovniKurs); 

	public Kurs obrisiKurs(GregorianCalendar datum); 

	public Kurs pronadjiKurs(GregorianCalendar datum); 

}
