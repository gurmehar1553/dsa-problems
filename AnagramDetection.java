import java.util.Scanner;

public class AnagramDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 strings: ");
        String s1 = scanner.next();
        String s2 = scanner.next();
        boolean ans = checkAnagram(s1,s2);
        if (ans){
            System.out.println("Two strings are anagram");
        }
        else {
            System.out.println("Two strings are not anagram");
        }
    }

    /**
     *
     * Created frequency array to
     * maintain count of characters
     *
     */
    public static boolean checkAnagram(String s1, String s2) {
        int[] freq = new int[26];
        for (int i=0;i<s1.length();i++){
            freq[(s1.charAt(i)-'a')]++;
        }
        for (int i=0;i<s2.length();i++){
            freq[(s2.charAt(i)-'a')]--;
        }
        for (int i =0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
