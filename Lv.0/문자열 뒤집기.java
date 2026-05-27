/**
 * 문제: 문자열 뒤집기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181905
 */

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String firstSub = my_string.substring(0, s);
        String reversed = new StringBuilder(my_string.substring(s, e+1)).reverse().toString();
        String lastSub = my_string.substring(e+1);
        answer = firstSub + reversed + lastSub;
        return answer;
    }
}
