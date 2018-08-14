package _1offer1._22_IsPopOrder;

public class Main {
    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,3,2,1};
        int[] popB = {4,3,5,1,2};
        Solution solution = new Solution();
        System.out.println(solution.IsPopOrder(pushA,popA)+" "+solution.IsPopOrder(pushA,popB));
    }

}
