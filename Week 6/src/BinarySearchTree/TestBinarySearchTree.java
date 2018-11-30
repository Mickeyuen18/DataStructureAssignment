package BinarySearchTree;

public class TestBinarySearchTree {
    public static void main(String[]arg){
        int data = 0;
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(2);tree.insert(7);
        tree.insert(9);tree.insert(4);
        tree.insert(1);tree.insert(5);
        tree.insert(3);tree.insert(6);
        tree.insert(0);tree.insert(8);
        System.out.println();
        tree.delete(data); //delete the last inserted
        tree.display(tree.root);
    }
}
