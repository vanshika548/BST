package BST;

public class BinarySearchTree {
		public static void main(String[]args) {
			BST bst = new BST();
			Node root = null;
			
			//56 30 70 22 40 60 95 11 3 16 65 63 67
			root=bst.insert(root, 56);
			root=bst.insert(root, 30);
			root=bst.insert(root, 70);
			root=bst.insert(root, 22);
			root=bst.insert(root, 40);
			root=bst.insert(root, 60);
			root=bst.insert(root, 95);
			root=bst.insert(root, 11);
			root=bst.insert(root, 3);
			root=bst.insert(root, 16);
			root=bst.insert(root, 65);
			root=bst.insert(root, 63);
			root=bst.insert(root, 67);
			
		}
}
