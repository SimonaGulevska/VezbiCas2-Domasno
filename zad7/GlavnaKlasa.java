package fikt.oop.inki895.zad7;
import java.util.Scanner;

public class GlavnaKlasa {

	public static void main(String[] args) {
		Triagolnik t=new Triagolnik();
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesete vrednost za stranta a:");
		t.a=sc.nextInt();
		System.out.println("Vnesete vrednost za stranta b:");
		t.b=sc.nextInt();
		System.out.println("Vnesete vrednost za visinata h:");
		t.h=sc.nextInt();
		
		System.out.println("Plostinata na ramnokrak triagolnikot iznesuva: "+t.plostina()+" cm2.");
		System.out.println("Perimetarot na ramnokrak tragolnikot iznesuva: "+t.perimetar()+" cm.");
	}

}
