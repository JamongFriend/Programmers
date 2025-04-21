/**
 * 문제: 문자열 여러 번 뒤집기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181913
 * 키워드:  split(), StringBuilder, swap
 */

class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] splitS = my_string.split("");

        for(int i=0; i< queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            while(s < e){
                String temp = splitS[s];
                splitS[s] = splitS[e];
                splitS[e] = temp;
                s++;
                e--;
            }
        }
        StringBuilder answer = new StringBuilder();
        for (String ch : splitS) {
            answer.append(ch);
        }
        return answer.toString();
    }
}