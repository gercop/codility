package codificacao_topico_40_listas;

import java.util.PriorityQueue;

public class priorityqueue_V1 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(84);
		queue.add(13);
		queue.add(26);
		queue.add(11);

		for ( Integer integer: queue) {
			System.out.printf("%d\n", integer);
		}
		
		System.out.println();
		
		while ( !queue.isEmpty() ) {
			System.out.printf("%d ", queue.remove());
		}
	}
}
