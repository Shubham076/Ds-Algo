import java.util.LinkedList;
import java.util.Scanner;

public class binarytree {

	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root = null;

	private int size = 0;

	public binarytree() {
		Scanner scn = new Scanner(System.in);
		this.root = takeinput(scn, null, false);
	}

	private Node takeinput(Scanner scn, Node parent, boolean isleftorright) {
		if (parent == null) {
			System.out.println("Enter the data for root node");
		} else {
			if (isleftorright) {
				System.out.println("Enter the data for left node of " + parent.data);
			} else {
				System.out.println("Enter the data for right node" + parent.data);
			}

		}
		int nodedata = scn.nextInt();
		Node node = new Node(nodedata, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Do you have left child of" + node.data);
		choice = scn.nextBoolean();

		if (choice) {
			node.left = takeinput(scn, node, true);
		}

		choice = false;
		System.out.println("Do you have right child of " + node.data);
		choice = scn.nextBoolean();

		if (choice) {
			node.right = takeinput(scn, node, false);
		}

		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		String str = "";

		if (node.left != null) {
			str = str + node.left.data + "=>";
		} else {
			str = str + "End=>";
		}
		str = str + node.data;
		if (node.right != null) {
			str = str + "<=" + node.right.data;
		} else {
			str = str + "<=End";
		}
		System.out.println(str);
		if (node.left != null) {
			this.display(node.left);
		}
		if (node.right != null) {
			this.display(node.right);
		}
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {

		if (node == null) {
			return -1;
		}

		int lheight = height(node.left);
		int rheight = height(node.right);
		int height = Math.max(lheight, rheight) + 1;
		return height;

	}
	// pre order traversal means first node then left child and then right child;

	public void preordertraversal() {
		this.preordertraversal(this.root);
	}

	private void preordertraversal(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + ",");
		preordertraversal(node.left);
		preordertraversal(node.right);
	}

	// post order first left child,then right child, then node;
	public void postordertraversal() {
		this.postordertraversal(this.root);
	}

	private void postordertraversal(Node node) {
		if (node == null) {
			return;
		}

		postordertraversal(node.left);
		postordertraversal(node.right);
		System.out.print(node.data + ",");
	}

	// inordertraversal first left child, then node, then right child;
	public void inordertraversal() {
		this.inordertraversal(this.root);
	}

	private void inordertraversal(Node node) {
		if (node == null) {
			return;
		}

		inordertraversal(node.left);
		inordertraversal(node.right);
		System.out.print(node.data + ",");
	}

	public void levelorder() {

		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node rv = queue.removeFirst();
			System.out.println(rv.data + ",");

			if (rv.left != null) {
				queue.addLast(rv.left);
			}
			if (rv.right != null) {
				queue.addLast(rv.right);
			}
		}

	}
}
