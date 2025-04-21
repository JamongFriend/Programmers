/**
 * 문제: flag에 따라 다른 값 반환하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181933
 * 키워드: boolean, 삼항 연산자
 */

class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}