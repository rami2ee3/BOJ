package Bronze4.Day5;

import java.util.Scanner;

public class BOJ10039 {
    public static void main(String[] args) {
        //5명 점수(5의배수) 입력받고. 40점 미만은 40점. 평균 구하기.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i ++){
            int num = sc.nextInt();
            if(num % 5 == 0){
                if(num < 40){
                    arr[i] = 40;
                } else {
                    arr[i] = num;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum/5);
    }
}
