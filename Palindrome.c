#include <stdbool.h>

bool isPalindrome(int x) {
    // negatives & numbers ending with 0 (but not 0 itself) are not palindrome
    if (x < 0 || (x % 10 == 0 && x != 0)) return false;

    int reversedHalf = 0;

    while (x > reversedHalf) {
        int digit = x % 10;
        reversedHalf = reversedHalf * 10 + digit;
        x /= 10;
    }

    // for odd-length numbers, drop the middle digit (reversedHalf / 10)
    return (x == reversedHalf || x == reversedHalf / 10);
}
