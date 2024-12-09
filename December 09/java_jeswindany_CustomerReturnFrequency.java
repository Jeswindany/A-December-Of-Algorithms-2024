import java.util.Scanner;

public class java_jeswindany_CustomerReturnFrequency {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String rawInput[] = sc.nextLine().split(" ");

            int frequencies[] = new int[rawInput.length];
            for (int i = 0; i < frequencies.length; i++) {
                frequencies[i] = Integer.parseInt(rawInput[i]);
            }

            int solution = countOneReturns(frequencies);
            System.out.println(solution);
        }
    }

    private static int countOneReturns(int[] frequencies) {
        int count = 0;
        for (int frequency: frequencies) {
            if (frequency == 1) count++;
        }
        return count;
    }
}
