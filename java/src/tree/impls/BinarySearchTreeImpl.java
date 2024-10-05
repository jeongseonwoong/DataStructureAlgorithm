package tree.impls;

import tree.interfaces.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeImpl implements BinarySearchTree {

    BinaryNode root;

    public BinarySearchTreeImpl() {
        root = null;
    }

    @Override
    public void insert(int value) {
        root = insertImpl(root, value);
    }

    private BinaryNode insertImpl(BinaryNode parents, int value){
        if(parents == null){
            return new BinaryNode(value);
        }else{
            if(parents.data > value){
                parents.left = insertImpl(parents.left, value);
            }else if(parents.data < value){
                parents.right = insertImpl(parents.right,value);
            }
        }
        return parents;
    }

    @Override
    public BinaryNode search(int key) {
        return searchImpl(root, key);
    }

    private BinaryNode searchImpl(BinaryNode parents, int key) {
        BinaryNode result;
        if(parents == null){
            return null;
        }

        if(parents.data == key){
            return parents;
        }
        else if(parents.data<key){
            result = searchImpl(parents.right, key);
        }else{
            result = searchImpl(parents.left, key);
        }
        return result;
    }

    @Override
    public void BreadthFirstTraversal() {
        BFSImpl(root);
    }

    private void BFSImpl(BinaryNode parents) {
        if(parents == null){
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(parents);
        while(!queue.isEmpty()){
            BinaryNode current = queue.poll();
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
            System.out.println(current.data);
        }

    }

    @Override
    public void DFSPreOrder() {
        DFSPreOrderImpl(root);
    }

    public void DFSPreOrderImpl(BinaryNode parents){
        if(parents != null){
            System.out.println(parents.data);
            DFSPreOrderImpl(parents.left);
            DFSPreOrderImpl(parents.right);
        }
    }

    @Override
    public void DFSPostOrder() {
        DFSPostOrderImpl(root);
    }

    public void DFSPostOrderImpl(BinaryNode parents){
        if(parents != null){
            DFSPostOrderImpl(parents.left);
            DFSPostOrderImpl(parents.right);
            System.out.println(parents.data);
        }
    }

    @Override
    public void DFSInOrder() {
        DFSInOrderImpl(root);
    }

    public void DFSInOrderImpl(BinaryNode parents){
        if(parents != null){
            DFSInOrderImpl(parents.left);
            System.out.println(parents.data);
            DFSInOrderImpl(parents.right);
        }
    }

    @Override
    public void delete(int value) {
        deleteImpl(root,value);
    }

    private void deleteImpl(BinaryNode parents, int key) {

    }

}
