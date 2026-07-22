package BST;

class SearchBST{
    static class Node{
        int val;
        Node left,right;

        Node(int val){
            this.val=val;
        }
    }

    static boolean search(Node root,int target){
        Node current=root;

        while(current!=null){
            if(target==current.val)return true;
            current=target<current.val?current.left:current.right;
        }

        return false;
    }
}
