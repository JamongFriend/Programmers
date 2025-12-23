/**
 * 문제: 시저암호
 * 난이도: Lv.1
 * 분류: 연습문제
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12926
 * 문제 설명:
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 *
 * 풀이 전략:
 * s.toCharArray()를 이용하여 s를 분리
 * c가 소문자일때, 대문자일때, 공백일때를 각각 변환
 * StringBuilder에 넣고 최종 결과 출력
 */

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z') {
                sb.append((char) ((c - 'a' + n) % 26 +'a'));
            }
            else if(c >= 'A' && c <= 'Z') {
                sb.append((char) ((c - 'A' + n) % 26 +'A'));
            }
            else if(c == ' '){
                sb.append(c);
            }
        }


        return sb.toString();
    }
}
