package menjacnica;

import java.util.GregorianCalendar;

import specifikacija.Interfejs;


public class Menjacnica implements Interfejs {

	public void dodajKurs(GregorianCalendar datum, double prodajniKurs,
			double srednjiKurs, double kupovniKurs) {
		
		
		Kurs kurs = new Kurs(); 
		kurs.setDatum(datum); 
		kurs.setKupovniKurs(kupovniKurs); 
		kurs.setProdajniKurs(prodajniKurs); 
		kurs.setSrednjiKurs(srednjiKurs); 

		
	}

	public Kurs obrisiKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

	public Kurs pronadjiKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
