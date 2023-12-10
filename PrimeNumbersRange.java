import java.util.ArrayList;

public class PrimeNumbersRange {
    public static void main(String[] args) {
        int start =0,end=1000;
        System.out.println("Prime numbers in range between 0 and 1000 : ");
        ArrayList<Integer> arrPrime = findPrime(start,end);
        for (Integer i : arrPrime){
            System.out.print(i+" ");
        }
        System.out.println();
        findAnagram(arrPrime);
        System.out.println();
        findPalindrome(arrPrime);
    }

    public static void findPalindrome(ArrayList<Integer> arrPrime) {
        System.out.println("Prime numbers which are Palindrome : ");
        for (int i =0;i<arrPrime.size();i++){
            if (checkPalindrome(arrPrime.get(i))){
                System.out.print(arrPrime.get(i)+" ");
            }
        }
    }

    private static boolean checkPalindrome(int n) {
        int rev=0,a=n;
        while (n!=0){
            int r=n%10;
            rev = rev*10 + r;
            n=n/10;
        }
        return a==rev;
    }

    public static void findAnagram(ArrayList<Integer> arrPrime) {
        System.out.println("Anagram Pairs of prime : ");
        for (int i =0;i<arrPrime.size();i++){
            for (int j=i+1;j<arrPrime.size();j++){
                if (checkAnagram(arrPrime.get(i),arrPrime.get(j))){
                    System.out.println(arrPrime.get(i)+" , "+arrPrime.get(j));
                }
            }
        }
    }

    private static boolean checkAnagram(int n1,int n2) {
        int[] freq = new int[10];
        while (n1!=0){
            int r=n1%10;
            freq[r]++;
            n1=n1/10;
        }
        while (n2!=0){
            int r=n2%10;
            freq[r]--;
            n2=n2/10;
        }
        for (int i = 0;i<10;i++){
            if (freq[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> findPrime(int start, int end) {
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i=start;i<=end;i++){
            if (i==0 || i==1){
                continue;
            }
            if(checkPrime(i)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static boolean checkPrime(int n) {
        for (int i=2;i<n;i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
