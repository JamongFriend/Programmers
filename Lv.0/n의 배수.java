/**
 * 문제: n의 배수
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181937
 * 키워드: 조건문, 나머지 연산, 배수
 */

class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        if(num % n == 0) answer = 1;
        return answer;
    }
}