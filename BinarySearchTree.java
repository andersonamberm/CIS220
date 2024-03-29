//Amber Anderson
//Chpt 7 PA

class BinarySearchTree {
	private Node root;
   
	public BinarySearchTree() {
		root = null;
	}
   
	public Node getRoot() {
		return root;
	}
   
	public Node search(int desiredKey) {
		System.out.println("\nSearching for node " + desiredKey);
		Node currentNode = root;
		while (currentNode != null) {
			// Return the node if the key matches
			if (currentNode.key == desiredKey) {
				return currentNode;
			}
 			// Navigate to the left if the search key is 
			// less than the node's key.
			else if (desiredKey < currentNode.key) {
				System.out.print("\nDid not find node, navigating to node " + currentNode.key + "'s left child");   
				currentNode = currentNode.left;
			}
			// Navigate to the right if the search key is 
			// greater than the node's key.
			else {
				System.out.print("\nDid not find node, navigating to node " + currentNode.key + "'s right child");         
				currentNode = currentNode.right;
			}
		}
		// The key was not found in the tree.
		return null;
	}
   
	public void insert(Node node) {
		System.out.println("Inserting node " + node.key);
		// Check if tree is empty
		if (root == null) {
			root = node;
			System.out.println("Inserted node " + node.key + " as the root node.\n");
		} else {
			Node currentNode = root;
			while (currentNode != null) {
				if (node.key < currentNode.key) {
					// If no left child exists, add the new node
					// here; otherwise repeat from the left child.
					System.out.println("Checking node " + currentNode.key + " for left child.");
					if (currentNode.left == null) {
						System.out.println("Inserting node " + node.key + " as left child of node " + currentNode.key +".\n");
						currentNode.left = node;
						currentNode = null;
					} else {
						currentNode = currentNode.left;
						System.out.println("Traversed to left child node " + currentNode.key +".");
					}
				} else {
					// If no right child exists, add the new node
					// here; otherwise repeat from the right child.
					System.out.println("Checking node " + currentNode.key + " for right child.");
					if (currentNode.right == null) {
						System.out.println("Inserting node " + node.key + " as right child of node " + currentNode.key +".\n");  
						currentNode.right = node;
						currentNode = null;
					} else {
						currentNode = currentNode.right;
						System.out.println("Traversed to right child node " + currentNode.key +".");
					}
				}
			}
		}
	}
   
	public boolean remove(int key) {
		Node par = null;				//declare parent node
		Node currentNode = root;	//declare current node
		
		while (currentNode != null) {	//search for the node
			if (currentNode.key == key) {		//if node is found
				if ((currentNode.left == null) && (currentNode.right == null)) {	//remove the leaf
					if (par == null) {	//if node is root
						root = null;
					}
					else if (par.left == currentNode) {	
						par.left = null;
					}
					else {
						par.right = null;
					}
				}
				else if (currentNode.right == null) {		//remove node with only left child
					if (par == null) {
						root = currentNode.left;
					}
					else if (par.left == currentNode) {
						par.left = currentNode.left;
					}
					else {
						par.right = currentNode.left;
					}
				}
				else if (currentNode.left == null) {	//remove node with only right child
					if (par == null) {
						root = currentNode.right;
					}
					else if (par.left == currentNode) {
						par.left = currentNode.right;
					}
					else {
						par.right = currentNode.right;
					}
				}
				else {		//remove node with two children
					par = root;
					Node successor = root.right;	//declare successor node for removing node with two children
					while (successor.left != null) {	//find the successor
						par = successor;
						successor = successor.left;
					}
					if (par != root) {
						par.left = successor.right;
					}
					else {
						par.right = successor.right;
					}
					root.key = successor.key;	//copy successor data to root
				}
				return true;
			}
			else if (currentNode.key < key) {	//search to the right
				par = currentNode;
				currentNode = currentNode.right;
			}
			else {		//search to the left
				par = currentNode;
				currentNode = currentNode.left;
			}
		}
		return false; //return if node not found
	}
}
