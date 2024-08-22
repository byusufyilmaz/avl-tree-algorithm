package avlagaci9;

public class Main {

	public static void main(String[] args) {
		Avlagaci avl=new Avlagaci();
		avl.root=avl.insert(avl.root, 10);
		avl.root=avl.insert(avl.root, 100);
		avl.root=avl.insert(avl.root, 37);
		
		avl.aragezinti(avl.root);

	}

}
