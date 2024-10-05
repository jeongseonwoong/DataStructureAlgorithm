package tree.interfaces;

import tree.impls.BinaryNode;

public interface BinarySearchTree extends BFS,DFS {
    public BinaryNode search(int key);
}
