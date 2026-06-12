/**
 * 문제: JadenCase 문자열 만들기
 * 난이도: Lv.2
 * 분류: 연습문제
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12951
 * 문제 설명:
 * JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
 * 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
 * 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 */

class Solution {
    public String solution(String s) {
        String[] words = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()) {
                sb.append(" ");
                continue;
            }

            sb.append(words[i].substring(0, 1).toUpperCase());
            sb.append(words[i].substring(1).toLowerCase());
            sb.append(" ");
        }

        return sb.substring(0, sb.length()-1).toString();
    }
}
