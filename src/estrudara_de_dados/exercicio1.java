package estrudara_de_dados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner; 


public class exercicio1 {
	
	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList <String>();
		int numero = 9999; 
		String nomes; 
		
				
		while(numero !=0) {
			System.out.println("**************** MENU **************");
			System.out.println("\n Digite a opção desejada:");
			System.out.println("\n 1- Adicionar um novo Cliente na fila");
			System.out.println("\n 2- Listar todos os Clientes na fila");
			System.out.println("\n 3- Chamar (retirar) uma pessoa da fila ");
			System.out.println("\n 0: O programa deve ser finalizado.");
			
			numero= leia.nextInt(); 
			
			leia.nextLine();		
			
							
		switch(numero) {
		  case 1:
			  System.out.println("adicione um nome para a fila");
			  nomes = leia.next();
			  fila.add(nomes);
			  System.out.println("Nome " + nomes +  " adicionado a fila");
		    break;
		  case 2:
			  System.out.println("\n Elementos da fila atualizada" + fila);
		 	break;
		  case 3:
			  System.out.println( fila.poll());
		  case 0:
		  System.out.println("programa finalizado!");
		  default:
		   System.out.println("O número escolhido é inválido! Digite um número entre 1 a 3 ou 0.");}
		
       
		}
		
		
	}

}
