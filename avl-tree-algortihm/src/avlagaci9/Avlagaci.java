package avlagaci9;
public class Avlagaci {
	Node root;

	public Avlagaci() {
		root=null;
	}
	
	Node insert(Node root , int data ) {
		if (root==null) {
			return new Node(data);
			
		}else if (root.data >data ) {
			root.left=insert(root.left, data);
		}else if (root.data < data ) {
			root.right=insert(root.right, data);
		}else {
			return root;
		}
		
	root.boy=1+max(boy(root.left),boy(root.right));
	int denge=denge(root);

	if (denge==2 && root.left.data >data ) {
		return sagrotasyon(root);
	}if (denge==-2 &&root.right.data<data ) {
		return solrotasyon(root);
	}if (denge==2 && root.left.data <data ) {
		System.out.println("sol sag rotasyonu");
		root.left=solrotasyon(root.left);
		return sagrotasyon(root);
	}if (denge==-2 && root.right.data >data) {
		System.out.println("sag sol rotasyonu");
		root.right=sagrotasyon(root.right);
		return solrotasyon(root);
	}else {
		return root;
	}
	}
	
	
	
	
	
	int denge(Node root) {
		return boy(root.left)-boy(root.right);
	}
	int boy(Node root) {
		if (root==null) {
			return 0;
		}else {
			return root.boy;
		}
	}
	
	void aragezinti(Node root) {
		if(root!=null) {
			aragezinti(root.left);
			System.out.print(root.data + ">");
			aragezinti(root.right);
		}
	}
	int max(int a,int b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	Node solrotasyon(Node root) {
		Node y=root.right;
		Node t2=y.left;
		System.out.println("sol rotasyon");
		y.left=root;
		root.right=t2;
		
		root.boy=max(boy(root.left), boy(root.right)+1);
		y.boy=max(boy(y.left), boy(y.right)+1);
		return y;
	}
	Node sagrotasyon(Node root) {
		Node y=root.left;
		Node t2=y.right;
		System.out.println("sag rotasyon");
		y.right=root;
		root.left=t2;
		
		root.boy=max(boy(root.left),boy(root.right) +1);
		y.boy=max(boy(y.left), boy(y.right)+1);
		return y;
	}
}
