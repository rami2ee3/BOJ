package Bronze5.Day1;

import java.util.Scanner;

public class BOJ1000 {
    public static void main(String[] args) {
        // 입력값 받을 때는 Scanner 또는 BufferedReader 사용
        // 입력값 많을 때는 BufferedReader 쓰는게 좋음
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A+B);
    }
}
