package core.ch1;

import java.math.BigInteger;

/**
 * ## 문제
 * BigInteger를 사용해 팩토리얼 n! = 1 x 2 x ... n을 계산하는 프로그램을 작성하라.
 * 그리고 프로그램을 이용해 1000!을 계산하라
 * ## 미지의 것
 * - 1000!을 계산하는 팩토리얼을 구하라
 * ## 자료
 * - 팩토리얼
 * - BigInteger
 * <p>
 * ## 계획
 * 1. BigInteger을 호출한다.
 * 2. 반복문을 사용해서 2부터 n까지의 수를 반복한다.
 * 3. BigInteger는 x이 안되서 multiply 함수를 이용해서 곱하기를 한다.
 * 4. 결과를 리턴한다.
 * <p>
 * ## 반성
 * - 팩토리얼 문제를 BigInteger문제로 풀어봤다. int랑 달라서 재귀로 풀수가 없었다.
 * 방법을 달리해서 다시 한번 풀어봐야겠다.
 */
public class ch1_6 {
    public BigInteger factorial(int n) {
        BigInteger one = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            one = one.multiply(BigInteger.valueOf(i));
        }
        return one;
    }
}
