/**
 * 문제: 2의 영역
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181894
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int firstIdx = -1;
        int lastIdx = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                firstIdx = i;
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                lastIdx = i;
                break;
            }
        }
        if (firstIdx == -1) {
            return new int[]{-1};
        }

        return Arrays.copyOfRange(arr, firstIdx, lastIdx + 1);
    }
}
