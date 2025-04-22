/**
 * 문제: 최소직사각형
 * 난이도: Lv.1
 * 분류: 완전탐색
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/86491
 * 문제 설명:
 * 명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다.
 * 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다.
 * 이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.
 *
 *가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
 * 하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다.
 * 이때의 지갑 크기는 4000(=80 x 50)입니다.
 * 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다.
 * 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.
 *
 * 풀이 전략:
 * 가로 세로 길이중 제일 긴값을 가로로 변경
 * 가로와 세로의 길이들을 비교해 가장 큰 값을 각각 비교
 * 가장 길이가 큰 가로와 세로를 곱
 *
 */

import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = 0;
        int maxH = 0;
        for(int[] size : sizes){
            if(size[0] < size[1]) {
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
            maxW = Math.max(maxW, size[0]);
            maxH = Math.max(maxH, size[1]);
        }
        answer = maxW * maxH;

        return answer;
    }
}