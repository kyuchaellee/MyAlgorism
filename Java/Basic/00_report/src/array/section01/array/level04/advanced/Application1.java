package array.section01.array.level04.advanced;

public class Application1 {

	public static void main(String[] args) {
		
		/* 로또번호 생성기 
		 * 6칸 짜리 정수 배열을 하나 생성하고
		 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
		 * 오름차순 정렬하여 출력하세요
		 * */
		
		int[] roddo = new int[6];
		
		for(int i = 0; i<roddo.length;i++) {
			roddo[i] = (int)(Math.random()*46);
		}
		for(int i = 0; i<roddo.length;i++) {
			System.out.print(roddo[i] + " ");
		}
		
		SelectSort(roddo);
		
	}
	
	public static void SelectSort(int[] arr) {
		for(int i = 0;i<(arr.length-1);i++) {
			int temp = arr[i]; // 작은 값 저장하려고 선언해주는 변수.
			int p = i;
			for(int j = i+1;j<arr.length;j++) {
				if(temp>arr[j]) {
					temp = arr[j];
					p = j;
				}
			}
			if(p!=i) {
			arr[i] = arr[i]+arr[p];
			arr[p] = arr[i]-arr[p];
			arr[i] = arr[i]-arr[p];
			}
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
