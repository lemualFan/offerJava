package 算法.Sort;

public class QuickSort {
    static int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        int[] array = {2,32,34,1,5,7,4,7,32,23,123,213,56,78,9,8,768,576,345};
       // QSort(array,0,array.length-1);
        TestSort(array,0,array.length-1);
        for (Integer item:array) {
            System.out.print(item+" ");
        }

    }

    public static void TestSort(int[] array,int low,int high){
        if(low<high){
            int p  = TestPartition(array,low,high);
            TestSort(array,low,p-1);
            TestSort(array,p+1,high);
        }
    }

    public static int TestPartition(int[] array,int low,int high){
        int key = array[low];
        while(low<high){
            while (low<high&&key<=array[high]) high--;
            array[high] = array[low];
            while(low<high&&key>=array[low]) low++;
            array[low] = array[high];
        }
        array[low] = key;
        return low;
    }

    public static void BetterSort(int[] array,int low,int high){
        if(low<high){
            int pivotloc = partitionBetter(array,low,high);
            BetterSort(array,0,pivotloc-1);
            BetterSort(array,pivotloc+1,high);
        }else{
            return;
        }
    }


    public static int partitionBetter(int[] array,int low,int high){
        //三数取中，快速排序优化
        int mid = low+(high-low)/2;
        if(array[mid]>array[high]){
            swap(array,mid,high);
        }
        if(array[low]>array[high]){
            swap(array,low,high);
        }
        if(array[mid]>array[low]){
            swap(array,mid,low);
        }

        int key = array[low];

        while(low<high){
            while(low<high&&array[high]>=key) --high;
            array[low] = array[high];
            while (low<high&&array[low]<=key) ++low;
            array[high] = array[low];
        }

        array[low] = key;
        return low;
    }

    public static void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


    public  static int partition(int[] array,int low,int high){
        //固定切分方式
        int key = array[low];
        while(low<high){
            while (low<high&&key<=array[high]) --high;
            array[low] = array[high];
            while (low<high&&key>=array[low]) ++low;
            array[high] = array[low];
        }
        array[low] = key;
        return  low;
    }

    public static void QSort(int[] array,int low,int high){
        if(low<high){
            int pivotloc = partition(array,low,high);
            QSort(array,low,pivotloc-1);
            QSort(array,pivotloc+1,high);
        }
    }

}
