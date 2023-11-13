package Day3;

import java.util.Scanner;

public class BOJ2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){ // N번의 반복이 일어남 col
            for(int j = 1; j <=i; j++){ // i번의 반복이 일어남 row
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
