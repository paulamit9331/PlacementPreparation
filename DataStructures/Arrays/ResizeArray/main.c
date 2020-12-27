#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int* getArray(int n) {
    return (n != 0)? (int*) malloc (n * sizeof(int)): NULL;
}

int* getResizedArray(int *arr, int n) {
    return (n != 0)? (int*) realloc (arr, n): NULL;
}

int main(int argc, char const *argv[]) {
    int n = 10;
    int *arr = getArray(n);
     for (int i = 0; i < n; i++) {
        scanf("%d", arr + i);
    }
    printf("\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n\n");
    
    n = 15;
    arr = getResizedArray(arr, n);
     for (int i = 0; i < n; i++) {
        scanf("%d", arr + i);
    }
    printf("\n");
    memset(arr, 1, n);
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n\n");

    n = 5;
    arr = getResizedArray(arr, n);
     for (int i = 0; i < n; i++) {
        scanf("%d", arr + i);
    }
    printf("\n");
    memset(arr, 2, n);
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
