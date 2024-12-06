import java.util.Scanner;

public class java_jeswindany_AlternatingSquareArrangement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            int b = sc.nextInt();
            
            String solution = makeArrangement(r, b);
            System.out.println(solution);
        }
    }

    private static String makeArrangement(int r, int b) {
        if (Math.abs(r - b) > 1) {
            return "Not possible";
        }

        StringBuilder arrangement = new StringBuilder();
        
        int n = Math.min(r, b);

        if (b > r) {
            arrangement.append('B');
        }

        for (int i = 0; i < n; i++) {
            arrangement.append("RB");
        }

        if (r > b) {
            arrangement.append('R');
        }

        return arrangement.toString();
    }
}
