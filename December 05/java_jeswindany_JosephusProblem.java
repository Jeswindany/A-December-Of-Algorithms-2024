import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class java_jeswindany_JosephusProblem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int solution = heWhoRemains(n, k);
            System.out.println(solution);
        }
    }

    public static int heWhoRemains(int n, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;

        while (n != 1) {
            index = (index + k - 1) % n;
            list.remove(index);
            n--;
        }

        return list.get(0);
    }
}
