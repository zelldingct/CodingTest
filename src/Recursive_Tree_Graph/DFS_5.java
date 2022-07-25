package Recursive_Tree_Graph;

class Node{
    int data;
    Node2 lt, rt;
    public Node(int val){
        data=val;
        lt=rt=null;
    }
}

public class DFS_5 {
    Node2 root;
    public void DFS(Node2 root){
        if(root==null) return;
        else {
//            System.out.println(root.data + " ");
            DFS(root.lt);
//            System.out.println(root.data + " ");
            DFS(root.rt);
            System.out.println(root.data + " ");
        }
    }

    public static void main(String[] args) {
        DFS_5 tree = new DFS_5();
        tree.root= new Node2(1);
        tree.root.lt= new Node2(2);
        tree.root.rt= new Node2(3);
        tree.root.lt.lt= new Node2(4);
        tree.root.lt.rt= new Node2(5);
        tree.root.rt.lt= new Node2(6);
        tree.root.rt.rt= new Node2(7);
        tree.DFS(tree.root);
    }
}
