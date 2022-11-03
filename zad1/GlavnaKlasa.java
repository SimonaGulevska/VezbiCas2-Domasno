package fikt.oop.inki895.zad1;

public class GlavnaKlasa {

	public static void main(String[] args) {
		Student object1=new Student();
		object1.ime="Стефан";
		object1.prezime="Стефановски"; 
		object1.indeks=2222;
		System.out.println("Податоци за прв објект:");
		System.out.println(object1.ime + " " +object1.prezime+ " " +object1.indeks);
		
		Student object2=new Student("Ангела","Ангелоска",3333);
		System.out.println ("Податоци за втор објект:");
		System.out.println (object2.ime+ " " +object2.prezime+" " +object2.indeks);
	}
}
