package codificacao_topico_40_listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class arraylist_vector_linkedlist_V01 {

	/*
	 * Referências: 
	 * 		https://www.devmedia.com.br/diferenca-entre-arraylist-vector-e-linkedlist-em-java/29162:
	 * 		https://www.geeksforgeeks.org/linked-list-in-java/
	 * 
	 * Todas são muito parecidas, afinal elas implementam a mesma Interface, consequentemente possuem os mesmos métodos mas não as mesmas implementações 
	 * dos métodos, é aqui que podemos notar a principal diferença, que se da principalmente na performance. Diferente nas implementações da Interface 
	 * Set (HashSet, TreeSet e LinkedHashSet) que não aceitam elementos duplicados, as listas aceitam elementos duplicado, aqui já encontramos um ponto 
	 * de diferença entre ambos os conceitos, ou seja, se você não quiser elementos duplicados use Set caso contrário use List.
	 */
	public static void main(String[] args) {
		
		 /* ArrayList: dimensionado dinamicamente, ou seja, sempre que é necessário o seu tamanho aumenta em 50% do tamanho da lista, significa que se você tiver 
		 * 		uma lista de tamanho igual a 10 e ela “encher”, seu tamanho aumentará para 15 automaticamente. Além disso a ArrayList permite que elementos sejam 
		 * 		acessados diretamente pelos métodos get() e set(), e adicionados através de add() e remove(). O que você vai perceber é que o ArrayList não remove 
		 * 		os elementos duplicados, e ainda podemos acessar qualquer elemento diretamente através do seu index, mas tudo tem um custo e veremos mais adiante.
		 * 		
		 * 		Todo ArrayList começa com um tamanho fixo, que vai aumentando conforme necessário, mas o custo deste aumento é alto, pois é feita uma cópia do array 
		 * 		atual para um novo array com um novo tamanho, então imagine um array com 10mil elementos que será copiado para um novo array para criação de mais 5 
		 * 		mil elementos ? De fato é um alto custo. Então é altamente aconselhável que você já inicie seu Array com uma quantidade de elementos que atenda ao 
		 * 		seu objetivo atual, sem a necessidade de criação dinâmica de novos espaços, ou seja, se você saber que terá que armazenar de 300 a 400 objetos em 
		 * 		um Array, defina 500, pois é melhor sobrar espaço do que utilizar recurso do processador sem necessidade. 
		 * 
		 * 		Há ainda mais um ponto muito importante sobre ArrayList: Estes não são sincronizados, consequentemente não são thread-safe, ou seja, se sua aplicação 
		 * 		precisa trabalhar com thread-safe em determinado ponto onde uma Lista é necessária, então descarte ArrayList, a não ser que você faça isso explicitamente, 
		 * 		que obviamente não é o correto, veremos mais a diante uma Lista que é sincronizada.
		 */
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(6);

		Iterator<Integer> iter1 = al.iterator();
		while (iter1.hasNext()) {
			System.out.println(iter1.next());
		}

		System.out.println(al.get(2));
		
		al.remove(6);
		al.remove(5);		
		
		System.out.println();
		Iterator<Integer> iter2 = al.iterator();
		while (iter2.hasNext()) {
			System.out.println(iter2.next());
		}


		/* 
		* Vector: Primeiramente vamos falar sobre o fato de Vector ser sincronizado e o ArrayList não. Significa dizer que se você possui uma aplicação 
		* 		que precisa ser thread-safe em determinado ponto, use Vector e você estará garantido. Outro ponto importante é a alocação dinâmica do Vector, 
		* 		que é diferente do ArrayList. Lembra que falamos que o ArrayList aumenta 50% do seu tamanho quando a lista está cheia? O Vector aumenta o 
		* 		dobro, ou seja, se você tem uma lista de 10 elementos cheia, essa lista aumentará para 20, com 10 posições vazias. Mas isso não é ruim? 
		* 		Depende do que você precisar, se você está precisando aumentar a quantidade de elementos com muita frequência, então o ideal é usar o Vector 
		* 		que aumenta o dobro e você ficará com muito mais espaço do que no ArrayList que precisará ficar aumentando com mais frequência, diminuindo 
		* 		assim a performance da sua aplicação.
		* 		
		*/
		Vector<Integer> al2 = new Vector<Integer>();
		al2.add(3);
		al2.add(2);
		al2.add(1);
		al2.add(4);
		al2.add(5);
		al2.add(6);
		al2.add(6);

		Iterator<Integer> iter3 = al2.iterator();
		while(iter3.hasNext()){
		        System.out.println(iter3.next());
		}

		System.out.println(al2.get(2));
		
		/*
		 * linkedlist: Este tipo de lista implementa uma “double linked list”, ou seja, uma lista duplamente “linkada”. A sua principal 
		 * 		diferença entre o ArrayList é na performance entre os métodos add, remove, get e set. Este tipo de lista possui melhor 
		 * 		performance nos métodos add e remove, do que os métodos add e remove do ArrayList, em compensação seus métodos get e set 
		 * 		possuem uma performance pior do que os do ArrayList: 
		 * 			get(int index): LinkedList possui O(n) e ArrayList possui O(1)
		 * 			add(E element): LinkedList possui O(1) e ArrayList possui O(n) no pior caso, visto que o array será redimensionado e copiado para um novo array.
		 * 			add(int index, E element): LinkedList possui O(n) e ArrayList possui O(n) no pior caso
		 * 			remove(int index): LinkedList possui O(n) e ArrayList possui O(n-index), se remover o último elemento então fica O(1)
		 */
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(1,10);
		ll.add(2,7);		

		Iterator<Integer> iter4 = ll.iterator();
		System.out.println();
		while(iter4.hasNext()){
			System.out.println(iter4.next());
		}
		
		System.out.println(ll.element());		
		
		ll.set(1,1);
		ll.set(2,2);
		Iterator<Integer> iter5 = ll.iterator();
		System.out.println();
		while(iter5.hasNext()){
			System.out.println(iter5.next());
		}		
		
		/*
		 * Comparação entre os métodos:		 
		 */
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// ArrayList add
		long startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println();
		System.out.println("ArrayList add:  " + duration);

		// LinkedList add
		startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList add: " + duration);

		// ArrayList get
		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList get:  " + duration);

		// LinkedList get
		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList get: " + duration);

		// ArrayList remove
		startTime = System.nanoTime();

		for (int i = 9999; i >= 0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList remove:  " + duration);

		// LinkedList remove
		startTime = System.nanoTime();

		for (int i = 9999; i >= 0; i--) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList remove: " + duration);
	}
}
