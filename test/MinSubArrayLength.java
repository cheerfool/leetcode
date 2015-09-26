package test;

public class MinSubArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = { 1, 2, 3, 4, 4 };
		int[] list2 = { 1, 1, 1, 1, 1, 3, 2 };
		System.out.println(minSubArrayLen(8, list));
		System.out.println(minSubArrayLen(5, list2));
	}

	public static int minSubArrayLen(int s, int[] nums) {
		int arrayLen = nums.length;
		if (arrayLen == 0)
			return 0;
		else {
			int minLen = findMinLen(s, nums, 0, arrayLen + 1, 0, 0);
			return (minLen > arrayLen) ? 0 : minLen;
		}
	}

	public static int findMinLen(int s, int[] nums, int start, int minLen,
			int currentSum, int currentLen) {
		int sum = currentSum;
		int testLen = minLen - 1;
		if (minLen == 1)
			return 1;
		System.out.println("test - start:" + start + ", testLen:" + testLen);

		for (int i = start+currentLen; i < Math.min(nums.length, start
				+ testLen); i++) {
			sum += nums[i];
			if (sum >= s) {
				for (int j = start; j < i; j++) {
					sum -= nums[j];
					if (sum < s)
						return findMinLen(s, nums, j + 2, i - j + 1, sum - nums[j + 1], i-j-1);
				}
				return 1;
			}
		}

		for (int i = start + testLen; i < nums.length; i++) {
			sum = sum - nums[i - testLen] + nums[i];
			if (sum >= s) {
				for (int j = i - testLen + 1; j < i; j++) {
					sum -= nums[j];
					if (sum < s)
						return findMinLen(s, nums, j + 2, i - j + 1, sum - nums[j + 1], i-j-1);
				}
				return 1;
			}
		}

		return minLen;
	}

}
