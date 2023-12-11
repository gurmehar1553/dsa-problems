public class MergeSort {
    public static void main(String[] args) {
        String[] arr = {"zoo","apple","zip","banana","cherry"};
        mergeSort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(String[] arr,int low, int high) {
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        mergeArrays(arr,low,mid,high);
    }

    /**
     * Merge 2 sorted arrays
     * @param arr
     * @param low
     * @param mid
     * @param high
     */
    public static void mergeArrays(String[] arr, int low, int mid, int high) {
        String[] arr1 = new String[mid-low+1];
        String[] arr2 = new String[high-mid];
        for (int i=low;i<=mid;i++){
            arr1[i-low] = arr[i];
        }
        for (int i=mid+1;i<=high;i++){
            arr2[i-mid-1] = arr[i];
        }
        int s1=0,e1=mid-low,s2=0,e2=high-mid-1,i=low;
        while (s1<=e1 && s2<=e2){
            if(arr1[s1].compareTo(arr2[s2]) < 0){
                arr[i++] = arr1[s1++];
            } else  {
                arr[i++] = arr2[s2++];
            }
        }
        while (s1<=e1){
            arr[i++] = arr1[s1++];
        }
        while (s2<=e2){
            arr[i++] = arr2[s2++];
        }
    }

}
