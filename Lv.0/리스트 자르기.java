/**
 * 문제: 리스트 자르기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181897
 */

import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        int start = 0;
        int end = 0;
        int step = 1;

        switch (n) {
            case 1:
                start = 0;
                end = b;
                break;
            case 2:
                start = a;
                end = num_list.length - 1;
                break;
            case 3:
                start = a;
                end = b;
                break;
            case 4:
                start = a;
                end = b;
                step = c;
                break;
        }
        List<Integer> list = new ArrayList<>();

        for (int i = start; i <= end; i += step) {
            list.add(num_list[i]);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
