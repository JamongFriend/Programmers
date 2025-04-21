/**
 * 문제: 부분 문자열 이어 붙여 문자열 만들기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181911
 * 키워드: 2차원 배열, substring()
 */

import java.util.*;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i = 0;  i< my_strings.length; i++){
            int s = parts[i][0];
            int e = parts[i][1];
            answer += my_strings[i].substring(s,e+1);
        }
        return answer;
    }
}