package fikt.oop.inki895.zad4;

public class GlavnaKlasa {

	public static void main(String[] args) {
		Avtomobil a=new Avtomobil();
		//Dodeluvanje na vrednosti na atributite so dinamicen konstruktor preku objekotot a1
		Avtomobil a1=new Avtomobil("Mini Moris","R52",220);
		//Dodeluvanje na vrednosti na atributite so default konstruktor preku objektot a
		a.marka="Cadillac";
		a.model="CTV5-V";
		a.pominatiKm=160;
        System.out.println("Avtomobil: marka - "+a.marka+", model - "+a.model+", pominata kilometraza - "+a.pominatiKm+"km.");
        System.out.println("Avtomobil: marka - "+a1.marka+", model - "+a1.model+", pominata kilometraza - "+a1.pominatiKm+"km.");
	}

}
