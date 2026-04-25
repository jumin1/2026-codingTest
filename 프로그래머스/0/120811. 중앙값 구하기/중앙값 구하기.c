#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len) {
    for(int i = 0; i < array_len - 1; i++) {
        for(int j = 0; j < array_len - 1; j++) {
        int t = 0;
        if(array[j] > array[j+1]){
            t = array[j];
            array[j] = array[j+1];
            array[j+1] = t;
        }
        }
    }
    
    // 3개 -> 인덱스 1 / 5개 -> 인덱스 2 / 7개 -> 인덱스 3 / 9개 -> 인덱스 4
    int midIdx = array_len / 2;
    int answer = array[midIdx];
    return answer;
}