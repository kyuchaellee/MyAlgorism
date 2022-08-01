package onn;

public class Select_Sort {
	public static void SelectSort(int[] arr) {
		int i, j;
		int p, s, t;
		for (i = 0; i < arr.length; i++) {
			p = arr[i];
			s = i;
			t = 0;
			for (j = i; j < arr.length; j++) {
				if (p > arr[j]) {
					p = arr[j]; // ÃÖ¼Ú°ª Ã£À½
					s = j; // ÃÖ¼Ú°ª À§Ä¡
					t += 1;
				}
			}
			if (t > 0) {
				arr[i] = arr[i] + arr[s];
				arr[s] = arr[i] - arr[s];
				arr[i] = arr[i] - arr[s];
			}
			for (int l : arr)
				System.out.print(l + " ");

			System.out.println();

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 15, 6, 78, 4, 66, 23, 12 };
		SelectSort(arr);

	}

}
