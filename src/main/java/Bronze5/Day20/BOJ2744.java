package Bronze5.Day20;

import java.util.Scanner;

public class BOJ2744 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char[] text = sc.nextLine().toCharArray();
//        for (int i = 0; i < text.length; i++) {
//            char temp = text[i];
//            if (temp >= 'a' && temp <= 'z') {
//                System.out.print((char) (temp - 32));
//            } else {
//                System.out.print((char) (temp + 32));
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = changeCase(input);
        System.out.println(result);
    }
    private static String changeCase(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if (Character.isUpperCase(currentChar)) {
                charArray[i] = Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                charArray[i] = Character.toUpperCase(currentChar);
            }
        }

        return new String(charArray);
    }
}
