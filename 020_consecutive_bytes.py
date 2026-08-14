class Solution:
    def longest_consecutive_bytes(self, data: list[int]) -> int:
        """
        計算 data 中最長的連續相同位元組長度。

        Args:
            data: 僅包含 0 到 255 的整數陣列，且至少有一個元素。

        Returns:
            最長的連續相同位元組長度。
        """
        # TODO: 在此撰寫解法
        return 0


# 測試案例：只印出結果，不使用 assert
solution = Solution()
test_data = [1, 1, 1, 2, 2, 3, 3, 3, 3, 4]
result = solution.longest_consecutive_bytes(test_data)
print(result)
