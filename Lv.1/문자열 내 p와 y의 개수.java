/**
 * 문제: 문자열 내 p와 y의 개수
 * 난이도: Lv.1
 * 분류: 연습문제
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12916
 * 문제 설명:
 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
 * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
 * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
 * 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 *
 * 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
 *
 * 풀이 전략:
 * int 형 변수 2개 생성
 * p가 나올때, y가 나올때마다 각각의 변수 증가
 * 같다면 ture 같지 않다면 false 출력;
 */

class Solution {
    boolean solution(String s) {
        int ctP = 0;
        int ctY = 0;

        for(char c : s.toCharArray()) {
            if(c == 'p' || c == 'P') {
                ctP++;
            }
            else if(c == 'y' || c == 'Y') {
                ctY++;
            }
            else {
                continue;
            }
        }

       return ctP == ctY;
    }
}
