package tree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        offerStructs.TreeNode<Integer> t = new offerStructs.TreeNode<>(1);
//        t.addLeft(2);
//        t.addRight(3);
//        t.leftChild.addLeft(4);
//        t.leftChild.addRight(5);
//        System.out.println("中序遍历测试:");
//        TreeTools.midOrderTravel(t);
//        System.out.println();
//        TreeTools.midOrderTravelNoRecursion(t);
//        System.out.println("\n前序遍历测试:");
//        TreeTools.preOrderTravel(t);
//        System.out.println();
//        TreeTools.midOrderTravelNoRecursion(t);
//        System.out.println("\n后序遍历测试:");
//        TreeTools.backOrderTravel(t);
//        System.out.println();
//        TreeTools.BackOrderTravelNoRecursion(t);
        char[] list = {'8','8','7','9','2','#','#','#','#','4','5'};
        TreeNode<Character> root = TreeTools.CreateBinTreeByArray(list);

    }
}
