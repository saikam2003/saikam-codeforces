
import java.util.Scanner;


public class NextRound158A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String participantStr = sc.nextLine();
        String[] participants = participantStr.split(" ");
        // int i = 0;
        // int j = n-1;
        // int result = 0;
        // while (i < j) {
        //         if ((Integer.parseInt(participants[k - 1]) == 0) && n == 1 && k==1) {
        //             break;
        //         }

        //         int x = Integer.parseInt(participants[i]);
        //         int y = Integer.parseInt(participants[j]);
        //         int bar = Integer.parseInt(participants[k - 1]);

        //         if ((x >= bar && x > 0) && (y >= bar && y > 0)) {
        //             result += 2;
        //         } else if ((x >= bar && x > 0) || (y >= bar && y > 0)) {
        //             result++;
        //         }

        //         i++;
        //         j--;

        // }
        // if (n % 2 == 0 || n==1) {
        //     System.out.print(result);
        // } else {
        //     System.out.print(result+1);
        // }
        int result = 0;
        for (String s : participants) {
            if (Integer.parseInt(s) >= Integer.parseInt(participants[k - 1]) && (Integer.parseInt(s) > 0)) {
                result++;
            }
        }
        System.out.println(result);
        sc.close();
    }
}