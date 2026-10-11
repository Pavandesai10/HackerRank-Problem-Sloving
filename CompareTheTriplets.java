import java.util.*;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) {
                aliceScore++;
            } else if (a < b) {
                bobScore++;
            }
        }

        System.out.println(aliceScore + " " + bobScore);
        sc.close();
    }
}
