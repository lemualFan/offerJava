package tree;

/**
 * offerStructs.TreeNode 普通树节点
 */

public class TreeNode<T> {
    T value;
    TreeNode<T> leftChild;
    TreeNode<T> rightChild;

    TreeNode(T value){
        this.value = value;
    }

    TreeNode(){
    }

    /**
     * 增加左节点
     * addLeft;
     * @param value;
     * void
     */
    public void addLeft(T value){
        TreeNode<T> leftChild = new TreeNode<>(value);
        this.leftChild = leftChild;
    }

    /**
     * 增加右节点
     * addRight;
     * @param value;
     * void
     */
    public void addRight(T value){
        TreeNode<T> rightChild = new TreeNode<>(value);
        this.rightChild = rightChild;
    }

    /**
     * 重载hashCode
     * @return int
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        return this.value.hashCode();
    }

    /**
     * @see java.lang.Object#equals(Object)
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof TreeNode)){
            return false;
        }
        return this.value.equals((TreeNode<?>)((TreeNode) obj).value);
    }
}
