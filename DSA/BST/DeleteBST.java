package BST;

class DeleteBST{
    static class Node{
        int val;
        Node left,right;

        Node(int val){
            this.val=val;
        }
    }

    static Node delete(Node node,int sku){
        if(node==null)return null;

        if(sku<node.val){
            node.left=delete(node.left,sku);
        }else if(sku>node.val){
            node.right=delete(node.right,sku);
        }else{
            if(node.left==null)return node.right;
            if(node.right==null)return node.left;

            Node successor=node.right;

            while(successor.left!=null)
                successor=successor.left;

            node.val=successor.val;
            node.right=delete(node.right,successor.val);
        }

        return node;
    }
}
