package Bronze5.Day9;

import java.util.Scanner;

public class BOJ10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){    // 종료시점 판단해야 하므로 다음에 오는게 있는지 확인해 주어야 함
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A<0 || B>10) {
                System.out.println("범위 벗어나서 종료");
                break;
            }
            System.out.println(A + B);
        }
    }
}
