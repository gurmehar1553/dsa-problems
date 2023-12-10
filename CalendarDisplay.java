import java.util.Calendar;
import java.util.Scanner;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int month = sc.nextInt();
//        int year = sc.nextInt();
        printCalendar(7,2005);
    }
    private static void printCalendar(int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year,month,1);
//        int days = giveNumDays(month);
        int maxDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDay = cal.get(Calendar.DAY_OF_WEEK);
        String[][] arr = new String[6][7];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (i==0 && j<firstDay-1 || cal.get(Calendar.DAY_OF_MONTH) > maxDays){
                    arr[i][j]=" ";
                }
                else {
//                    System.out.println(cal.get(Calendar.DAY_OF_WEEK));
                    arr[i][j] = String.format("%s",cal.get(Calendar.DAY_OF_MONTH));
                    cal.add(Calendar.DAY_OF_MONTH,1);
                }
            }
        }
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
//    private static int giveNumDays(int month) {
//        switch (month){
//            case 1:
//                return 31;
//
//        }
//    }
}
