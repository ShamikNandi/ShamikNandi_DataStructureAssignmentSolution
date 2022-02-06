package question2;

public class ModifiedBST {

	static class Node {
		int key;
		Node Left,Right;

		 Node (int data) {
			key=data;
			Left= null;
			Right= null;
		}
	}

	static void InOrder(Node root) {
		if(root==null) 
			return;
		else {
			InOrder(root.Left);
			System.out.println(root.key+" ");
			InOrder(root.Right);
		}
	}

	static void rightSkewBST(Node root) {
		Node HeadNode=null;
		Node PrevNode=null;
		if(root==null) 
			return;
		else {
			rightSkewBST(root.Left);
			Node x=root.Left;
			Node y=root.Right;
			rightSkewBST(root.Right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		
		root=new Node(50);
		root.Left=new Node(30);
		root.Right=new Node(60);
		root.Left.Left=new Node(10);
		root.Right.Left=new Node(55);
		
		rightSkewBST(root);
		InOrder(root);

	}

}
