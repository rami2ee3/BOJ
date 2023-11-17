package Bronze5.Day17;

import java.util.Scanner;

public class BOJ9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < T; i++){
            String str = sc.nextLine();
            String result = str.substring(0,1) + str.substring(str.length()-1);
            System.out.println(result);
        }
    }
}
