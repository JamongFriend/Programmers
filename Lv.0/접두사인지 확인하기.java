/**
 * 문제: 접두사인지 확인하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181906
 */

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int n = my_string.length();
        for(int i = 0; i < n; i++) {
            String s = my_string.substring(0, i);
            if(s.equals(is_prefix)) {
                answer = 1;
            }
        }
        return answer;
    }
}
