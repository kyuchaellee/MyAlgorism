package onn;

public class Insertion_Sort {
	public static void InsertionSort(int[] arr) {
		int i, j;
		int target = 0;

		for (i = 1; i < arr.length; i++) {
			target = i;
			int tmp = 0;

			for (j = i - 1; j >= 0; j--)
				if (arr[j] > arr[target]) {
					tmp = arr[target];
					arr[target] = arr[j];
					arr[j] = tmp;
					target--;
				} else
					break;
			for (int k : arr) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 7, 2, 9 };
		InsertionSort(arr);
	}
}
