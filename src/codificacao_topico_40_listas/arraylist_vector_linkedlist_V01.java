package codificacao_topico_40_listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class arraylist_vector_linkedlist_V01 {

	/*
	 * Refer�ncias: 
	 * 		https://www.devmedia.com.br/diferenca-entre-arraylist-vector-e-linkedlist-em-java/29162:
	 * 		https://www.geeksforgeeks.org/linked-list-in-java/
	 * 
	 * Todas s�o muito parecidas, afinal elas implementam a mesma Interface, consequentemente possuem os mesmos m�todos mas n�o as mesmas implementa��es 
	 * dos m�todos, � aqui que podemos notar a principal diferen�a, que se da principalmente na performance. Diferente nas implementa��es da Interface 
	 * Set (HashSet, TreeSet e LinkedHashSet) que n�o aceitam elementos duplicados, as listas aceitam elementos duplicado, aqui j� encontramos um ponto 
	 * de diferen�a entre ambos os conceitos, ou seja, se voc� n�o quiser elementos duplicados use Set caso contr�rio use List.
	 */
	public static void main(String[] args) {
		
		 /* ArrayList: dimensionado dinamicamente, ou seja, sempre que � necess�rio o seu tamanho aumenta em 50% do tamanho da lista, significa que se voc� tiver 
		 * 		uma lista de tamanho igual a 10 e ela �encher�, seu tamanho aumentar� para 15 automaticamente. Al�m disso a ArrayList permite que elementos sejam 
		 * 		acessados diretamente pelos m�todos get() e set(), e adicionados atrav�s de add() e remove(). O que voc� vai perceber � que o ArrayList n�o remove 
		 * 		os elementos duplicados, e ainda podemos acessar qualquer elemento diretamente atrav�s do seu index, mas tudo tem um custo e veremos mais adiante.
		 * 		
		 * 		Todo ArrayList come�a com um tamanho fixo, que vai aumentando conforme necess�rio, mas o custo deste aumento � alto, pois � feita uma c�pia do array 
		 * 		atual para um novo array com um novo tamanho, ent�o imagine um array com 10mil elementos que ser� copiado para um novo array para cria��o de mais 5 
		 * 		mil elementos ? De fato � um alto custo. Ent�o � altamente aconselh�vel que voc� j� inicie seu Array com uma quantidade de elementos que atenda ao 
		 * 		seu objetivo atual, sem a necessidade de cria��o din�mica de novos espa�os, ou seja, se voc� saber que ter� que armazenar de 300 a 400 objetos em 
		 * 		um Array, defina 500, pois � melhor sobrar espa�o do que utilizar recurso do processador sem necessidade. 
		 * 
		 * 		H� ainda mais um ponto muito importante sobre ArrayList: Estes n�o s�o sincronizados, consequentemente n�o s�o thread-safe, ou seja, se sua aplica��o 
		 * 		precisa trabalhar com thread-safe em determinado ponto onde uma Lista � necess�ria, ent�o descarte ArrayList, a n�o ser que voc� fa�a isso explicitamente, 
		 * 		que obviamente n�o � o correto, veremos mais a diante uma Lista que � sincronizada.
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
		* Vector: Primeiramente vamos falar sobre o fato de Vector ser sincronizado e o ArrayList n�o. Significa dizer que se voc� possui uma aplica��o 
		* 		que precisa ser thread-safe em determinado ponto, use Vector e voc� estar� garantido. Outro ponto importante � a aloca��o din�mica do Vector, 
		* 		que � diferente do ArrayList. Lembra que falamos que o ArrayList aumenta 50% do seu tamanho quando a lista est� cheia? O Vector aumenta o 
		* 		dobro, ou seja, se voc� tem uma lista de 10 elementos cheia, essa lista aumentar� para 20, com 10 posi��es vazias. Mas isso n�o � ruim? 
		* 		Depende do que voc� precisar, se voc� est� precisando aumentar a quantidade de elementos com muita frequ�ncia, ent�o o ideal � usar o Vector 
		* 		que aumenta o dobro e voc� ficar� com muito mais espa�o do que no ArrayList que precisar� ficar aumentando com mais frequ�ncia, diminuindo 
		* 		assim a performance da sua aplica��o.
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
		 * linkedlist: Este tipo de lista implementa uma �double linked list�, ou seja, uma lista duplamente �linkada�. A sua principal 
		 * 		diferen�a entre o ArrayList � na performance entre os m�todos add, remove, get e set. Este tipo de lista possui melhor 
		 * 		performance nos m�todos add e remove, do que os m�todos add e remove do ArrayList, em compensa��o seus m�todos get e set 
		 * 		possuem uma performance pior do que os do ArrayList: 
		 * 			get(int index): LinkedList possui O(n) e ArrayList possui O(1)
		 * 			add(E element): LinkedList possui O(1) e ArrayList possui O(n) no pior caso, visto que o array ser� redimensionado e copiado para um novo array.
		 * 			add(int index, E element): LinkedList possui O(n) e ArrayList possui O(n) no pior caso
		 * 			remove(int index): LinkedList possui O(n) e ArrayList possui O(n-index), se remover o �ltimo elemento ent�o fica O(1)
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
		 * Compara��o entre os m�todos:		 
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
