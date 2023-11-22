package Bronze4.Day10;

import java.util.Scanner;

public class BOJ5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int perA = A/C;
        if(A%C != 0){
            perA++;
        }
        int perB = B/D;
        if(B%D != 0){
            perB++;
        }
        System.out.println(L-Math.max(perA,perB));
    }
}
