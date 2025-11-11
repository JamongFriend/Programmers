/**
 * 문제: 달리기 경주
 * 난이도: Lv.1
 * 분류: 연습문제
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/178871
 * 문제 설명:
 * 얀에서는 매년 달리기 경주가 열립니다. 
 * 해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다. 
 * 예를 들어 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때, 
 * 해설진이 "soe"선수를 불렀다면 2등인 "soe" 선수가 1등인 "mumu" 선수를 추월했다는 것입니다. 
 * 즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다.
 *
 * 선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 
 * 해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때, 
 * 경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return 하는 solution 함수를 완성해주세요.
 *
 * 풀이 전략:
 * Map<String, Integer>를 생성하여 players를 이름, 순위의 키값으로 넣는다
 * players의 순위를 변경 후 pos의 키값을 바꾼다
 *
 */

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> pos = new HashMap<>(players.length * 2);
        for(int i = 0; i < players.length; i++){
            pos.put(players[i], i);
        }

        for(String name : callings){
            int i = pos.get(name);
            if(i == 0) continue;

            String temp = players[i - 1];
            players[i - 1] = name;
            players[i] = temp;

            pos.put(name, i-1);
            pos.put(temp, i);
        }
        return players;
    }
}


//**일부 테스트 케이스에서 시간 초과로 인한 실패**
//class Solution {
//    public String[] solution(String[] players, String[] callings) {
//        for(int i = 0; i < callings.length; i++){
//            for(int j = 0; j < players.length; j++){
//                if(players[j].equals(callings[i])){
//                    if(j > 0){
//                        String temp = players[j];
//                        players[j] = players[j-1];
//                        players[j-1] = temp;
//                    }
//                    break;
//                }
//            }
//        }
//        return players;
//    }
//}
