/**
 * 문제: 기능개발
 * 난이도: Lv.2
 * 분류: 완전탐색
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42586
 * 문제 설명:
 * 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
 * 또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
 * 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
 *
 * 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때
 *  각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
 *
 * 풀이 전략:
 * 각 기능이 며칠 걸리는지 계산
 * 순서대로 돌면서 앞 기능보다 늦게 끝나는 경우 새 배포
 * 배포 수 count 해서 List 또는 배열로 담기
 *
 */

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int[] days = new int[progresses.length];

        for(int i = 0; i< progresses.length; i++){
            days[i] = (100 - progresses[i]) % speeds[i] == 0
                    ? (100 - progresses[i]) / speeds[i]
                    : (100 - progresses[i]) / speeds[i] + 1;
        }

        int num = 1;
        int pivot = days[0];

        for(int i = 1; i < days.length; i++){
            if(days[i] <= pivot){
                num++;
            }
            else {
                answer.add(num);
                pivot = days[i];
                num = 1;
            }
        }
        answer.add(num);

        return answer.stream().mapToInt(n -> n).toArray();
    }
}
