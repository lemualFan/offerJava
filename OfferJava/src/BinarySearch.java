
public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2,2,2,2,2,2,1,2};
        Solution solution = new Solution();
        System.out.println(solution.minNumberInRotateArray(list));
    }
}



 class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }

        int index1 = 0;
        int index2 = array.length -1;
        int indexMid = index1;
        while(array[index1]>=array[index2]){
            if(index2 - index1 == 1){
                indexMid = index2;
                break;
            }
            indexMid = (index1+index2)/2;

            if(array[index1]==array[indexMid]&&array[index1]==array[index2]){
                indexMid = Min(array,index1,index2);
                break;
            }else if(array[index1]<array[indexMid]){
                index1 = indexMid;
            }else if(array[index2]>array[indexMid]){
                index2 = indexMid;
            }
        }
        return array[indexMid];
    }

    public  int Min(int[] num,int index1 ,int index2){
        int result = num[index1];
        int index = index1;
        for(int i = index1+1;i<=index2;i++){
            if(result>num[i]){
                index = i;
            }
        }
        return index;
    }
}