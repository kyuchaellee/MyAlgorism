package onn;

public class Bubble_Sort {
	public static void BubbleSort(int[] arr) {
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length - 1; j++) { // ó������ �迭�ձ��� ��ȸ�� point
				if (j + 1 < arr.length && arr[j] > arr[j + 1]) {
//					int tmp = 0;
//					tmp = arr[j];
//					arr[j]=arr[i];
//					arr[i]=tmp;
					 arr[j] = arr[j] + arr[j + 1]; // ���� �� ü����
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
