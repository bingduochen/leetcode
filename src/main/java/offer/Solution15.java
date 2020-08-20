package offer;

public class Solution15 {
    public static int hammingWeight(int n) {

        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return count;

    }

}
