/**
 * 문제: 배열 만들기 5
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181912
 * 키워드:  parseInt(), substring()
 */

import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] temp = new int[intStrs.length];
        int count = 0;

        for(int i=0; i < intStrs.length; i++){
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(num > k){
                temp[count++] = num;
            }
        }
        int[] answer = new int[count];

        for(int i=0; i< count; i++){
            answer[i] = temp[i];
        }



        return answer;
    }
}