/**
 * 문제: K번째수
 * 난이도: Lv.1
 * 분류: 정렬
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42748
 * 문제 설명:
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
 * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
 *     1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
 *     2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
 *     3. 2에서 나온 배열의 3번째 숫자는 5입니다.
 * 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때
 * 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * 풀이 전략:
 * 각 commands마다 배열은 나누어 새 배열에 저장
 * sort를 이용해 정렬
 * commands[i][2] 값에 해당되는 인덱스를 answer[]에 저장
 */

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i< commands.length; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1];
            int size = end - start;

            int[] sliced = new int[size];
            for(int j = 0; j < size; j++){
                sliced[j] = array[start + j];
            }
            Arrays.sort(sliced);
            answer[i] = sliced[commands[i][2]-1];
        }
        return answer;
    }
}