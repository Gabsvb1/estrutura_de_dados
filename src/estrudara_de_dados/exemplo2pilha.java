package estrudara_de_dados;

import java.util.Stack;

public class exemplo2pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("prato verde");
		pilha.push("prato Azul");
		pilha.push("prato branco");
		
		System.out.println("\nElementos da plha" + pilha);
		System.out.println("\n Retirar elementos da pilha: " + pilha.pop());
		

	}

}
