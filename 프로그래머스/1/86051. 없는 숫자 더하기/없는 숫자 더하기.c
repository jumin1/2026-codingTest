#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int numbers[], size_t numbers_len) {
    int total_sum = 45;
    int current_sum = 0;
    
    for(size_t i = 0; i < numbers_len; i++){
        current_sum += numbers[i];
    }
    int answer = total_sum - current_sum;
    return answer;
}