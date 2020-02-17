package data_structure;

public class Main {
	public static void main(String[] args) {
		SpecialStack pilha = new SpecialStack(10);
		pilha.pushRed(10);
		pilha.pushRed(10);
		pilha.pushRed(10);
		pilha.pushRed(18);
		pilha.pushBlack(10);
		pilha.pushBlack(10);
		pilha.pushBlack(15);
		System.out.println(pilha.topBlack());
		System.out.println(pilha.topRed());
		pilha.popBlack();
		System.out.println(pilha.topBlack());
	}
}
