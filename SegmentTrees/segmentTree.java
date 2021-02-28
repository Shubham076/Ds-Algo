
public class segmentTree {

	private class Node {
		int data;
		int startInterval;
		int endInterval;
		Node left;
		Node right;
	}

	Node root;

	public segmentTree(int[] arr) {
		this.root = construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int si, int ei) {

		if (si == ei) {
			Node leafNode = new Node();
			leafNode.data = arr[si];
			leafNode.startInterval = si;
			leafNode.endInterval = si;
			return leafNode;
		}
		Node node = new Node();
		node.startInterval = si;
		node.endInterval = ei;

		int mid = (si + ei) / 2;
		node.left = this.construct(arr, si, mid);
		node.right = this.construct(arr, mid + 1, ei);

		node.data = node.left.data + node.right.data;
		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		String str = "";
		if (node.left != null) {
			str = str + "[ " + node.left.startInterval + "-" + node.right.endInterval + " ]and Data=" + node.left.data
					+ "=>";
		} else {
			str = str + "No left child =>";
		}

		str = str + "[ " + node.startInterval + "-" + node.endInterval + " ]and Data=" + node.data;

		if (node.right != null) {
			str = str + "<= Data=" + node.right.data + " [" + node.right.startInterval + "-" + node.right.endInterval
					+ " ]";

		} else {
			str = str + "<= No right child";
		}
		System.out.println(str);
		
		if(node.left!=null) {
			this.display(node.left);
		}
		
		if(node.right ! =null) {
			this.display(node.right);
		}
	}
	
	public int query(int qsi, int qei) {
		return this.query(this.root, qsi, qei);
	}

	private int query(Node node, int qsi, int qei) {
		// TODO Auto-generated method stub
		
//		completely inside the node
		if(node.startInterval >= qsi && node.endInterval <= qei) {
			return node.data;
		}
		else if(node.startInterval > qei || node.endInterval < qsi) {
			return 0; //completely outside the node interval
		}
		else {//overlapping case
			int leftAns = this.query(node.left, qsi, qei);
			int rightAns = this.query(node.right, qsi, qei);
			return leftAns + rightAns;
		}
	}
	
	public void update(int index,int newValue) {
		this.root.data=this.update(this.root,index,newValue);
		
	}

	private int update(Node node, int index, int newValue) {
		// TODO Auto-generated method stub
		if(index >= node.startInterval && index <= node.endInterval) {
			if(index == node.startInterval && index == node.endInterval) {
				node.data = newValue;
			}
			
			else {
				int leftAns = this.update(node.left, index, newValue);
				int rightAns = this.update(node.right, index, newValue);
				return leftAns + rightAns;
			}
		}
		return node.data;
	}
}
