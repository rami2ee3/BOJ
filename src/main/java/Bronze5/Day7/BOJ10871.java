package Bronze5.Day7;

import java.util.Scanner;

public class BOJ10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        //N개의 수열
        //반복문 돌면서
        for(int i = 1; i <= N; i++){
            //X보다 작은 수만 출력
            int num = sc.nextInt();
            if(num < X){
                System.out.print(num + " ");
            }
        }
    }
}
