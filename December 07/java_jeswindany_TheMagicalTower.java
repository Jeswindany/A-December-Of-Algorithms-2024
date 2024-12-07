import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class java_jeswindany_TheMagicalTower {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<List<Integer>> solution = findArrangementOfStones(n);
            
            // Printing formatted solution
            System.out.print('[');
            for (int i = 0; i < n; i++) {
                List<Integer> row = solution.get(i);
                int size = row.size();
                System.out.print('[');
                for (int j = 0; j < size; j++) {
                    System.out.print(row.get(j));
                    if (j != size - 1) System.out.print(", ");
                }
                System.out.print(']');
                if (i != n - 1) System.out.print(", ");
            }
            System.out.println(']');
        }
    }

    private static List<List<Integer>> findArrangementOfStones(int n) {
        List<List<Integer>> solution = new ArrayList<>();

        if (n <= 0) {
            return solution;
        }

        solution.add(new ArrayList<>(Arrays.asList(1)));     
        
        for (int row = 1; row < n; row++) {
            List<Integer> prevRow = solution.get(row - 1);
            List<Integer> currRow = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    currRow.add(1);
                    continue;
                }
                currRow.add(prevRow.get(col - 1) + prevRow.get(col));
            }
            solution.add(currRow);
        }

        return solution;
    }
}
