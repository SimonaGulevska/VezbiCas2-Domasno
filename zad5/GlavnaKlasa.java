package fikt.oop.inki895.zad5;

public class GlavnaKlasa {

	public static void main(String[] args) {
		Predmet p=new Predmet();
		p.imeNaPredmetot="Organzacisko Pretpriemnistvo";
		p.profesor="Monika Markovska";
		p.brojNaKrediti=30;
		p.brojNaSemestar=1;
		//pecatenje na vrednostite od prviot konstruktor(default)
		System.out.println("Ime na predmetot: "+p.imeNaPredmetot+", profesor: "+p.profesor+", broj na krediti: "+p.brojNaKrediti+", broj na semestar: "+p.brojNaSemestar+".");
		Predmet p1=new Predmet("Objektno Orientirano Programiranje");
		//pecatenje na vrednostite od VTORIOT konstruktor(dinamicen) so eden vlezen parametar
		System.out.println("Ime na predmetot: "+p1.imeNaPredmetot);
		Predmet p2=new Predmet("Ekonmija i biznis","Bozidar Milenkovski",30);
		//pecatenje na vrednostite od TRETIOT konstruktor (dinamicen) so tri vlezni parametri
		System.out.println("Ime na predmetot: "+p2.imeNaPredmetot+", profesor: "+p2.profesor+", broj na krediti: "+p2.brojNaKrediti);
	}
}
