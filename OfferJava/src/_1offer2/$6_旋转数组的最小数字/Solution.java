package _1offer2.$6_旋转数组的最小数字;

public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array.length==0) return 0;
        int low = 0;
        int high = array.length-1;
        while (low<high){
            int mid = low +(high-low)/2;
            if(array[mid]>array[high]){
                low = mid+1;
            }else if (array[mid]==array[high]){
                high = high-1;
            }else {
                high = mid;
            }
        }
        return  0;
    }
}
