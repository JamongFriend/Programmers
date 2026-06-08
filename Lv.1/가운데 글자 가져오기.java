/**
 * 문제: 가운데 글자 가져오기
 * 난이도: Lv.1
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12903
 * 문제 설명:
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 *
 */

class Solution {
    public String solution(String s) {
        int len = s.length();

        if (len % 2 == 0) {
            return s.substring(len / 2 - 1, len / 2 + 1);
        }
        else {
            return s.substring(len / 2, len / 2 + 1);
        }
    }
}
