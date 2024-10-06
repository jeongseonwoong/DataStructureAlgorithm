package tree;

import tree.impls.BinaryNode;
import tree.impls.BinarySearchTreeImpl;
import tree.interfaces.BinarySearchTree;

public class TreeMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTreeImpl();
        bst.insert(9);
        bst.insert(2);
        bst.insert(4);
        bst.insert(1);
        bst.insert(7);
        BinaryNode search1 = bst.search(4);
        System.out.println("bst.search(4)="+search1.data);
        BinaryNode search = bst.search(7);
        System.out.println("bst.search(7)="+search.data);
        bst.DFSInOrder();
        bst.delete(2);
        bst.delete(3);
        bst.DFSInOrder();
    }
}
