package 算法.Sort;

public class InsertSort {
    public void InsertSort(int[] array){
        int len = array.length;
        if(len<=0){
            return;
        }
        int temp=0;
        int i,j;
        for(i = 1;i<len;i++){
            temp = array[i];
            for(j=i;j>0&&array[j-1]>temp;j--){
                array[j] = array[j-1];
            }
            array[j]= temp;
        }
    }

    /**
     * 折半插入排序
     * @param array
     */
    public void BInserSort(int[] array){
        int len = array.length;
        if(len<=0){
            return;
        }
        int temp = 0;
        int low = 0;
        int high = 0;
        int mid = 0;
        int i,j;
        for( i=1;i<len;i++){
            temp = array[i];
            low = 0;
            high = i-1;
            while (low<=high){
                mid = low+(high-low)/2;
                if(temp<array[mid]){
                    high = mid -1;
                }else {
                    low = mid+1;
                }
            }
            for( j=i-1;j>0;j--){
                array[j+1]= array[j];
            }
            array[low] = temp;
        }

    }

}
