package Bronze5.Day11;

import java.util.Scanner;

public class BOJ10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 0! = 1
        if(N <= 1){
            System.out.println(1);
        } else {
            int fac = 1;
            for(int i = 2; i <= N; i++){
                fac *= i;
            }
            System.out.println(fac);
        }
    }
}
