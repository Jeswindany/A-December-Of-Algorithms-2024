import java.util.*;

public class java_jeswindany_TargetPairFinder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String nums[] = sc.nextLine().split(" ");
            int numbers[] = new int[nums.length];
            
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(nums[i]);
            }

            int target = sc.nextInt();
            
            ArrayList<int[]> solution = findUniquePairs(numbers, target);

            System.out.print('[');

            int n = solution.size();
            for (int i = 0; i < n; i++) {
                int[] pair = solution.get(i);
                System.out.print("(" + pair[0] + "," + pair[1] +  ")");
                if (i != n - 1) System.out.print(", ");
            }
            System.out.println(']');
        }
    }

    private static ArrayList<int[]> findUniquePairs(int arr[], int target) {
        ArrayList<int[]> solution = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num: arr) {
            if (set.contains(target -  num)) {
                solution.add(new int[]{target - num, num});
            }
            set.add(num);
        }

        return solution;
    }
}
