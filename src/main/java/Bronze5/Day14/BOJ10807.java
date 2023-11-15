package Bronze5.Day14;

import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[201];
        int N = sc.nextInt();   //입력될 숫자의 개수
        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            A[num + 100]++;     //-100의 범위를 양수로 하기 위해 +100
        }
        int V = sc.nextInt();   //배열에서 찾을 특정 값
        System.out.println(A[V+100]);
    }
}
