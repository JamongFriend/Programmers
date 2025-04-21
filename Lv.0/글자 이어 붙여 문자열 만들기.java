/**
 * 문제: 글자 이어 붙여 문자열 만들기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181915
 * 키워드:  split(), 반복문
 */

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] splitS = my_string.split("");

        for(int i = 0; i<index_list.length; i++){
            answer += splitS[index_list[i]];
        }
        return answer;
    }
}