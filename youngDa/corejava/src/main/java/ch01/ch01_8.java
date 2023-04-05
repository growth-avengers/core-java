package ch01;

import java.util.Scanner;

public class ch01_8 {

    public static void ch01_8() {
        Scanner sc = new Scanner(System.in);
        String rawString = sc.next();
        System.out.println(printString(rawString));
    }
    public static String printString(String rawString) {
        return rawString.replace(" ", "");
    }
}
