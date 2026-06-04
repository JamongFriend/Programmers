/**
 * 문제: 홀수 vs 짝수
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181887
 * 설명: 
 * 정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때,
 * 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요.
 * 두 값이 같을 경우 그 값을 return합니다.
 */

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        int hol = IntStream.range(0, num_list.length).filter(i -> i % 2 == 1).map(i -> num_list[i]).sum();
        int jack = IntStream.range(0, num_list.length).filter(i -> i % 2 == 0).map(i -> num_list[i]).sum();
        return hol > jack ? hol : jack;
    }
}
