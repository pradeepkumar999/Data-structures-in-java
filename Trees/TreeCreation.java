import java.util.*;
public class TreeCreation {
    /*created a node class 
      The Node class should be declared as a static inner 
      class to be used in a static context like the main method.*/
    static public class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }

    /* declare the sc (Scanner) object as static 
    so that it can be used in the Creation method. */
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Node root=Creation();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();

    }
    static Node Creation(){
        
        System.out.println("Enter data:");
        
        int data=sc.nextInt();

        if(data==-1) return null;

        Node root=new Node (data);

        System.out.println("enter left for "+data);
        root.left=Creation();

        System.out.println("Enter right for"+data);
        root.right=Creation();

        return root;
    }

    static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
     static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
     static void preOrder(Node root){
        if(root==null) return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.data);
    }
}
