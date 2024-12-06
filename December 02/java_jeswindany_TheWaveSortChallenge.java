import java.util.Scanner;

public class java_jeswindany_TheWaveSortChallenge {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String numbers[] = sc.nextLine().split(" ");
            int nums[] = new int[numbers.length];
            
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(numbers[i]);
            }
            
            waveSort(nums);
            
            for (int num: nums) {
                System.out.print(num + " ");
            }
            
            System.out.println();
        }
    }

    public static void waveSort(int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i += 2) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
            if (i < n - 1 && arr[i + 1] > arr[i]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
