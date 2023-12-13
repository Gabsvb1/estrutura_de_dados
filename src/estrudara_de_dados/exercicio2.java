package estrudara_de_dados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class exercicio2 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
	
		Stack<String> pilha = new Stack<String>();
		
		int numero = 9999; 
		String nomes; 
		
				
		while(numero !=0) {
			System.out.println("**************** MENU **************");
			System.out.println("\n Digite a opção desejada:");
			System.out.println("\n 1- Adicionar um novo livro na pilha");
			System.out.println("\n 2- Listar todos os livros na pilha");
			System.out.println("\n 3- Chamarar (retirar) um livro da pilha ");
			System.out.println("\n 0: O programa deve ser finalizado.");
			
			numero= leia.nextInt(); 
			
			leia.nextLine();		
			
							
		switch(numero) {
		  case 1:
			  System.out.println("adicione um livro para a pilha");
			  nomes = leia.next();
			  pilha.push(nomes);
			  System.out.println("Nome " + nomes +  " adicionado a pilha");
		    break;
		  case 2:
			  System.out.println("\n Elementos da pilha atualizada" + pilha);
		 	break;
		  case 3:
			  System.out.println( pilha.pop());
		  case 0:
		  System.out.println("programa finalizado!");
		  default:
		   System.out.println("O número escolhido é inválido! Digite um número entre 1 a 3 ou 0.");}
		
       
		}
	}

}
