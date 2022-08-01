package onn;

public class Bubble_Sort {
	public static void BubbleSort(int[] arr) {
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length - 1; j++) { // 처음부터 배열앞까지 순회할 point
				if (j + 1 < arr.length && arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1]; // 인접 값 체인지
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}

			for (int l : arr) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 15, 3, 10, 17, 20, 1 };
		BubbleSort(arr);
	}

}
