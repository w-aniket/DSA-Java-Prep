import java.util.LinkedList;
import java.util.Queue;

public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    private static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    private static void inorder(BST.Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        } else if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int key){
        if(root.data == key){
            if(root.left == null && root.right == null){
                return null;
            } else if(root.left == null) {
                return root.right;
            } else if (root.right == null){
                return root.left;
            } else {
                Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                root.right =  delete(root.right, IS.data);
            }
        }
        else if(root.data > key){
            root.left = delete(root.left, key);
        } else {
            root.right = delete(root.right, key);
        }

        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }

        return root;
    }

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }else{
                    break;
                }
            } else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                } 
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] values = { 10, 5, 15, 3, 7, 12, 18, 11, 13, 16, 20, 17, 19, 21,22};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        
        // int key = 21;

        // root = delete(root, key);
        // System.out.println("Key " + key + " is deleted");

        // inorder(root);
        levelOrder(root);
        System.out.println("\nIs key present: " + search(root, 11));
    }

}
