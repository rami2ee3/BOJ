package Bronze4.Day10;

import java.util.Scanner;

public class BOJ5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = 0;
        for(int i = 0; i<4; i++){
            sec += sc.nextInt();
        }
        System.out.println(sec/60);
        System.out.println(sec%60);
    }
}
