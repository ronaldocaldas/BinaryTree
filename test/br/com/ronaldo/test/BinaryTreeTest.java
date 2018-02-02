package br.com.ronaldo.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.ronaldo.BinaryTree;

public class BinaryTreeTest {

	BinaryTree tree;

	@Before
	public void setUp() throws Exception {

		// nó raiz
		tree = new BinaryTree(6);
		int[] nums = { 4, 8, 3, 5, 7, 9 };
		for (int i : nums) {
			tree.addNode(i);
		}
	}

	@Test
	public void addNodeTest() {

		BinaryTree clone = new BinaryTree(6);
		int[] nums = { 4, 8, 3, 5, 7, 9 };

		for (int i : nums) {
			tree.addNode(i);
		}

		clone.addNode(10);

		assertNotEquals(tree, clone);
	}

	@Test
	public void constainRecursiveTest() {
		assertEquals(tree.getLeft(), tree.containsNodeRecursive(tree, 4));
		assertEquals(tree.getLeft().getRight(), tree.containsNodeRecursive(tree, 5));
		assertNotEquals(tree.getLeft(), tree.containsNodeRecursive(tree, 2));
	}

	@Test
	public void traverseInOrderTest() {

		BinaryTree seis = tree.containsNodeRecursive(tree, 6);
		seis.traverseInOrder();
		assertEquals(42, seis.getSoma());
		tree.setSoma(0);
		
		BinaryTree quatro = tree.containsNodeRecursive(tree, 4);
		quatro.traverseInOrder();
		assertEquals(12, quatro.getSoma());
		tree.setSoma(0);
		
		BinaryTree oito = tree.containsNodeRecursive(tree, 8);
		oito.traverseInOrder();
		assertEquals(24, oito.getSoma());
		tree.setSoma(0);
		
	}

}
