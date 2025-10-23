/**
 * 문제: 가장 많이 받은 선물
 * 난이도: Lv.1
 * 분류: 2024 KAKAO WINTER INTERNSHIP
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/258712
 * 문제 설명:
 * 선물을 직접 전하기 힘들 때 카카오톡 선물하기 기능을 이용해 축하 선물을 보낼 수 있습니다.
 * 당신의 친구들이 이번 달까지 선물을 주고받은 기록을 바탕으로 다음 달에 누가 선물을 많이 받을지 예측하려고 합니다.
 *
 * 두 사람이 선물을 주고받은 기록이 있다면,
 * 이번 달까지 두 사람 사이에 더 많은 선물을 준 사람이 다음 달에 선물을 하나 받습니다.
 * 예를 들어 A가 B에게 선물을 5번 줬고, B가 A에게 선물을 3번 줬다면 다음 달엔 A가 B에게 선물을 하나 받습니다.
 * 두 사람이 선물을 주고받은 기록이 하나도 없거나 주고받은 수가 같다면,
 * 선물 지수가 더 큰 사람이 선물 지수가 더 작은 사람에게 선물을 하나 받습니다.
 * 선물 지수는 이번 달까지 자신이 친구들에게 준 선물의 수에서 받은 선물의 수를 뺀 값입니다.
 * 예를 들어 A가 친구들에게 준 선물이 3개고 받은 선물이 10개라면 A의 선물 지수는 -7입니다.
 * B가 친구들에게 준 선물이 3개고 받은 선물이 2개라면 B의 선물 지수는 1입니다.
 * 만약 A와 B가 선물을 주고받은 적이 없거나 정확히 같은 수로 선물을 주고받았다면,
 * 다음 달엔 B가 A에게 선물을 하나 받습니다.
 * 만약 두 사람의 선물 지수도 같다면 다음 달에 선물을 주고받지 않습니다.
 * 위에서 설명한 규칙대로 다음 달에 선물을 주고받을 때,
 * 당신은 선물을 가장 많이 받을 친구가 받을 선물의 수를 알고 싶습니다.
 *
 * 친구들의 이름을 담은 1차원 문자열 배열 friends,
 * 이번 달까지 친구들이 주고받은 선물 기록을 담은 1차원 문자열 배열 gifts가 매개변수로 주어집니다.
 * 이때, 다음달에 가장 많은 선물을 받는 친구가 받을 선물의 수를 return 하도록 solution 함수를 완성해 주세요.
 *
 * 풀이 전략:
 * A -> B 선물 횟수 매트릭스(give[a][b]) 생성
 * 받은 선물, 준 선물 갯수, 선물 지수 계산
 * 다음 달에 선물 받을 사람 비교
 * 다음 달 받을 선물 수 배열에서 최대값을 반환
 *
 */

import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int n = friends.length;

        Map<String, Integer> index = new HashMap<>();
        for(int i = 0; i < n; i++) {
            index.put(friends[i], i);
        }

        int[][] give = new int[n][n];
        int[] given = new int[n];
        int[] received = new int[n];

        for(String g : gifts) {
            String[] sp = g.split(" ");
            int a = index.get(sp[0]);
            int b = index.get(sp[1]);
            give[a][b]++;
            given[a]++;
            received[b]++;
        }

        int[] giftFactor = new int[n];
        for(int i = 0; i<n; i++){
            giftFactor[i] = given[i] - received[i];
        }

        int[] nextmonth = new int[n];
        for(int i = 0; i<n; i++){
            for(int j = i+1; j < n; j++){
                int ij = give[i][j];
                int ji = give[j][i];

                if(ij > ji){
                    nextmonth[i]++;
                }
                else if(ji > ij) {
                    nextmonth[j]++;
                }
                else{
                    if (giftFactor[i] > giftFactor[j]){
                        nextmonth[i]++;
                    }
                    else if (giftFactor[i] < giftFactor[j]){
                        nextmonth[j]++;
                    }
                }

            }
        }

        for (int v : nextmonth)
            answer = Math.max(answer, v);

        return answer;
    }
}