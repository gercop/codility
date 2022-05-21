package codificacao_topico_50_arvoreBinaria;

public class Node {
	
	private Node left;
	private Node right;
	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node(int value) {
		
		this.value = value;
	}
	
	public void insert(Node node, int value) {
		
		if (node != null) {
			// Verifica se o value a ser inserido é menor que o nodo corrente da árvore, se
			// sim vai para subárvore left
			if (value < node.value) {
				// Se tiver elemento no nodo leftuerdo continua a busca
				if (node.left != null) {
					insert(node.left, value);
				} else {
					// Se nodo leftuerdo vazio insere o novo nodo aqui
					System.out.println("Inserindo " + value + " a left de " + node.value);
					node.left = new Node(value);
				}
				// Verifica se o value a ser inserido é maior que o nodo corrente da árvore, se
				// sim vai para subárvore right
			} else if (value > node.value) {
				// Se tiver elemento no nodo righteito continua a busca
				if (node.right != null) {
					insert(node.right, value);
				} else {
					// Se nodo righteito vazio insere o novo nodo aqui
					System.out.println("Inserindo " + value + " a right de " + node.value);
					node.right = new Node(value);
				}
			}
		}
	}
	
	public Node removevalueMinimoDaArvore(Node node) {
		
		if (node == null) {
			System.out.println("  ERRO ");
		} else if (node.left != null) {
			node.left = removevalueMinimoDaArvore(node.left);
			return node;
		} else {
			// Se não tiver elemento leftuerdo só nos resta o da right
			return node.right;
		}
		return null;
	}
	
	public void preOrder(Node node) {
		
		if (node != null) {
			System.out.print(String.format("|%4d ", node.value));
			preOrder(node.left);
			preOrder(node.right);
		}
	}	
	
	public void posOrder(Node node) {
		
		if (node != null) {
			posOrder(node.left);
			posOrder(node.right);
			System.out.print(String.format("|%4d ", node.value));
		}
	}
	
	public void inOrder(Node node) {
		
		if (node != null) {
			inOrder(node.left);
			System.out.print(String.format("|%4d ", node.value));
			inOrder(node.right);
		}
	}

	public int altura(Node node) {

		if (node == null || (node.left == null && node.right == null))
			return 0;
		else {
			if (altura(node.left) > altura(node.right))
				return (1 + altura(node.left));
			else
				return (1 + altura(node.right));
		}
	}
	
	public int countLeaf(Node node) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		return countLeaf(node.left) + countLeaf(node.right);
	}

	public int countNodes(Node node) {
		
		if (node == null)
			return 0;
		else
			return (1 + countNodes(node.left) + countNodes(node.right));
	}

	public Node min(Node node) {
		
		Node anterior = null;
		while (node != null) {
			anterior = node;
			node = node.left;
		}
		return anterior;
	}

	public Node max(Node node) {		
		
		Node anterior = null;
		while (node != null) {
			anterior = node;
			node = node.right;
		}
		return anterior;
	}
	
	public Node search(Node node, int value) {

		if (node == null)
			return null; // se arvore vazia

		while (node.value != value) { // enquanto nao encontrou

			if (value < node.value)
				node = node.left; // caminha para esquerda
			else
				node = node.right; // caminha para direita

			if (node == null)
				return null; // encontrou uma folha -> sai
		}

		return node; // terminou o laço while e chegou aqui é pq encontrou item
	}
	
	public Node getLeft(Node node) {
		return node.left;
	}
	
	public Node getRight(Node node) {
		return node.right;
	}
	
	public static void main(String[] args) {

		//Exemplo implementado: 
		//https://www.devmedia.com.br/trabalhando-com-arvores-binarias-em-java/25749
		Node root = new Node(8);
		root.insert(root, 3);
		root.insert(root, 1);
		root.insert(root, 6);
		root.insert(root, 4);
		root.insert(root, 7);
		root.insert(root, 10);
		root.insert(root, 14);
		root.insert(root, 13);		
		
		//Forçando o valor 50 fora de ordem:
		Node node = root.search(root, 1);
		System.out.println("\nValor procurado: " + node.getValue());
		root.insert(node, 50);
		System.out.println("\nValor procurado: " + node.getRight(node).getValue());		
	
		System.out.print("\nAltura da Árvore: ");
		System.out.print(root.altura(root));
		
		System.out.print("\nQtde de Folhas: ");
		System.out.print(root.countLeaf(root));

		System.out.print("\nQtde de Nós: ");
		System.out.print(root.countNodes(root));
		
		System.out.print("\nMínimo da Árvore: ");
		System.out.print(root.min(root).getValue());
		
		System.out.print("\nMáximo da Árvore: ");
		System.out.print(root.max(root).getValue());		
		
		System.out.print("\n\nListagem Pré-fixado: ");
		root.preOrder(root);
		System.out.print("\nListagem Pós-fixado: ");
		root.posOrder(root);
		System.out.print("\nListagem   Em ordem: ");
		root.inOrder(root);
	}
}
