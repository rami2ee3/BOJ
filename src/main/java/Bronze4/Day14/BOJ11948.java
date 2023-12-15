package Bronze4.Day14;

import java.util.Scanner;

public class BOJ11948 {
    public static void main(String[] args) {
        //4과목 중 젤 낮은점수 과목 1개 빼고, 2과목 중 젤 낮은점수 1개 빼서 다 더함
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min_a = Integer.MAX_VALUE;
        int min_b = Integer.MAX_VALUE;

        for(int i=0; i<4; i++){
            int temp = sc.nextInt();
            sum += temp;
            if(temp<min_a) min_a = temp;
        }

        for(int i=0; i<2; i++){
            int temp = sc.nextInt();
            sum += temp;
            if(temp<min_b) min_b = temp;
        }

        System.out.println(sum-min_a-min_b);
    }
}
