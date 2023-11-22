package Bronze4.Day6;

import java.util.Scanner;

public class BOJ5543 {
    public static void main(String[] args) {
        //햄버거+콜라 = 합계-50 = 세트메뉴 가격
        //가장 싼 세트메뉴 가격 구하기
        //모든 가격은 100~2000
        //1~3줄 버거가격 4~5음료가격

        Scanner sc = new Scanner(System.in);
        int[] burger = new int[3];
        for(int i = 0; i < burger.length; i++){
            int price = sc.nextInt();
            if(price >= 100 && price <= 2000){
                burger[i] = price;
            }
        }
        int minBurgerPrice = burger[0];
        for(int i : burger){
            minBurgerPrice = Math.min(minBurgerPrice, i);
        }

        int priceD = sc.nextInt();
        int minDrinkPrice = Math.min(priceD, sc.nextInt());

        System.out.println(minBurgerPrice + minDrinkPrice - 50);
    }
}
