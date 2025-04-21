/**
 * 문제: 모의고사
 * 난이도: Lv.1
 * 분류: 완전탐색
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42840
 * 문제 설명:
 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * 풀이 전략:
 * 1,2,3번의 찍는 방식을 배열로 선언
 * a[i % a.length] 형식으로 패턴을 반복하고 답과 일치하는 값이 있을 경우 각각의 카운트를 +1
 * Math.max를 이용하여 count값이 제일 큰 사람을 비교 후 List에 값을 추가
 * 배열로 변환하여 값을 출력
 */

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5,};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int countA = 0;
        int countB = 0;
        int countC = 0;

        for(int i = 0; i< answers.length; i++){
            if (a[i % a.length] == answers[i]) countA++;
            if (b[i % b.length] == answers[i]) countB++;
            if (c[i % c.length] == answers[i]) countC++;
        }
        int max = Math.max(countA, Math.max(countB, countC));
        List<Integer> result = new ArrayList<>();
        if (countA == max) result.add(1);
        if (countB == max) result.add(2);
        if (countC == max) result.add(3);

        return result.stream().mapToInt(i -> i).toArray();
    }
}