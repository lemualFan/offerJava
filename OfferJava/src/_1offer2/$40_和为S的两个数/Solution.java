package _1offer2.$40_和为S的两个数;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if(array==null||array.length==0) return res;
        int left;
        int index;
        int min = Integer.MAX_VALUE;
        int temp ;
        for(int i =0;array[i]<=sum/2;i++){
             left = sum - array[i];
             index = binsearch(array,left);
             if(index!=i&&index!=-1){
                 temp = array[i]*array[index];
                 if(temp<min){
                     min = temp;
                     res.clear();
                     res.add(array[i]);
                     res.add(array[index]);
                 }
             }
        }
        Collections.sort(res);
        return res;
    }

    public int binsearch(int[] array,int num){
        int mid ;
        int low = 0;
        int high = array.length-1;
        while (low<=high){
            mid = low+(high-low)/2;
            if(array[mid]>num){
                high=mid-1;
            }else if(array[mid]<num){
                low=mid+1;
            }else {
                return mid;
            }
        }
        if(array[low] == num){
            return low;
        }else {
            return -1;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] list = {1,2,4,7,11,15};
        int sum = 15;
        ArrayList<Integer> res = solution.FindNumbersWithSum(list,sum);
        System.out.println(res);
    }
}
