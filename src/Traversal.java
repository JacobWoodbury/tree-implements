public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<Integer>(10, null, null);
    TreeNode<Integer> node2 = new TreeNode<Integer>(15);

    root.left = new TreeNode<Integer>(15);
    root.left.left = new TreeNode<Integer>(39);
    root.left.right = new TreeNode<Integer>(21);

    root.right = new TreeNode<Integer>(20);
    root.right.left = new TreeNode<Integer>(72);
    root.right.left.right = new TreeNode<Integer>(42);

    preOrder(root);
    System.out.println();
    postOrder(root);
    System.out.println();
    inOrder(root);
  }

  public static void preOrder(TreeNode current) {
    if(current == null) return;
    System.out.println(current.value);
    preOrder(current.left);
    preOrder(current.right);
  }

  public static void postOrder(TreeNode current) {
    if(current == null) return;
    postOrder(current.left);
    postOrder(current.right);
    System.out.println(current.value);
  }

  public static void inOrder(TreeNode current) {
    if(current == null) return;
    inOrder(current.left);
    System.out.println(current.value);
    inOrder(current.right);
  }  
}
