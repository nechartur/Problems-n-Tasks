package simple_problem;

import java.util.Scanner;

public class SimpleProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.print(x/10 + " " + x%10);
        in.close();
    }
}
