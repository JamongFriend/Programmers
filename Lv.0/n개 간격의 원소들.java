/**
 * 문제: n개 간격의 원소들
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181888
 * 설명:
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list의 첫 번째 원소부터 마지막 원소까지
 * n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */

import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return IntStream.iterate(0, i -> i < num_list.length, i -> i + n).map(i -> num_list[i]).toArray();
    }
}
