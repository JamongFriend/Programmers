/**
 * 문제: 두 수의 연산값 비교하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181938
 * 키워드: Math.max()
 */

class Solution {
    public int solution(int a, int b) {
        int concat = Integer.parseInt("" + a + b);
        int product = 2 * a * b;
        return Math.max(concat, product);
    }
}