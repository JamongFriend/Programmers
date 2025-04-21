/**
 * 문제: 콜라츠 수열 만들기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181919
 * 키워드: List, 반복문, 삼항 연산자, 콜라츠 수열
 */

import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
        while(n != 1){
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
            answer.add(n);
        }

        return answer;
    }
}