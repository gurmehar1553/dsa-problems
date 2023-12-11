import java.util.ArrayList;

public class PermutationOfString {
    public static void main(String[] args) {
        String s="abc";
        ArrayList<StringBuilder> arr1 = solvePermutationIterative(s);
        int index=0;
        ArrayList<StringBuilder> arr2 = new ArrayList<>();
        solvePermutationRecursive(s,index,index+1,s.length(),arr2);
        for (int i=0;i<arr1.size();i++){
            if (!(arr1.get(i).toString().contentEquals(arr2.get(i)))){
                System.out.println("False");;
            }
        }
        System.out.println("True");
    }
    /**
     * Iterative method to find
     * permutations of string
     */
    public static ArrayList<StringBuilder> solvePermutationIterative(String str){
        ArrayList<StringBuilder> arr = new ArrayList<>();
        int n = str.length();
        int i=0,j=i+1;
        while (i<n){
            if (j==n){
                i++;
                j=i+1;
            }
            else {
                arr.add(swap(i,j,str));
                j++;
            }
        }
        return arr;
    }
    /**
     * Recursive method to find
     * permutations of string
     */
    public static void solvePermutationRecursive(String str,int i,int j,int n,ArrayList<StringBuilder> arr){
        if (j==n){
            i=i+1;
            j=i+1;
        }
        if (i==n-1){
            return;
        }
        arr.add(swap(i,j,str));
        solvePermutationRecursive(str,i,j+1,n,arr);
    }
    /**
     * Swap 2 characters of string
     * using string builder
     */
    public static StringBuilder swap(int i, int j, String str) {
        StringBuilder ans = new StringBuilder();
        for (int k=0;k<str.length();k++){
            if(k==i){
                ans.append(str.charAt(j));
            }
            else if (k==j){
                ans.append(str.charAt(i));
            }
            else {
                ans.append(str.charAt(k));
            }
        }
        return ans;
    }
}
