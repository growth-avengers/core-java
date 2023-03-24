package core.ch1;

public class Example01 {

    // 정수를 2진수로 풀어라
    public String binaryNumber(int number) {
        String answer = "";

        if (number >= 1) {
            answer = number % 2 + answer;
            return binaryNumber(number / 2) + answer;
        }

        return answer;
    }

    // 정수를 읽어서 8진수로 풀어라
    public String octalNumber(int number) {
        String answer = "";
        if (number >= 0 && number < 8) {
            answer = Integer.toString(number);
            return answer;
        }

        if (number >= 8 && number < 16) {
            answer = Integer.toString(number + (2 * 1));
            return answer;
        }

        if (number >= 16 && number < 24) {
            answer = Integer.toString(number + (2 * 2));
            return answer;
        }

        if (number >= 24 && number < 32) {
            answer = Integer.toString(number + (2 * 3));
            return answer;
        }

        return answer; // 어떻게 하면 중복을 드러낼 수 있을까?
    }
}
