public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10,23,12,34,1,20};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n-i-1;j++){
                if(arr[i]>arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }

}
