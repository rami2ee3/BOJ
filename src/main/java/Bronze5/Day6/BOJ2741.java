package Bronze5.Day6;

import java.util.Scanner;

public class BOJ2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            System.out.println(i);
        }
    }
}

// 문제) 시간 제한 1초. 100,000보다 작거나 같은 자연수 N
// 자바에서 일억번 반복 -> 1초 걸림
// for문 10만번 도는건 1초 내에 해결 가능