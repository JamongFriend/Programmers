/**
 * 문제: 접미사 배열
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181909
 * 키워드: substring(), Arrays.sort()
 */

import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int len =my_string.length();
        String[] answer = new String[len];

        for(int i = 0; i < len; i++) {
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}