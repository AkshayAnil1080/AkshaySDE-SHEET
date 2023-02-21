package trees;


class Node{
	int data; 
	Node left; 
	Node right;
	Node (int data)
	{
		this.data = data;
	}
}
public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.right = new Node(40);
		
		ino(root);
	}
	
	static void ino(Node root)
	{
		if(root!=null)
		{
			ino(root.left);
			System.out.println(root.data);
			ino(root.right);
		}
	}

}
