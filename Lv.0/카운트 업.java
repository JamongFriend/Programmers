/**
 * 문제: 카운트 업
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181920
 * 키워드: List, 반복문
 */

import java.util.*;

class Solution {
    public List<Integer> solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();
        for(int i = start_num; i <= end_num; i++){
            answer.add(i);
        }
        return answer;
    }
}