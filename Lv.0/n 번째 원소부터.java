/**
 * 문제: n 번째 원소부터
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181892
 * 설명: 
 * 정수 리스트 num_list와 정수 n이 주어질 때, 
 * n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */

import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int start = n-1;
        int end = num_list.length;
        List<Integer> list = new ArrayList<>();

        for(int i = start; i < end; i++) {
            list.add(num_list[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
