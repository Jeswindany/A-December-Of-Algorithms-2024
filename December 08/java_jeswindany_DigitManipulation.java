import java.util.Scanner;

public class java_jeswindany_DigitManipulation {
    public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            long solution = digitManipulation(n);
            System.out.println(solution);
        }
    }

    private static long digitManipulation(int n) {
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += digitSquareSum(i);
        }

        return sum;
    }

    private static long digitSquareSum(int n) {
        long sum = 0;

        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n = n / 10;
        }

        return sum;
    }
}
