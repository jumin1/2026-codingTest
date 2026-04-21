#include <stdio.h>
#define LEN_INPUT1 10
#define LEN_INPUT2 10

int main(void) {
    char s1[LEN_INPUT1];
    char s2[LEN_INPUT2];
    scanf("%s %s", s1, s2);

    if(LEN_INPUT1 >= 1 && LEN_INPUT2 <= 10) {
        printf("%s%s", s1, s2);
    } else {
        return 0;
    }
    return 0;
}