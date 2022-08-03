package onlogn;

public class Merge_Sort {
	static int[] arr = {5,11,3,9,8,1,6};  // 배열하고자 하는 배열
	static int[] tmp = new int[arr.length];    // ** 배열을 정리한 값 정리 해서 arr 에 대입 시키기 위한 배열
	
	public static void MergeSort(int start, int end) {
		if(start<end) {   // 1개 밑으로는 쪼갤 수 가 없슴.
			int mid = (start+end)/2;
			MergeSort(start,mid);     // 반 으로 나눠서
			MergeSort(mid+1,end);     // 재귀 함수를 통해서 1까지 쪼개기 위한 작업 
			
			/* 여기 변수 주는게 굉장히 중요 */
			int sp = start;      // 배열을 두개를 합칠 때 앞 배열 포인트 
			int mp = mid+1;      // 배열 두개를 합칠 때 뒷 배열 포인트
			int tp = sp;      // tmp 에 정렬된 값을 넣기 위함.
			        /*왜 tp =start가 아니냐면 뒷 배열이 먼저 앞자리에 정렬되면 덮어쓰게 된다. 따라서 이렇게 해줘야함.*/
			
			while(sp<=mid || mp<= end) {  // 포인트가 배열 크기 벗어나면 당연히 멈춰야됨
				if(mp>end || (sp<=mid&&arr[sp]<arr[mp])){//기준을 첫 번째 배열에 두고 배열을 합치기 위한 조건 두가지
					tmp[tp++] = arr[sp++]; //tmp에 작은 값 넣고 해당 포인트들을 한칸씩 옮긴다.
				}else {
					tmp[tp++] = arr[mp++];
				}
			}
			for(int i = start;i<=end;i++) {  // 시작부분과 끝부분 까지 정렬된 값 삽입
				arr[i] = tmp[i];
			}
		}
	}
	
	
	public static void main(String[] args) {
		int end = arr.length;
		MergeSort(0,end-1);
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
//
