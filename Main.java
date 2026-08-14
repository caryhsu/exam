public class Main {

    static class Solution {
        /**
         * 計算 data 中最長的連續相同位元組長度。
         *
         * @param data 僅包含 0 到 255 的整數陣列，且至少有一個元素
         * @return 最長的連續相同位元組長度
         */
        public int longestConsecutiveBytes(int[] data) {
            // TODO: 在此撰寫解法
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] testData = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4};
        int result = solution.longestConsecutiveBytes(testData);
        System.out.println(result);
    }
}
