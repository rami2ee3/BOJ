package Bronze4.Day11;

import java.util.Scanner;

public class BOJ1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String text = sc.nextLine().toLowerCase();
            if(text.equals("#"))break;
            char[] textArr = text.toCharArray();
            int count = 0;
            for(int i=0; i<textArr.length; i++){
                if(textArr[i]=='a' || textArr[i]=='e'|| textArr[i]=='i'|| textArr[i]=='o'|| textArr[i]=='u'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}