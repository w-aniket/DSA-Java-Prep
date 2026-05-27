import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
        
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

    static class CreateTree {
        static int idx = -1;

        public static Node BTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BTree(nodes);
            newNode.right = BTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(Node root){
        if(root == null){
            // System.out.print("-1 ");
            return ;
        }
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null){
            return ;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return ;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root){
        if(root == null ) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                if(!q.isEmpty()){
                    System.out.println();
                    q.add(null);
                }else{
                    break;
                }
            } else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNOdes(Node root){
        if(root == null){
            return 0;
        }

        int leftNode = countOfNOdes(root.left);
        int rightNode = countOfNOdes(root.right);

        return leftNode + rightNode + 1;
    }

    public static int sumOfNodes(Node root){
        if(root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }


    public static int heightOfTree(Node root) {
        if(root == null){
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
        
    }

    // public static int diameter(Node root){
    //     if(root == null) {
    //         return 0;
    //     }

    //     int dm1 = diameter(root.left);
    //     int dm2 = diameter(root.right);
    //     int dm3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

    //     return Math.max(dm3, Math.max(dm1, dm2));
    // }

    static class TreeInfo {
        int height;
        int diam;

        TreeInfo(int h, int d) {
            this.diam = d;
            this.height = h;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int height = Math.max(left.height, right.height) + 1 ;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.height + right.height + 1;

        int diameter = Math.max(Math.max(diam2, diam3), diam1);

        return new TreeInfo(height, diameter);
    }


    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        CreateTree t = new CreateTree();
        Node root = t.BTree(nodes);
        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.print("\nInOrder: ");
        inOrder(root);
        System.out.print("\npostOrder: ");
        postOrder(root);
        System.out.println("\nLevelOrder: ");
        levelOrder(root);
        int totalNodes = countOfNOdes(root);
        System.out.println("\nTotal Nodes are: " + totalNodes);
        int sumOfNodes = sumOfNodes(root);
        System.out.println("Sum of all Nodes are: " + sumOfNodes);

        int heightOfTree = heightOfTree(root);
        System.out.println("Height of the tree are: " + heightOfTree);

        //   int diameter = diameter(root);
        // System.out.println("Diameter of tree: " + diameter);

        TreeInfo ti = diameter2(root);
        System.out.println("Diameter of the tree is: " + ti.diam); 
    }
}