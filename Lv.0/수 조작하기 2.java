/**
 * 문제: 수 조작하기 2
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181925
 * 키워드: 반복문, 조건문
 */

class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=1; i<numLog.length; i++){
            if((numLog[i] -numLog[i-1]) == 1)
                answer += "w";
            else if((numLog[i] -numLog[i-1]) == -1)
                answer += "s";
            else if((numLog[i] -numLog[i-1]) == 10)
                answer += "d";
            else if((numLog[i] -numLog[i-1]) == -10)
                answer += "a";
        }
        return answer;
    }
}