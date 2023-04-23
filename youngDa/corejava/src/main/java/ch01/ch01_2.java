package ch01;

import java.util.Scanner;

public class ch01_2 {
    /**
     * 2. 정수로 된 각도를 읽고 0~359 사이의 값으로 정규화 하는 프로그램을 작성하라
     */
    public static void ch01_2(){
        Scanner sc = new Scanner(System.in);
        Integer angle = sc.nextInt();
        angle = normalizeAngle(angle);
        System.out.println(angle);
    }

    public static Integer normalizeAngle(int rawAngle) {
        int angle = Math.floorMod(rawAngle%360, 360);
        return angle;
    }
}
