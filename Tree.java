class Node
{
	public int iData; // data item (used as key value)
	public double dData; //other data
	public Node leftChild; // this node’s left child
	public Node rightChild; //this node’s right child
	
	public void displayNode( ){
		System.out.print(“{“);
		System.out.print(iData);
		System.out.print(”, “);
		System.out.print(dData);
		System.out.print( “ } ”);
	}
}
//Tree class find method
public Node find(int key){
	Node current = root;
	while(current.iData != key){
		if(key <current.iData)
			current = current.leftChild;
		else
			current = current.rightChild;
			if(current == null)
				return null;
	}
	return current;
}
//Trees insert method
public void insert(int id , double dd){
	Node newNode = new Node();
	newNode.iData = id;
	newNode.dData = dd;
	
	if(root == null)
		root = newNode;
	else{
		Node current = root; //start at root
		Node parent = root;
		while(true){
			parent = current;
			if(id<current.iData){
				current = current.leftChild;
				if(current == null){
					parent.leftChild = newNode;
					return;
				}
			}
			else{
				current = current.rightChild;
				if(current == null){
					parent.rightChild = newNode;
					return;
				}
			}
		}
	}
}			 
//find minimum
public Node minimum(){
	Node current=root;
	while(current.leftChild != null){
		current = current.leftChild;
	}
	return current;
}
//find descOrder
public descOrder(Node localRoot){
	
	if(localRoot != null){
	
		descOrder(localRoot.rightChild);
		localRoot.displayNode();
		descOrder(localRoot.leftChild);
	}
}				 			 
//tree class INORDER traversing method
private void inOrder(Node localroot){
	if(localroot != null){
		inOrder(localroot.leftChild);
		localroot.displayNode();
		inOrder(localroot.rightChild);
	}
}
//tree class PREORDER traversing method
private void preOrder(Node localroot){
	if(localroot != null){
		localroot.displayNode();
		preOrder(localroot.leftChild);
		preOrder(localroot.rightChild);
	}
}
//tree class POSTORDER traversing method
private void postOrder(Node localroot){
	if(localroot != null){
		localroot.displayNode();
		preOrder(localroot.leftChild);
		preOrder(localroot.rightChild);
	}
}
				 

