import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankingCashCounter {
    static int cash = 1000;
    static Queue<Character> q;
    public static void main(String[] args) {
        transaction();
        System.out.println("Remaining Cash: "+cash);
    }
    public static void transaction() {
        q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Add persons for withdrawal or deposit of cash.Enter W for withdraw,D for deposit");
            char ch = sc.next().charAt(0);
            switch(ch){
                case 'W':
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
                    break;
                case 'D':
                    System.out.println("Enter amount to deposit: ");
                    int amt2 = sc.nextInt();
                    cash += amt2;
                    System.out.println("Remaining Cash after deposit : "+cash);
                    break;
                default:
                    System.out.println("Invalid choice. Exit!!");
                    return;
            }
        }
    }

    public static void transaction(Queue<Character> q){
        while (!q.isEmpty()){
            if (q.peek().equals('W')){
                if (cash - 50 > 0){
                    cash -= 50;
                    System.out.println("Withdraw amount Cash : "+cash);
                }
                else {
                    System.out.println("No cash");
                    break;
                }
            }
            else {
                cash += 50;
                System.out.println("Deposit amount Cash : "+cash);
            }
            q.poll();
        }
    }
}
