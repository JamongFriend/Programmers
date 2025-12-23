/**
 * 문제: 둘만의 암호
 * 난이도: Lv.1
 * 분류: 연습문제
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/155652
 * 문제 설명:
 * 두 문자열 s와 skip, 그리고 자연수 index가 주어질 때, 다음 규칙에 따라 문자열을 만들려 합니다.
 * 암호의 규칙은 다음과 같습니다.
 *
 * 문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줍니다.
 * index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아갑니다.
 * skip에 있는 알파벳은 제외하고 건너뜁니다.
 * 예를 들어 s = "aukks", skip = "wbqd", index = 5일 때, a에서 5만큼 뒤에 있는 알파벳은 f지만
 * [b, c, d, e, f]에서 'b'와 'd'는 skip에 포함되므로 세지 않습니다.
 * 따라서 'b', 'd'를 제외하고 'a'에서 5만큼 뒤에 있는 알파벳은 [c, e, f, g, h] 순서에 의해 'h'가 됩니다.
 * 나머지 "ukks" 또한 위 규칙대로 바꾸면 "appy"가 되며 결과는 "happy"가 됩니다.
 *
 * 두 문자열 s와 skip, 그리고 자연수 index가 매개변수로 주어질 때
 * 위 규칙대로 s를 변환한 결과를 return하도록 solution 함수를 완성해주세요.
 *
 * 풀이 전략:
 * skipChar[] 라는 boolean형 배열을 만들고 skip의 각각의 알파벳을 true로 설정
 * cur라는 변수에 s.toCharArray()의 아스키코드 값을 넣는다
 * cur = (cur + 1) % 26를 이용해 다음 알파벳으로 변환
 * skipChar[]에 넣어서 true면 continue;로 cnt의 값을 유지
 * cnt의 값이 index와 같아질 때까지 반복 후 나온 값을 char형으로 변환
 * StringBuilder에 넣고 최종 결과 출력
 */

import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        boolean[] skipChar = new boolean[26];
        for(char c : skip.toCharArray()){
            skipChar[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            int cur = c -'a';
            int cnt = 0;
            while(cnt < index) {
                cur = (cur + 1) % 26;
                if(skipChar[cur]){
                    continue;
                }
                cnt++;
            }
            sb.append((char) (cur + 'a'));
        }

        return sb.toString();
    }
}