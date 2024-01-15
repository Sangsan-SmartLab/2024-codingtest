#include <stdio.h>
#include <stdlib.h>

void combination(int arr[], int n, int r, int index, int data[], int i, int sum, int target);

int main() {
    int N, L;

    printf("Enter the size of array: ");
    scanf("%d", &N);

    int *M = (int *)malloc(N * sizeof(int));

    printf("Enter array elements: ");
    for (int i = 0; i < N; i++) {
        scanf("%d", &M[i]);
    }

    printf("Enter target sum (L): ");
    scanf("%d", &L);

    int data[N];

    combination(M, N, N, 0, data, 0, 0, L);

    free(M);

    return 0;
}

void combination(int arr[], int n, int r, int index, int data[], int i, int sum, int target) {
    if (index == r) {
        if (sum == target) {
            for (int j = 0; j < r; j++) {
                printf("%d ", data[j]);
            }
            printf("\n");
        }
        return;
    }

    if (i >= n)
        return;

    data[index] = arr[i];
    combination(arr, n, r, index + 1, data, i + 1, sum + arr[i], target);

    combination(arr, n, r, index, data, i + 1, sum, target);
}
