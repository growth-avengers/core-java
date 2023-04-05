package core.ch1;

/**
 * ## 문제
 * - 조건 연산자만 사용해 정수 세 개를 읽고 최대값을 출력하는 프로그램을 작성하라. Math.max를 사용해 같은 프로그램을 작성하라
 * ## 미지의 것
 * -  정수 세 개의 최대값을 구하라
 * ## 자료
 * - 조건 연산자(If 문)
 * - 최대값(Math.max)
 * ## 조건
 * - 최대값을 Math.max를 사용해서 구하라.
 * ## 계획
 * - 정수 세 개의 값을 주입한다.
 * - x >= y 이면 x를 최대값으로 출력한다. 그렇지 않으면 y가 출력된다.
 * - y >= z 이면 y를 최대값으로 출력한다. 그렇지 않으면 z가 출력된다.
 * - 최대값을 반환한다.
 * ## 반성
 * Math.max에 내부 구조를 확인하면 (a >= b) ? a : b 형태로 되어 있다. 이 구조를 이해하고 나니 조건이 3개 이상일 때도 가능하다는것을 알게되었다.
 * 앞으로도 잘 이해가 안 가면 내부 구조를 확인해봐야겠다.
 */
public class ch1_3 {
    public int returnMax(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    public int returnConditional(int x, int y, int z) {
        return (x >= y) ? x : (y >= z) ? y : z;
    }
}
