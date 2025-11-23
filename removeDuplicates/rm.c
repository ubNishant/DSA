#include <stdio.h>

int removeDuplicates(int* nums, int numsSize) {
    if (numsSize == 0) return 0;

    int i = 1;  
    for (int j = 1; j < numsSize; j++) {
        if (nums[j] != nums[j - 1]) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i; // number of unique elements
}

int main() {
    int nums[] = {1, 1, 2, 2, 3, 4, 4};
    int size = sizeof(nums) / sizeof(nums[0]);

    int k = removeDuplicates(nums, size);

    printf("Unique count: %d\n", k);
    printf("Array after removing duplicates: ");
    for (int i = 0; i < k; i++) {
        printf("%d ", nums[i]);
    }

    return 0;
}
