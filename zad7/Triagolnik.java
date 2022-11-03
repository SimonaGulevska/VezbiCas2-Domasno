package fikt.oop.inki895.zad7;

public class Triagolnik {
	public int a;
	public int b;
	public int c;
	public int h;
	
	public Triagolnik() {
		
	}
	public int plostina() {
		int P;
		P=(a*h)/2;
		return P;
		
	}
	public int perimetar() {
		int L;
		L=a+2*b;
		return L;
	}
}
