/**
 * 문제: 공배수
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181936
 * 키워드: 공배수, 나머지 연산, 삼항 연산자
 */

class Solution {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m==0 ? 1 : 0;
    }
}