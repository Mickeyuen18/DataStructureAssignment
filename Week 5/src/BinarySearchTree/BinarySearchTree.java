package BinarySearchTree;

class BinaryNode {
    int data;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int d) {
        data = d;
        left = right = null;
    }
}

public class BinarySearchTree {
    private static BinaryNode root;
    public BinarySearchTree() {

        this.root = null;
    }
    public boolean isEmpty() {

        return root == null;
    }

    public BinaryNode search(BinaryNode t, int x){
        if (t == null)
            return null;
        if (x < t.data)
            return search(t.left,x );
        else if ( x > t.data)
            return search(t.right,x );
        else
            return t;
    }

   public void insert(int d){
        root = insertSubtree (root,d);
   }

   private BinaryNode insertSubtree(BinaryNode t, int d) {
        if (t ==null)
            t = new BinaryNode(d);
        else if (d < t.data)
            t.left = insertSubtree(t.left, d);
        else if (d > t.data)
            t.right = insertSubtree(t.right,d );
        return t;
   }

   public void display(BinaryNode root){
        if(root!=null){
            display(root.left);
            System.out.print(" " + root.data);
            display(root.right);
        }
   }

    public static void main(String[] args) {
	    BinarySearchTree tree = new BinarySearchTree();
	    tree.insert(2);tree.insert(7);
	    tree.insert(9);tree.insert(4);
	    tree.insert(1);tree.insert(5);
	    tree.insert(3);tree.insert(6);
	    tree.insert(0);tree.insert(8);
	    System.out.println("Original Tree: ");
	    tree.display(tree.root);
    }
}

