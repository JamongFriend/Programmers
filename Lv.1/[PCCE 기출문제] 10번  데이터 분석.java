/**
 * 문제: [PCCE 기출문제] 10번 데이터 분석
 * 난이도: Lv.1
 * 분류: [PCCE 기출문제]
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/250121
 * 문제 설명:
 * AI 엔지니어인 현식이는 데이터를 분석하는 작업을 진행하고 있습니다.
 * 데이터는 ["코드 번호(code)", "제조일(date)", "최대 수량(maximum)", "현재 수량(remain)"]으로 구성되어 있으며
 * 현식이는 이 데이터들 중 조건을 만족하는 데이터만 뽑아서 정렬하려 합니다.
 *
 * 정렬한 데이터들이 담긴 이차원 정수 리스트 data와 어떤 정보를 기준으로 데이터를 뽑아낼지를 의미하는 문자열 ext,
 * 뽑아낼 정보의 기준값을 나타내는 정수 val_ext, 정보를 정렬할 기준이 되는 문자열 sort_by가 주어집니다.
 *
 * data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후,
 * sort_by에 해당하는 값을 기준으로 오름차순으로 정렬하여 return 하도록 solution 함수를 완성해 주세요.
 * 단, 조건을 만족하는 데이터는 항상 한 개 이상 존재합니다.
 *
 * 풀이 전략:
 * getIdx()로 케이스 분리
 * List를 생성하고 getIdx의 케이스와 val_ext 비교후 List에 추가
 * List를 sort로 오름차순 정렬
 * answer에 값을 넣고 반환
 *
 */

import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIdx = getIdx(ext);
        int sortIdx = getIdx(sort_by);

        List<int[]> filtered = new ArrayList<>();
        for(int i=0; i<data.length; i++){
            if(data[i][extIdx] < val_ext) {
                filtered.add(data[i]);
            }
        }

        filtered.sort(Comparator.comparingInt(row -> row[sortIdx]));


        int[][] answer = new int[filtered.size()][4];
        for (int i = 0; i < filtered.size(); i++) {
            answer[i] = filtered.get(i);
        }

        return answer;
    }

    private int getIdx(String key){
        switch(key) {
            case "code": return 0;
            case "date": return 1;
            case "maximum": return 2;
            case "remain": return 3;
        }
        return -1;
    }
}