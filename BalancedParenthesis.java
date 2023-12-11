import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arithmetic expression ");
        String exp = scanner.next();
        if (checkBal(exp)){
            System.out.println("Arithmetic Expression is balanced");
        }
        else {
            System.out.println("Arithmetic Expression is not balanced");
        }
    }

    /**
     * Used Stack to check
     * balanced or not
     */
    public static boolean checkBal(String exp) {
        Stack<Character> st = new Stack<>();
        for (int i=0;i<exp.length();i++){
            if (exp.charAt(i)=='('){
                st.push(exp.charAt(i));
            }
            else if (exp.charAt(i)==')'){
                if (!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
                else {
                    st.push(')');
                }
            }
        }
        return st.isEmpty();
    }
}
