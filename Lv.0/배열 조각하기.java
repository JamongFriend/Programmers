/**
 * 문제: 배열 조각하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181893
 */

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            int k = query[i];
            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, k + 1);
            }
            else {
                arr = Arrays.copyOfRange(arr, k, arr.length);
            }
        }
        return arr;
    }
}
