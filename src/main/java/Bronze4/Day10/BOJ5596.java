package Bronze4.Day10;

import java.util.Scanner;

public class BOJ5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumMg = 0;
        int sumMs = 0;
        for(int i=0; i<4; i++){
            int mingGuk = sc.nextInt();
            sumMg += mingGuk;
        }
        for(int i=0; i<4; i++){
            int manSae = sc.nextInt();
            sumMs += manSae;
        }
        System.out.println(Math.max(sumMg, sumMs));
    }
}
