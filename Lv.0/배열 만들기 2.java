/**
 * 문제: 배열 만들기 2
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181921
 * 키워드: isEmpty(), mapToInt(), toArray(), 반복문, 삼항 연산자
 */

import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++){
            boolean valid = true;
            int n = i;
            while(n > 0){
                int num = n % 10;
                if(num != 0 && num != 5){
                    valid = false;
                    break;
                }
                n /= 10;
            }
            if(valid) list.add(i);
        }
        return list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(x -> x).toArray();
    }
}