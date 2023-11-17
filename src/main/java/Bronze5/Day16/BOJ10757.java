package Bronze5.Day16;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 문제) 10^10000
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        System.out.println(A.add(B));
    }
}
