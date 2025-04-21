/**
 * 문제: 등차수열의 특정한 항만 더하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181931
 * 키워드: 반복문, 삼항 연산자, 등차수열
 */

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0; i < included.length; i++){
            answer += included[i] ? a + d*i : 0;
        }
        return answer;
    }
}