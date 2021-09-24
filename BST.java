package BST;

public class BST {

	public Node insert(Node root, int value) {
		if(root ==null) {
			System.out.print("root value "+value);
			return createNewNode(value);
		}
		if(value < root.data) {
			root.left = insert(root.left, value);
			System.out.print("Left value "+value);
		}else if(value > root.data){
			root.right = insert(root.right,value);
			System.out.print("right value "+value);
		}
		return root;
	}

	private Node createNewNode(int value) {
		Node node = new Node();
		node.data = value;
		node.left = null;
		node.right = null;
		return node;
	}

}
