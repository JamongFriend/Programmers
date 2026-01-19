/**
 * 문제: 핸드폰 번호 가리기
 * 난이도: Lv.1
 * 분류: 연습문제
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12948
 * 문제 설명:
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 
 * 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 * 풀이 전략:
 */

class Solution {
    public String solution(String phone_number) {
        int backFourNum = phone_number.length()-4;
        char[] toArray = phone_number.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < phone_number.length(); i++) {
            if(i < backFourNum) {
                sb.append("*");
            }
            else {
                sb.append(toArray[i]);
            }
        }
        return sb.toString();
    }
}
