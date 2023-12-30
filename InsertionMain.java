package dsa.sorting;

class InsertionMain {
	public static void main(String[] args) {
		int arr[]= {3,4,2,8,1,9};
		System.out.println("Before Sorting");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		for(int i=1;i<arr.length;i++) {
			int ele=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>ele) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=ele;


		}

		System.out.println();
		System.out.println("after Sorting");
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
}
