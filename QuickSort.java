package dsa.sorting;

public class QuickSort {
	public static void main(String[] args) {
		int[] ar= {3,7,2,9,1,4,6};


		System.out.println("Before Sorting");
		for(int no:ar) {
			System.out.print(no+" ");
		}

			quickSort(ar,0,ar.length-1);


			System.out.println();
			System.out.println("after Sorting");
			for(int nums:ar) {
				System.out.print(nums+" ");
			}
		}
	

	static void quickSort(int[] arr, int l, int h) {
		if(l<h) {
			int p=partition(arr,l,h);
			quickSort(arr, l, p-1);
			quickSort(arr, p+1, h);
		}

	}

	static int partition(int[] arr, int l, int h) {
		int pivot=arr[l];
		int i=l+1;
		int j=h;
		while(i<=j) {
			while(i<=h&&arr[i]<pivot) {
				i++;
			}
			while(j>l&&arr[j]>pivot) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}


			

		}

		arr[l]=arr[j];
		arr[j]=pivot;
		return j;
	}
}










