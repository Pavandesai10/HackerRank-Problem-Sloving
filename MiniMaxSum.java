import java.io.*;
import java.util.*;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long sum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            long num = sc.nextLong();
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println((sum - max) + " " + (sum - min));

        sc.close();
    }
}
