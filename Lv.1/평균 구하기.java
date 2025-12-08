/**
 * 문제: 평균 구하기
 * 난이도: Lv.1
 * 분류: 연습문제
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12944
 * 문제 설명:
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 *
 * 풀이 전략:
 *
 */

import java.util.*;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(double a : arr){
            answer += a;
        }
        answer /= arr.length;
        return answer;
    }
}