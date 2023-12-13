package estrudara_de_dados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class exemplo1 {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList <Integer>();
		
		for(int indice = 0; indice <10; indice++ ) {
			fila.add(indice);
		}
		
		System.out.println("\n Elementos da fila" + fila);
        System.out.println("\n retirando um elemento da fila o primeiro no caso" + fila.remove());
        System.out.println("\n Elementos da fila atualizada" + fila);
        System.out.println("\n adicionar o elemento na fila" + fila.add(10));
        System.out.println("\n Elementos da fila atualizada" + fila);
        System.out.println("\n exibir o primeiro item da fila: " + fila.peek());
        System.out.println("\n Exibir o tamanho da fila " + fila.size());
        System.out.println("\n checar se existe um elemento na fila " + fila.contains(7));
        System.out.println("\n exibir e retirar o primeniro item da fila " + fila.poll());
        System.out.println("\n exibir os itens com interator: segue a baixo");
        
        Iterator<Integer> iterator= fila.iterator();
        
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        	
        }
        
        System.out.println("\na fila está vazia?" + fila.isEmpty());
        
        
	}

}
