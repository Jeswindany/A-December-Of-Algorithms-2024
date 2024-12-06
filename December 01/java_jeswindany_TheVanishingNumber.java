import java.util.Scanner;

public class java_jeswindany_TheVanishingNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            int arr[] = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = sc.nextInt();
            }
            
            int solution = findMissingNumber(arr, n);
            System.out.println(solution);
        }
    }

    public static int findMissingNumber(int[] arr, int n) {
        int sum = 0;
        for (int num: arr) {
            sum += num;
        }

        return (n*(n + 1)) / 2 - sum;
    }
}