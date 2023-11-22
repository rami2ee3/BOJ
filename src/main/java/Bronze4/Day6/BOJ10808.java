package Bronze4.Day6;

import java.util.Scanner;

public class BOJ10808 {
    public static void main(String[] args) {
        //value -> index
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        char[] temp = sc.next().toCharArray();
        for(int i=0; i<temp.length; i++){
            arr[temp[i]-97]++;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
