package Bronze5.Day16;

import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int [31];
        for(int i=0; i<28; i++){
            int num = sc.nextInt();
            A[num]++;
        }

        for(int i=1; i<=30; i++){
            if(A[i]==0){
                System.out.println(i);
            }
        }
    }
}
