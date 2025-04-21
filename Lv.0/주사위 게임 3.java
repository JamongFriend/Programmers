/**
 * 문제: 주사위 게임 3
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181916
 * 키워드:  Map<>, min(), 주사위
 */

import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a,b,c,d};
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : dice) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());

        if(map.size() == 1) {
            int p = keys.get(0);
            return 1111*p;
        }

        if(map.size() == 2){
            int p = keys.get(0);
            int q = keys.get(1);
            int countP = map.get(p);
            int countQ = map.get(q);
            if(countP == 3 || countQ == 3){
                int three = countP == 3 ? p : q;
                int one = countP == 1 ? p : q;
                return (int) Math.pow((10 * three + one), 2);
            }
            else{
                return (p+q)*Math.abs(p - q);
            }
        }

        if(map.size() == 3){
            int q = 0, r = 0;
            for(int key : map.keySet()){
                if(map.get(key) == 1){
                    if (q == 0) q = key;
                    else r = key;
                }
            }
            return q * r;
        }
        if (map.size() == 4) {
            return Arrays.stream(dice).min().getAsInt();
        }
        return 0;
    }
}