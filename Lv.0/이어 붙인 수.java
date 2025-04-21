/**
 * 문제: 이어 붙인 수
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181928
 * 키워드: Arrays.stream(), filter(), mapToObj(), Integer.parseInt()
 */

import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        String answer1 = Arrays.stream(num_list).filter(a -> a % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining());
        String answer2 = Arrays.stream(num_list).filter(a -> a % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining());

        int answer = Integer.parseInt(answer1) + Integer.parseInt(answer2);
        return answer;
    }
}