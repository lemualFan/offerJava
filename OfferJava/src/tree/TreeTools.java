package tree;


import java.util.*;

/**
 * 树的基本操作类
 */
public class TreeTools {
    /**
     * 树中节点的个数
     * @param root
     * @param <T>
     * @return int
     */
    public static <T> int getTreeNum(TreeNode<T> root){
        if (root==null){
            return 0;
        }
        return getTreeNum(root.leftChild)+getTreeNum(root.rightChild)+1;
    }


    /**
     * 数的深度
     * @param root
     * @param <T>
     * @return int
     */
    public static <T> int getTreeDepth(TreeNode<T> root){
        if (root == null){
            return 0;
        }
        int leftDepth = getTreeDepth(root.leftChild)+1;
        int rightDepth = getTreeDepth(root.rightChild)+1;
        return Math.max(leftDepth,rightDepth);
    }

    /**
     * 先序遍历
     * @param root
     * @param <T>
     */
    public static <T> void preOrderTravel(TreeNode<T> root){
        if(root==null){
            return ;
        }
        visitNode(root);
        preOrderTravel(root.leftChild);
        preOrderTravel(root.rightChild);
    }

    /**
     * 中序遍历
     * @param root
     * @param <T>
     */

    public static <T> void midOrderTravel(TreeNode<T> root) {
        if (root == null) {
            return;
        }

        midOrderTravel(root.leftChild);
        visitNode(root);
        midOrderTravel(root.rightChild);
    }


    /**
     * 后续遍历
     * @param root
     * @param <T>
     */

    public static <T> void backOrderTravel(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        backOrderTravel(root.leftChild);
        backOrderTravel(root.rightChild);
        visitNode(root);

    }

    /**
     * visitNode 访问Node节点
     * @param node
     * @param <T>
     */
    public static <T>  void visitNode(TreeNode<T> node){
        System.out.print(node.value+"\t");
    }

    /**
     * 分层遍历数，层次遍历
     * @param root
     * @param <T>
     */

    public static <T> void levelTravel(TreeNode<T> root){
        Queue<TreeNode<T>> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode<T> temp = q.poll();
            visitNode(temp);
            if(temp.leftChild!=null){
                q.offer(temp.leftChild);
            }
            if(temp.rightChild!=null){
                q.offer(temp.rightChild);
            }
        }
    }

    /**
     * 获得k层的节点数
     * @param root 数的根节点
     * @param k 树的第多少层
     * @param <T>
     * @return k层的节点数
     */

    public static <T> int getNumForKLevel(TreeNode<T> root,int k ){
        if(root==null||k<1){
            return 0;
        }
        if(k==1){
            return 1;
        }
        int leftNum = getNumForKLevel(root.leftChild,k-1);
        int rightNum = getNumForKLevel(root.rightChild,k-1);
        return  leftNum+rightNum;
    }

    /**
     * 求二叉树中叶子节点的数目
     * @param root
     * @param <T>
     * @return
     */

    public static <T> int getLeafNum(TreeNode<T> root){
        if(root==null){
            return 0;
        }
        if(root.rightChild==null&&root.leftChild==null){
            return 1;
        }
        int leftNum = getLeafNum(root.leftChild);
        int rightNum = getLeafNum(root.rightChild);
        return  leftNum+rightNum;
    }

    /**
     * 交换根节点的左右子树
     * @param root
     * @param <T>
     * @return
     */

    public static <T> TreeNode<T> exchange(TreeNode<T> root){
        if(root == null)
            return null;
        TreeNode<T> left = exchange( root.leftChild);
        TreeNode<T> right = exchange(root.rightChild);
        root.leftChild = right;
        root.rightChild = left;
        return root;
    }

    /**
     * 查看node是否是root的子节点
     * @param root
     * @param node
     * @param <T>
     * @return
     */
    public static <T> boolean nodeIsChild(TreeNode<T> root,TreeNode<T> node){
        if(root==null||node==null){
            return false;
        }
        if(root==node){
            return true;
        }
        boolean isFind = nodeIsChild(root.leftChild,node);
        if(!isFind){
            isFind = nodeIsChild(root.rightChild,node);
        }
        return isFind;
    }

    /**
     * findAllFatherNode: 返回两个节点lnode和rnode的以root为根节点的公共父节点
     * @param root
     * @param lNode
     * @param rNode
     * @param <T>
     * @return
     */

    public static <T> TreeNode<T> findAllFatherNode(TreeNode<T> root,TreeNode<T> lNode,TreeNode<T> rNode){
        if(lNode == root||rNode==root){
            return root;
        }
        if(root == null||lNode==null||rNode==null){
            return null;
        }
        if(nodeIsChild(root.leftChild,lNode)){
            if(nodeIsChild(root.rightChild,rNode)){
                return root;
            }else{
               return findAllFatherNode(root.leftChild,lNode,rNode);
            }
        }else{
            if(nodeIsChild(root.rightChild,rNode)){
                return root;
            }else {
                return findAllFatherNode(root.rightChild,lNode,rNode);
            }

        }
    }

    /**
     * 根据树的先序与中序序列重建树
     * @param pre 先序遍历序列
     * @param mid 中序遍历序列
     * @param <T>
     * @return
     */

    public static <T> TreeNode<T> getTreeFromPreAndMid(List<T> pre,List<T> mid){
        if(pre==null||mid==null||pre.size()==0||mid.size()==0){
            return null;
        }
        if(pre.size()==1){
            return  new TreeNode<T>(pre.get(0));
        }
        TreeNode<T> root = new TreeNode<>(pre.get(0));
        //找出根节点在中序中的位置
        int index = 0;
        while(!root.value.equals(mid.get(index))) index++;
        //构建左子树的前序与中序
        List<T> preLeft = new ArrayList<>();
        List<T> midLeft = new ArrayList<>();
        for(int i=1;i<=index;i++){
            preLeft.add(pre.get(i));
        }
        for(int i=0;i<index;i++){
            midLeft.add(mid.get(i));
        }

        //重建左子树
        root.leftChild = getTreeFromPreAndMid(preLeft,midLeft);

        //右子树的前序与中序
        List<T> preRight = new ArrayList<>();
        List<T> midRight = new ArrayList<>();
        for(int i =index+1;i<pre.size();i++){
            preRight.add(pre.get(i));
        }

        for(int i = index+1;i<mid.size();i++){
            midRight.add(mid.get(i));
        }

        root.rightChild = getTreeFromPreAndMid(preRight,midRight);
        return  root;
    }

    /**
     * 比较两个树是否完全相等
     * @param node1
     * @param node2
     * @param <T>
     * @return
     */

    public static <T> boolean equals(TreeNode<T> node1,TreeNode<T> node2){
        if (node1==null&&node2==null){
            return true;
        }else if (node1==null||node2==null){
            return false;
        }

        boolean isEqual = node1.value.equals(node2.value);
        boolean isLeftEqual = equals(node1.leftChild,node2.leftChild);
        boolean isRightEqual = equals(node1.rightChild,node2.rightChild);
        return isEqual&&isLeftEqual&&isRightEqual;
    }

    /**
     * 非递归的先序遍历
     * @param root
     * @param <T>
     */

    public static <T> void preOrderTravelNoRecursion(TreeNode<T> root){
        if (root==null)
            return;
        Stack<TreeNode<T>> stack = new Stack<>();
        TreeNode<T> p = root;
        while (!stack.empty()||p!=null){
            while (p!=null){
                visitNode(p);
                stack.push(p);
                p = p.leftChild;
            }
            if(!stack.empty()){
                p = stack.pop();
                p = p.rightChild;
            }
        }
    }

    /**
     * 非递归中序遍历
     * @param root
     * @param <T>
     */

    public static <T> void midOrderTravelNoRecursion(TreeNode<T> root){
        if (root==null){
            return;
        }
        Stack<TreeNode<T>> stack = new Stack<>();
        TreeNode<T> p =root;
        while (!stack.empty()||p!=null){
            while (p!=null){
                stack.push(p);
                p = p.leftChild;
            }
            if(!stack.empty()){
                p = stack.pop();
                visitNode(p);
                p = p.rightChild;
            }
        }
    }


    /**
     * 非递归后续遍历
     * @param root
     * @param <T>
     */

    public static <T> void BackOrderTravelNoRecursion(TreeNode<T> root){
        if (root==null){
            return;
        }
        Stack<TreeNode<T>> stack = new Stack<>();
        TreeNode<T> pre  =null;
        TreeNode<T> current;
        stack.push(root);
        while(!stack.empty()){
            current = stack.peek();
            if((current.leftChild==null && current.rightChild==null)//当前节点是叶子节点，可以直接访问
            ||(pre!=null&&(pre==current.leftChild||pre==current.rightChild)//当前一个节点不为空并且是当前节点的左孩子或者右孩子，当是左孩子代表右孩子为空，当是又孩子表示左右都不为空，且已经访问过
            )){
                visitNode(current);
                stack.pop();
                pre = current;
            }else{
                if(current.rightChild!=null){
                    ////先压栈右节点再压栈左节点 这样出栈时是先左后右
                    stack.push(current.rightChild);
                }
                if(current.leftChild!=null){
                    stack.push(current.leftChild);
                }
            }
        }
    }

    public static  TreeNode<Character> CreateBinTreeByArray(char[] array){
        int currLevel = 1;
        int currLevelBegin = 0,parentLevelBegin = 0;
        TreeNode<Character>[] nodeArray = new TreeNode[array.length];
        while (currLevelBegin<array.length){
            int levelNumber = (int) Math.pow(2,currLevel-1);
            int parentStep = 0;
            for(int step=0;step<levelNumber;step++){
                int index = currLevelBegin+step;
                if(index>=array.length) break;
                TreeNode<Character> node = null;
                if(array[index]!='#'){
                    node = new TreeNode<>(array[index]);
                    nodeArray[index] = node;
                }
                if(currLevelBegin>0){
                    TreeNode parentNode = nodeArray[parentLevelBegin+parentStep];
                    if(step%2==0){
                        parentNode.leftChild = node;
                    }else{
                        parentNode.rightChild = node;
                        parentStep++;
                    }

                }
            }
            parentLevelBegin = currLevelBegin;
            currLevelBegin+=levelNumber;
            currLevel++;
        }

        return nodeArray[0];
    }



}
