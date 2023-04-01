package core.ch1;

public class ch1_1 {

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

        if (number >= 1) {
            answer = number % 8 + answer;
            return octalNumber(number / 8) + answer;
        }

        return answer; // 어떻게 하면 중복을 드러낼 수 있을까?
    }
}
