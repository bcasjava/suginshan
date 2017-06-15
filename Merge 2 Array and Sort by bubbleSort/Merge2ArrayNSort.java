package edu.dsa.bubbleSort;

public class Merge2ArrayNSort {

	static void mergeProcess(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] arrf = new int[m + n];
		for (int i = 0; i < n; i++) {
			arrf[i] = arr1[i];
		}
		for (int i = 0; i < m; i++) {
			arrf[n + i] = arr2[i];
		}
		printArray(arrf);
		bubbleSort(arrf);
	}

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\n\nMerged Array after Sorted ");
		printArray(arr);
	}

	public static void printArray(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 2, 45, 320, 2, 5, 35, 32 };
		int arr0[] = { 3, 9, 5, 6, 1, 8, 402, 4, 12, 10, 11 };
		System.out.print("Array before bubbleSort\nArray 1 : ");
		printArray(arr);
		System.out.print("\nArray 2 : ");
		printArray(arr0);
		System.out.println("\n\nArrays After merged");
		mergeProcess(arr, arr0);

	}
}
