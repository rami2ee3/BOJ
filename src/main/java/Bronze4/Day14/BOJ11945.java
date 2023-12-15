package Bronze4.Day14;

import java.util.Scanner;

public class BOJ11945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i =0; i < N; i++){
            while(sc.hasNext()){
                StringBuilder sb = new StringBuilder(sc.next());
                System.out.println(sb.reverse());
            }
        }
        sc.close();
    }
}

