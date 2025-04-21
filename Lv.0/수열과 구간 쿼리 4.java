/**
 * 문제: 수열과 구간 쿼리 4
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181922
 * 키워드: IntStream.rangeClosed(), filter(), forEach(), 반복문
 */

import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int q[] : queries){
            int s = q[0];
            int e = q[1];
            int k = q[2];

            IntStream.rangeClosed(s, e).filter(i -> i % k == 0).forEach(i -> arr[i]++);
        }
        return arr;
    }
}