// return the only no. without duplicate 
package Arrays;

public class SingleNumber {
	public static void main(String[] args) {
		int[] nums = { 2,2,0,13,4,13,4 };
		int numsSize = nums.length;
		int rep = nums[0],output = 0;
		for (int i = 0; i < numsSize; i++) {
			int count = 0;
			if (nums[i] != rep) {
				for (int j = i + 1; j < numsSize; j++) {
					if ((nums[i] ^ nums[j]) == 0) {
						nums[i] = rep;
						nums[j] = rep;
						count++;
						break;
					}
				}
				if (count == 0) {
					output = nums[i];
					break;
				}
			}
		}
		System.out.println(output);
	}
}
