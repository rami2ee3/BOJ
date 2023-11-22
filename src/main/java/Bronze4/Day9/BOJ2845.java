package Bronze4.Day9;

import java.util.Scanner;

public class BOJ2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int perNum = sc.nextInt();
        int place = sc.nextInt();
        for(int i=0; i<5; i++){
            int temp = sc.nextInt();
            System.out.print(temp - perNum*place+" ");
        }
    }
}
