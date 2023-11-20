package Bronze5.Day20;

import java.util.Scanner;

public class BOJ4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            long num = sc.nextLong();
            long num2 = sc.nextLong();
            if(num==0 && num2==0) break;
            else if (num > num2){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
