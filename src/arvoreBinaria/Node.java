package arvoreBinaria;

public class Node {
	
	private Node esquerda;
	private Node direita;
	private int valor;
	
	public Node(int valor) {
		
		this.valor = valor;
	}
	
	public void inserir(Node node, int valor) {
		
		if (node != null) {
			// Verifica se o valor a ser inserido é menor que o nodo corrente da árvore, se
			// sim vai para subárvore esquerda
			if (valor < node.valor) {
				// Se tiver elemento no nodo esquerdo continua a busca
				if (node.esquerda != null) {
					inserir(node.esquerda, valor);
				} else {
					// Se nodo esquerdo vazio insere o novo nodo aqui
					System.out.println("  Inserindo " + valor + " a esquerda de " + node.valor);
					node.esquerda = new Node(valor);
				}
				// Verifica se o valor a ser inserido é maior que o nodo corrente da árvore, se
				// sim vai para subárvore direita
			} else if (valor > node.valor) {
				// Se tiver elemento no nodo direito continua a busca
				if (node.direita != null) {
					inserir(node.direita, valor);
				} else {
					// Se nodo direito vazio insere o novo nodo aqui
					System.out.println("  Inserindo " + valor + " a direita de " + node.valor);
					node.direita = new Node(valor);
				}
			}
		}
	}
	
	public Node removeValorMinimoDaArvore(Node node) {
		
		if (node == null) {
			System.out.println("  ERRO ");
		} else if (node.esquerda != null) {
			node.esquerda = removeValorMinimoDaArvore(node.esquerda);
			return node;
		} else {
			// Se não tiver elemento esquerdo só nos resta o da direita
			return node.direita;
		}
		return null;
	}
	
	public void preFixado(Node node) {
		
		if (node != null) {
			System.out.print(String.format("|%4d ", node.valor));
			preFixado(node.esquerda);
			preFixado(node.direita);
		}
	}	
	
	public void posFixado(Node node) {
		
		if (node != null) {
			posFixado(node.esquerda);
			posFixado(node.direita);
			System.out.print(String.format("|%4d ", node.valor));
		}
	}
	
	public void emOrdem(Node node) {
		
		if (node != null) {
			emOrdem(node.esquerda);
			System.out.print(String.format("|%4d ", node.valor));
			emOrdem(node.direita);
		}
	}
	
	public static void main(String[] args) {

		Node root = new Node(8);
		root.inserir(root, 3);
		root.inserir(root, 1);
		root.inserir(root, 6);
		root.inserir(root, 4);
		root.inserir(root, 7);
		root.inserir(root, 10);
		root.inserir(root, 14);
		root.inserir(root, 13);
		
		System.out.print("\nListagem Pré-fixado: ");
		root.preFixado(root);
		System.out.print("\nListagem Pós-fixado: ");
		root.posFixado(root);
		System.out.print("\nListagem   Em ordem: ");
		root.emOrdem(root);
	}
}
