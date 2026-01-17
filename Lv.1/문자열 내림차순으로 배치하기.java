/**
 * 문제: 문자열 내림차순으로 배치하기
 * 난이도: Lv.1
 * 분류: 연습문제
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12916
 * 문제 설명:
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해
 * 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 *
 * 풀이 전략:
 */

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        for(String a : str) {
            answer += a;
        }
        return answer;
    }
}
