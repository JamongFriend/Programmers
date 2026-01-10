/**
 * 문제: 이상한 문자 만들기
 * 난이도: Lv.1
 * 분류: 연습문제
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12930
 * 문제 설명:
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
 * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 *
 * 풀이 전략:
 * 공백을 기준으로 인덱스 조절
 * 인덱스가 짝수면 소문자로 홀수면 대문자로 변환
 * 결과 반환
 */

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                sb.append(' ');
                idx = 0;
            }
            else {
                if(idx % 2 == 0) sb.append(Character.toUpperCase(c));
                else sb.append(Character.toLowerCase(c));
                idx++;
            }
        }

        return sb.toString();
    }
}