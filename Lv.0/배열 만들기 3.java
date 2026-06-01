/**
 * 문제: 배열 만들기 3
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181895
 */

import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            IntStream.rangeClosed(start, end).forEach(i -> list.add(arr[i]));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
