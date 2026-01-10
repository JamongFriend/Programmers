/**
 * 문제: 문자열 다루기 기본
 * 난이도: Lv.1
 * 분류: 연습문제
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12918
 * 문제 설명:
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
 * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 *
 * 풀이 전략:
 * s의 길이가 4 혹은 6인지 확인 후 틀리면 false 출력
 * s를 아스키 코드(10진수)로 변환
 * 48~57 사이면 반복문을 돌리고 아니면 false 출력
 *
 */

// 수정 코드
class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        for(char c : s.toCharArray()) {
            if(c >= '0' && c <= '9') {
                continue;
            }
            else
                return false;
        }
        return true;
    }
}

// 이전 코드
class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            String[] sSplit = s.split("");
            int[] sCharToArray = new int[s.length()];
            for(int i = 0; i < s.length(); i++) {
                int sChar = sSplit[i].charAt(0);
                sCharToArray[i] = sChar;
            }
            for(int a : sCharToArray) {
                if(a >= 48 && a <= 57) {
                    continue;
                }
                else
                    return false;
            }
            return true;
        }
        else
            return false;
    }
}