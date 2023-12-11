import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose a number between 0 and 100");
        int N = sc.nextInt();
        System.out.println("Intermediatery Numbers : ");
        binarySearchImply(N);
    }
    public static void binarySearchImply(int n) {
        int low = 0,high = 100;
        System.out.println("Got the ans:"+ recursiveBS(n,low,high));
    }

    /**
     *
     * @param n
     * @param low
     * @param high
     * @return
     */
    private static int recursiveBS(int n, int low, int high) {
        int mid = (low+high)/2;
        System.out.print(mid+" , ");
        if (n == mid){
            System.out.println();
            return mid;
        }
        else if (mid > n){
            return recursiveBS(n,low,mid-1);
        }
        else {
            return recursiveBS(n,mid+1,high);
        }
    }

}
