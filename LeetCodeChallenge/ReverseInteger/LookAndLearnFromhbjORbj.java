// Code By hbjORbj Just Look And Learn 


class Solution {
    public int reverse(int x) {
        if (x >= -9 && x <= 9) {
            return x;
        }
        int posX = Math.abs(x);
        long result = 0;
        
        while (posX > 0) {
            int rightMostDigit = posX % 10;
            result = result * 10 + rightMostDigit;
            posX = (posX - rightMostDigit) / 10;
        }
        
        if (x < 0) {
            result *= -1;
        }
        
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int) result;
    }
    // T.C: O(log(x))
    // S.C: O(1)
}