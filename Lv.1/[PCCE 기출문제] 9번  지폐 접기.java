/**
 * 문제: [PCCE 기출문제] 9번  지폐 접기
 * 난이도: Lv.1
 * 분류: [PCCE 기출문제]
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/340199
 * 문제 설명:
 * 민수는 다양한 지폐를 수집하는 취미를 가지고 있습니다.
 * 지폐마다 크기가 달라 지갑에 넣으려면 여러 번 접어서 넣어야 합니다.
 * 예를 들어 지갑의 크기가 30 * 15이고 지폐의 크기가 26 * 17이라면 한번 반으로 접어 13 * 17 크기로 만든 뒤
 * 90도 돌려서 지갑에 넣을 수 있습니다.
 * 지폐를 접을 때는 다음과 같은 규칙을 지킵니다.
 *
 * 지폐를 접을 때는 항상 길이가 긴 쪽을 반으로 접습니다.
 * 접기 전 길이가 홀수였다면 접은 후 소수점 이하는 버립니다.
 * 접힌 지폐를 그대로 또는 90도 돌려서 지갑에 넣을 수 있다면 그만 접습니다.
 * 지갑의 가로, 세로 크기를 담은 정수 리스트 wallet과 지폐의 가로,
 * 세로 크기를 담은 정수 리스트 bill가 주어질 때,
 * 지갑에 넣기 위해서 지폐를 최소 몇 번 접어야 하는지 return하도록 solution함수를 완성해 주세요.
 *
 * 풀이 전략:
 * 반복문에 지갑의 크기가 지폐보다 클 경우 브레이크
 * 작을 경우 지폐의 긴부분을 2로 나누고 count 증가
 *
 */

import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int count = 0;

        while(true){
            if(wallet[0] >= bill[0] && wallet[1] >= bill[1] ||
                    wallet[0] >= bill[1] && wallet[1] >= bill[0]){
                break;
            }
            if(bill[0] > bill[1])
                bill[0] /= 2;
            else
                bill[1] /= 2;
            count++;
        }

        return count;
    }
}