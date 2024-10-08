package tree.findcow;

import java.util.LinkedList;
import java.util.Queue;

public class CowTree {
    CowNode root;

    public CowTree(int data) {
        root = null;
        root = insertImpl(root,data);
    }

    public void insert(int data){
        root = insertImpl(root, data);
    }

    private CowNode insertImpl(CowNode parents,int data){
        if(parents == null){
            parents = new CowNode();
            parents.data=data;
            parents.right=null;
            parents.left=null;
            parents.middle=null;
        }else{
            while(parents.data!=data){
                parents.left=insertImpl(parents.left, parents.data+1);
                parents.right=insertImpl(parents.right, parents.data+5);
                parents.middle = insertImpl(parents.middle, parents.data-1);

            }
        }
        return parents;
    }

    public Integer search(int data){
        return searchBFSImpl(root, data);
    }

    public Integer searchBFSImpl(CowNode parents, int data){
        if(parents!=null){
            Queue<CowNode> queue = new LinkedList<CowNode>();
            queue.add(parents);
            Integer count=0;
            while(!queue.isEmpty()){
                CowNode current = queue.poll();
                System.out.println(current.data);
                count++;
                if(current.data==data){
                    return count;
                }
                queue.add(current.left);
                queue.add(current.right);
                queue.add(current.middle);
            }
        }
        return null;
    }
}
