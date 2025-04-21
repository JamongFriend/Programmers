/**
 * 문제: 문자열의 뒤의 n글자
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181910
 * 키워드: substring()
 */

class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length()-n, my_string.length());
    }
}