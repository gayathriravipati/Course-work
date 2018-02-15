public class BSTDriver
{
	public static void main(String[] args) {
		BST n = new BST();
		n.insert(100);
		n.insert(50);
		n.insert(75);
		n.insert(300);
		n.insert(250);
		n.insert(20);
		n.insert(70);
		n.insert(400);
		n.insert(150);
		n.insert(80);
		System.out.print("Inorder : ");
		n.inorder(n.root);
		System.out.println();
		System.out.print("Preorder : ");
		n.preorder(n.root);
		System.out.println();
		System.out.print("Postorder : ");
		n.postorder(n.root);
		n.search(20);
		n.search(25);
		n.search(250);
		n.minMax();
		n.delete(20);
		n.delete(75);
		n.delete(300);		
		n.delete(100);
		System.out.print("Deleting 20,75,300,100.. Inorder: ");
		n.inorder(n.root);
	}
}
