import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(checkPalindrome(str)){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }

    /**
     * Created deque
     * @param str
     * @return
     */
    private static boolean checkPalindrome(String str) {
        Deque<Character> dq = new LinkedList<>();
        for (int i=0;i<str.length();i++){
            dq.addLast(str.charAt(i));
        }
        while (dq.size()>1){
            if (!(dq.getFirst().equals(dq.getLast()))){
                return false;
            }
            dq.removeFirst();
            dq.removeLast();
        }
        return true;
    }
}
