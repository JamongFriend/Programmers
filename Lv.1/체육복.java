/**
 * 문제: 체육복
 * 난이도: Lv.1
 * 분류: 탐욕법 (Greedy)
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42862
 * 문제 설명:
 * 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
 * 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
 * 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
 * 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
 *
 * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
 * 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
 * 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
 *
 * 풀이 전략:
 * HashMap으로 키 값을 넣고, 잃어버린 사람은 값을 -1, 빌려주는 사람은 +1
 * 값이 0인경우 키 값의 앞뒤를 확인하여 값이 2인 키가 있으면 둘다 값을 1로 변경
 * 전체 탐색을 하여 값이 1인 키가 있을 경우 answer값을 +1
 *
 */

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i<=n; i++){
            map.put(i, 1);
        }
        for(int key : lost) {
            if(map.containsKey(key)) {
                map.put(key, map.get(key) - 1);
            }
        }
        for(int key : reserve) {
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }
        }

        for(int i = 1; i<=n; i++){
            if(map.get(i) == 0){
                if (map.getOrDefault(i - 1, 0) == 2) {
                    map.put(i - 1, 1);
                    map.put(i, 1);
                } else if (map.getOrDefault(i + 1, 0) == 2) {
                    map.put(i + 1, 1);
                    map.put(i, 1);
                }
            }
        }

        for(int i = 1; i<=n; i++){
            if(map.get(i) >= 1) {
                answer++;
            }
        }

        return answer;
    }
}