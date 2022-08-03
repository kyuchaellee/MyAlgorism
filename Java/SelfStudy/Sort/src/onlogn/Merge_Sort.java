package onlogn;

public class Merge_Sort {
	static int[] arr = {5,11,3,9,8,1,6};  // �迭�ϰ��� �ϴ� �迭
	static int[] tmp = new int[arr.length];    // ** �迭�� ������ �� ���� �ؼ� arr �� ���� ��Ű�� ���� �迭
	
	public static void MergeSort(int start, int end) {
		if(start<end) {   // 1�� �����δ� �ɰ� �� �� ����.
			int mid = (start+end)/2;
			MergeSort(start,mid);     // �� ���� ������
			MergeSort(mid+1,end);     // ��� �Լ��� ���ؼ� 1���� �ɰ��� ���� �۾� 
			
			/* ���� ���� �ִ°� ������ �߿� */
			int sp = start;      // �迭�� �ΰ��� ��ĥ �� �� �迭 ����Ʈ 
			int mp = mid+1;      // �迭 �ΰ��� ��ĥ �� �� �迭 ����Ʈ
			int tp = sp;      // tmp �� ���ĵ� ���� �ֱ� ����.
			        /*�� tp =start�� �ƴϳĸ� �� �迭�� ���� ���ڸ��� ���ĵǸ� ����� �ȴ�. ���� �̷��� �������.*/
			
			while(sp<=mid || mp<= end) {  // ����Ʈ�� �迭 ũ�� ����� �翬�� ����ߵ�
				if(mp>end || (sp<=mid&&arr[sp]<arr[mp])){//������ ù ��° �迭�� �ΰ� �迭�� ��ġ�� ���� ���� �ΰ���
					tmp[tp++] = arr[sp++]; //tmp�� ���� �� �ְ� �ش� ����Ʈ���� ��ĭ�� �ű��.
				}else {
					tmp[tp++] = arr[mp++];
				}
			}
			for(int i = start;i<=end;i++) {  // ���ۺκа� ���κ� ���� ���ĵ� �� ����
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
