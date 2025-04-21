/**
 * 문제: 완주하지 못한 선수
 * 난이도: Lv.1
 * 분류: 해시
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42576
 * 문제 설명:
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 *
 * 풀이 전략:
 * Map<String, Integer>를 이용하여 participant이름별로 키값을 저장
 * completion 배열을 순회하며 completion이 키인 값을 -1
 * 키의 값이 0이 아닌 이름을 출력
 */

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> map = new HashMap<>();

        for(String word : participant){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for(String a : completion){
            map.put(a, map.get(a) -1);
        }

        for(String name : map.keySet()) {
            if(map.get(name) != 0) {
                return name;
            }
        }
        return "";
    }
}