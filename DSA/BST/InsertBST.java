package BST;

class InsertBST{
    static class Node{
        int val;
        Node left,right;

        Node(int val){
            this.val=val;
        }
    }

    static Node insert(Node node,int id){
        if(node==null)return new Node(id);

        if(id<node.val)
            node.left=insert(node.left,id);
        else if(id>node.val)
            node.right=insert(node.right,id);

        return node;
    }
}
