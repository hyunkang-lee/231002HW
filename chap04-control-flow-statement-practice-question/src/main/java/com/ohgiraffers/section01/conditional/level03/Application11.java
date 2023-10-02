package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application11 {

    public static void main(String[] args) {

        /*
            10 이하의 임의의 난수를 발생시키고 사용자에게 정수 한 개를 입력 받아
            난수가 입력한 정수보다 작으면 “입력하신 정수보다 작습니다.” 출력,
            난수가 입력한 정수보다 크면 “입력하신 정수보다 큽니다.”를 출력하세요.

            단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복 되도록 하고
            정답인 경우 “정답입니다, n회 만에 정답을 맞추셨습니다.”처럼 몇 번째에 정답을 맞췄는지 출력하세요.
       */
        Scanner sc = new Scanner(System.in);

        int rd = (int) (Math.random() * 10 + 1);
        System.out.println(rd);

        int ct = 1;

        while (true) {
            System.out.println("랜덤한 정수는 과연 몇일까요?");

            int a = sc.nextInt();

            if (a >= 1 && 10 >= a) {
                if (a == rd) {
                    System.out.println("정답입니다!");
                    System.out.println("정답입니다." + ct + "회 만에 정답을 맞추셨습니다.");
                    break;
                } else if (a > rd) {
                    System.out.println("입력하신 숫자는 랜덤한 정수보다 큽니다");
                } else{
                    System.out.println("입력하신 숫자는 랜덤한 정수보다 작습니다");
                }
                ct++;
            }
            else {
                System.out.println("랜덤한 정수는 1부터 10까지의 범위 안의 숫자입니다.");
            }
        }
    }
}
