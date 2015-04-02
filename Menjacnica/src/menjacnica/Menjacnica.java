package menjacnica;

import java.util.GregorianCalendar;

import java.util.LinkedList;

import specifikacija.Interfejs;

import menjacnica.Kurs;
import menjacnica.Valuta;


public class Menjacnica implements Interfejs {
	
	Valuta v = new Valuta(); 
	LinkedList<Kurs> kursevi = new LinkedList<Kurs>(); 


	public void dodajKurs(GregorianCalendar datum, double prodajniKurs,
			double srednjiKurs, double kupovniKurs) {
		
		Kurs kurs = new Kurs(); 
		kurs.setDatum(datum); 
		kurs.setKupovniKurs(kupovniKurs); 
		kurs.setProdajniKurs(prodajniKurs); 
		kurs.setSrednjiKurs(srednjiKurs); 

		
		
	}

	public Kurs obrisiKurs(GregorianCalendar datum) {
		
		for (int i = 0; i < kursevi.size(); i++) { 
			if (v.getKursevi().get(i).getDatum().equals(datum)) { 
				Kurs obrisan = v.getKursevi().get(i); 
				v.getKursevi().remove(i); 
				return obrisan; 
			} 

		} 
		return null; 

		
		
	}

	public Kurs pronadjiKurs(GregorianCalendar datum) {
		for (int i = 0; i < v.getKursevi().size(); i++) { 
			if (v.getKursevi().get(i).getDatum().equals(datum)) { 
				Kurs trazeni = v.getKursevi().get(i); 
				return trazeni; 
			} 
		} 

		return null; 

		
	}

}
