/**
 * 문제: 수 조작하기 1
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181926
 * 키워드: Arrays.stream(), mapToInt(), 조건문
 */

import java.util.*;

class Solution {
    public int solution(int n, String control) {
        int answer = Arrays.stream(control.split(""))
                .mapToInt(s -> {
                    switch(s) {
                        case "w": return 1;
                        case "s": return -1;
                        case "d": return 10;
                        case "a": return -10;
                        default: return 0;
                    }
                }).sum();

        return n+answer;
    }
}