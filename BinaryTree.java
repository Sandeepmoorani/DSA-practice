public class BinaryTree {
    int data;
    BinaryTree left,right;

    BinaryTree(int d){
        data =d;
    }

    public static void preorder(BinaryTree r){
        if(r==null){
            return;

        }
        System.out.print(r.data+" ");
		
		preorder(r.left);
		preorder(r.right);

    }

    public static void postorder(BinaryTree r){
        if(r==null){
            return;

        }
		
		preorder(r.left);
		preorder(r.right);
        System.out.print(r.data+" ");

    }
    public static void inorder(BinaryTree r){
        if(r==null){
            return;

        }
		
		preorder(r.left);
        System.out.print(r.data+" ");
		preorder(r.right);
    }
    public static void main(String[] args) {
        BinaryTree root=new BinaryTree(1);
		
		root.left=new BinaryTree(2);
		root.right=new BinaryTree(3);
		
		root.left.left=new BinaryTree(4);
		root.left.right=new BinaryTree(5);
		
		root.right.left=new BinaryTree(6);
		root.right.right=new BinaryTree(7);
		preorder(root);
		System.out.println();
		
		inorder(root);
		System.out.println();
		
		postorder(root);
		System.out.println();
    }


    
}
