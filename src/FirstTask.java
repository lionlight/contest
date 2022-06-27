import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        int[] ints = new int[N];

        for (int i = 0; i < N; i++) {
            ints[i] = scanner.nextInt();
        }

        System.out.println(minimumNumberOfOperationsOnTank(ints));
    }

    private static int minimumNumberOfOperationsOnTank(int[] ints) {
        int answer = 0;
        if (ints.length == 1) {
            return answer;
        }

        final int LENGTH = ints.length - 1;
        int max = ints[LENGTH];
        int min = ints[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            max = max(ints[i], max);
            min = min(ints[i], min);
            if (ints[i + 1] < ints[i]) {
                answer = -1;
                break;
            }
        }
        if (answer == 0) {
            return max - min;
        } else return answer;
    }

}
