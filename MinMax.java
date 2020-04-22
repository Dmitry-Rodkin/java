class MinMax{
	public static void main(String args[]){
		int nums[] = { 99, - 10, 100124, 16, - 978, 5623, 464, -8,
				287, 49, 4567, 1000000000, -1000000};
		int min, max;

		min = max = nums[0];
		for(int i = 1; i < 12; i++) {
			if(nums[i] < min) min = nums[i];
			if(nums[i] > max) max = nums[i];
		}
		System.out.println("min end max: " + min + " " + max);
	}
}

				