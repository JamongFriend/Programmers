/**
 * 문제: 수열과 구간 쿼리 2
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181923
 * 키워드: Arrays.stream(), filter(), min(), orElse(), 반복문
 */

import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] ans = new int[queries.length];
        for(int i=0; i< queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            OptionalInt a = Arrays.stream(arr, s, e + 1)
                    .filter(n -> n > k).min();

            ans[i] = a.orElse(-1);
        }
        return ans;
    }
}