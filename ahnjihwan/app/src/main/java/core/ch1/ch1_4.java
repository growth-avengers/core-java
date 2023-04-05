package core.ch1;

/**
 * ## 문제
 * double 타입인 양수 값 가장 작은 값과 가장 큰 값을 출력하는 프로그램을 작성하라(자바 API에서 Math.nextUp을 찾는다.)
 * ## 미지의 것
 * - double 타입인 가장 작은 값과 가장 큰 값을 출력하라
 * ## 자료
 * - double 타입
 * - Math.nextUp
 * ## 조건
 * -
 * ## 계획
 * - double 타입의 인자값을 입력한다.
 * - Math.nextUP 메서드를 사용해서 최대값을 구한다.
 * - Double.POSITIVE_INFINITY를 사용해서 최소값을 구한다.
 * - 최대값, 최소값을 리턴한다.
 * ## 반성
 * - Double.POSITIVE_INFINITY를 처음에 이해를 못 햇다. 이 뜻이 double 양의 정수를 무한대를 나타내는 것을 알고나서 최소값과 최대값을 구하는 방법을 알게 되엇다.
 * - Math.nextUp과 Math.nextDown 두 메서드를 따로 공부를 해봐야겟다.
 */
public class ch1_4 {
    public double result_MAX(double n) {
        return Math.nextUp(n);
    }

    public double result_MIN() {
        return Math.nextDown(Double.POSITIVE_INFINITY);
    }
}
