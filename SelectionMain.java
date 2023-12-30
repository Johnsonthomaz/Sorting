package dsa.sorting;

class SelectionMain {
	public static void main(String[] args) {
		int nums[]= {4,3,8,2,9,5};
		System.out.println("Before Sorting");
		for(int num:nums) {
			System.out.print(num+" ");
		}
		int temp=0;
		int min=0;
		for(int i=0;i<nums.length;i++)
		{
			min=i;
			for(int j=i+1;j<nums.length;j++) 
			{
				if(nums[min]>nums[j])
					min=j;
			}
			temp=nums[i];
			nums[i]=nums[min];
			nums[min]=temp;
			System.out.println();
			for(int num:nums) {
				System.out.print(num+" ");
			}
		}

		System.out.println();
		System.out.println("after Sorting");
		for(int num:nums) {
			System.out.print(num+" ");
		}
	}
}
