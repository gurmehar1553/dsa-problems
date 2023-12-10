import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String exp = "(5+6)∗(7+8)/(4+3)(5+6)∗((7+8)/(4+3))";
        if (checkBal(exp)){
            System.out.println("Arithmetic Expression is balanced");
        }
        else {
            System.out.println("Arithmetic Expression is not balanced");
        }
    }

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
