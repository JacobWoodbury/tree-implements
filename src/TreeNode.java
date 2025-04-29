public class TreeNode<K> {
K value;
TreeNode<K> left;
TreeNode<K> right;


    public TreeNode(K value, TreeNode<K> left, TreeNode<K> right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode(K value){
        this(value, null, null);
    }
}