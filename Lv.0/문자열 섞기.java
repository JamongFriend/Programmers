/**
 * 문제: 문자열 섞기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181942
 * 키워드 : split(), for문
 */


class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] splitStr1 = str1.split("");
        String[] splitStr2 = str2.split("");
        for(int i = 0; i<str1.length(); i++){
            answer += splitStr1[i] + splitStr2[i];
        }
        return answer;
    }
}