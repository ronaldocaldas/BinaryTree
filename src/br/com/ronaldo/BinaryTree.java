package br.com.ronaldo;

public class BinaryTree {

	private int valor;

	private BinaryTree left;
	private BinaryTree right;
	private static int soma;

	public BinaryTree(int valor) {
		this.valor = valor;
		left = null;
		right = null;
	}

	/**
	 * Adiciona um novo nó a arvore de acordo com o seu valor
	 * 
	 * @param num
	 */
	public void addNode(int num) {
		if (num < this.valor) {
			if (this.left != null) {
				this.left.addNode(num);
			} else {
				this.left = new BinaryTree(num);
			}
		} else {
			if (this.right != null) {
				this.right.addNode(num);
			} else {
				this.right = new BinaryTree(num);
			}
		}
	}

	/**
	 * Busca recursivamente o nó na arvore
	 * 
	 * @param current
	 * @param value
	 * @return
	 */
	public BinaryTree containsNodeRecursive(BinaryTree current, int value) {
		if (current == null) {
			return current;
		}
		if (value == current.valor) {
			return current;
		}
		return value < current.valor ? containsNodeRecursive(current.left, value)
				: containsNodeRecursive(current.right, value);
	}

	/**
	 * Soma os valores subsequentes do nó
	 * 
	 */
	public void traverseInOrder() {
		if (this.left != null) {
			this.left.traverseInOrder();
		}
		this.setSoma(this.getSoma() + this.valor);
		if (this.right != null) {
			this.right.traverseInOrder();
		}
	}

	public int getValor() {
		return valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}

	public int getSoma() {
		return soma;
	}

	public void setSoma(int soma) {
		BinaryTree.soma = soma;
	}
}
