package Bronze5.Day2;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(a/b);

        // 문제) 10^-9 이하의 오차를 허용한다

        // float vs double 정밀도가 다름
        // float -> 소수점 6~7자리 정도
        // double -> 소수점 15~16자리 정도까지 표현이 가능
        // todo : 코테에서는 웬만하면 double쓰는게 좋다.
    }
}
