package Bronze5.Day15;

import java.util.Scanner;

public class BOJ2475 {
    public static void main(String[] args) {
        //5자리 수 입력받기
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            // 배열에 저장
            arr[i] = sc.nextInt();
            int twice = arr[i] * arr[i];

            sum += twice;
        }
        System.out.println(sum % 10);
    }
}
