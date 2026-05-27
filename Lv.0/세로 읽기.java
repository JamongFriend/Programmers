/**
 * 문제: 세로 읽기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181904
 */

class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        int rowCount = my_string.length() / m;
        String[] lines = new String[rowCount];
        int idx = 0;

        for(int i = 0; i < rowCount; i++) {
            lines[i] = my_string.substring(idx, idx + m);
            idx += m;
        }
        for(int i = 0; i < rowCount; i++) {
            answer.append(lines[i].charAt(c - 1));
        }
        return answer.toString();
    }
}
