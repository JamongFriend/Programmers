/**
 * 문제: 접미사인지 확인하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181908
 * 키워드: substring(), Arrays.sort(), equals()
 */

import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;

        int len =my_string.length();
        String[] result = new String[len];

        for(int i = 0; i < len; i++) {
            result[i] = my_string.substring(i);
        }
        Arrays.sort(result);

        for(int i = 0; i < len; i++){
            if(result[i].equals(is_suffix))
                answer = 1;
        }
        return answer;
    }
}