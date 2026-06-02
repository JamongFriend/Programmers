/**
 * 문제: 순서 바꾸기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181891
 * 설명:
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠
 * n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
 */

import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] part1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] part2 = Arrays.copyOfRange(num_list, 0, n);
        int[] answer = new int[part1.length + part2.length];
        System.arraycopy(part1, 0, answer, 0, part1.length);
        System.arraycopy(part2, 0, answer, part1.length, part2.length);

        return answer;
    }
}
