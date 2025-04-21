/**
 * 문제: 문자열 곱하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181940
 * 키워드: for문
 */

class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i=0; i< k; i++) {
            answer += my_string;
        }
        return answer;
    }
}