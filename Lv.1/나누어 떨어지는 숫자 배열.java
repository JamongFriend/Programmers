/**
 * 문제: 나누어 떨어지는 숫자 배열
 * 난이도: Lv.1
 * 분류: 완전탐색
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12910
 * 문제 설명:
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 *
 * 풀이 전략:
 * 나누어 떨어지는 배열의 값들을 리스트에 추가
 * 리스트가 비어있을 경우의 예외 처리
 * 리스트를 정렬 후 배열로 반환
 *
 */

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for(int n : arr){
            if(n % divisor == 0){
                answer.add(n);
            }
        }
        if(answer.isEmpty()) {
            return new int[] {-1};
        }

        return answer.stream().mapToInt(n -> n).sorted().toArray();
    }
}