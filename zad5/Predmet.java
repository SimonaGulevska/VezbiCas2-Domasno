package fikt.oop.inki895.zad5;

public class Predmet {
	public String imeNaPredmetot;
	public String profesor;
	public int brojNaKrediti;
	public int brojNaSemestar;
	
	public Predmet() {
		
	}
	public Predmet(String imeNaPredmetot) {
		this.imeNaPredmetot=imeNaPredmetot;
		
	}
	public Predmet(String imeNaPredmetot,String profesor,int brojNaKrediti) {
		this.imeNaPredmetot=imeNaPredmetot;
		this.profesor=profesor;
		this.brojNaKrediti=brojNaKrediti;
	}
}
