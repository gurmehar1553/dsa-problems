import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankingCashCounter {
    static int cash = 1000;
    static Queue<Character> q;
    public static void main(String[] args) {
        takeInput();
        transaction();
        System.out.println("Remaining Cash: "+cash);
    }

    /**
     * Take user's input
     * of persons who withdraw or deposit cash
     * store them in queue
     */
    public static void takeInput() {
        q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Add persons.Enter W for withdraw,D for deposit,any other character to exit");
            char ch = sc.next().charAt(0);
            switch(ch){
                case 'W':
                    q.add('W');
                    break;
                case 'D':
                    q.add('D');
                    break;
                default:
                    System.out.println("Invalid choice. Exit!!");
                    return;
            }
        }
    }

    /**
     * Perform transactions
     * on user's choice
     */
    public static void transaction(){
        Scanner sc = new Scanner(System.in);
        while (!q.isEmpty()){
            if (q.peek().equals('W')){
                System.out.println("Enter amount to withdraw: ");
                int amt = sc.nextInt();
                if (cash - amt > 0){
                    cash -= amt;
                    System.out.println("Remaining Cash after withdraw : "+cash);
                }
                else {
                    System.out.println("No cash");
                    break;
                }
            }
            else {
                System.out.println("Enter amount to deposit: ");
                int amt2 = sc.nextInt();
                cash += amt2;
                System.out.println("Remaining Cash after deposit : "+cash);
            }
            q.poll();
        }
    }
}
