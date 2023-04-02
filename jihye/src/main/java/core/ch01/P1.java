package core.ch01;

import java.security.InvalidParameterException;
import java.util.Scanner;

/*
* 1-1. 정수를 읽어서 2진수, 8진수, 16진수로 출력하는 프로그램을 작성하라
* */
public class P1 {

    public static final int BINARY = 2;
    public static final int OCTAL = 8;
    public static final int HEX = 16;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        printParsedNumberInTheRadix(inputNumber, BINARY);
        printParsedNumberInTheRadix(inputNumber, OCTAL);
        printParsedNumberInTheRadix(inputNumber, HEX);
    }

    public static void printParsedNumberInTheRadix(int inputNumber, int radix) {
        System.out.println(radix+"진수: " + parseIntInTheRadix(inputNumber, radix));
    }

    public static String parseIntInTheRadix(int inputNumber, int radix) {
        switch (radix) {
            case BINARY -> {
                return Integer.toBinaryString(inputNumber);
            }
            case OCTAL -> {
                return Integer.toOctalString(inputNumber);
            }
            case HEX -> {
                return Integer.toHexString(inputNumber);
            }
        }
        throw new InvalidParameterException();
    }
}
