/**
 * 문제: 9로 나눈 나머지
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181914
 * 키워드:  BigInteger, 나머지 연산
 */

import java.math.BigInteger;

class Solution {
    public Long solution(String number) {
        BigInteger big = new BigInteger(number);
        return big.mod(BigInteger.valueOf(9)).longValue();
    }
}