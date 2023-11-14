package Bronze5.Day9;

import java.util.Scanner;

public class BOJ11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();        //엔터 처리

        for (int i = 1; i <= T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            int sum = a+b;
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + sum);
        }
    }
}
