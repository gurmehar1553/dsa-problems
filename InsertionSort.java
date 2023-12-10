
public class InsertionSort {
    public static void main(String[] args) {
        String[] arr = {"zoo","apple","zip","banana","cherry"};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionSort(String[] arr){
        for(int i=0;i<arr.length;i++){
            String ele = arr[i];
            int j=i-1;
            while (j>=0 && arr[j].compareTo(ele) > 0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = ele;
        }
    }
}
