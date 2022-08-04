package array.section02.demensional_array.level04.advanced;

public class Application1 {

	public static void main(String[] args) {

		/*
		 * 세 명의 학생 성적 정보를 2차원 배열에 초기화 한 후 과목별 합계, 학생별 총점 및 평균을 구하여 출력하세요
		 * 
		 * -- 출력 예시 --
		 *  ================== A반 성적표 ====================
		 *   이름 국어 영어 수학 합계 평균
		 * ----------------------------------------------- 
		 * 홍길동 80 90 77 247 82.3 
		 * 이순신 78 97 86 261 87.0
		 * 유관순 71 68 88 227 75.7
		 * -----------------------------------------------
		 * 합계 229 255 251 735 81.7
		 */
		// 입력 받아도 돌아가게 할랫는데 잘되는지는 모르겟슴. 테스트 몬함 힘들어서.
		String student[][] = { { "홍길동", "80", "90", "77" }, { "이순신", "78", "97", "86" }, { "유관순", "71", "68", "88" } };
		
		int subjectgetsu = 3;
		int stusum[] = new int[3];
		String subjectsum[] = new String[5];
		subjectsum[0] = "합계";
		double stuavg[] = new double[3];

		for (int i = 0; i < student.length; i++) {
			int sum = 0;
			for (int j = 1; j < student[i].length; j++) { // student[i].length 해도 되고 subjectsu+1 써도 됨.
				sum += Integer.parseInt(student[i][j]);
			}
			stusum[i] = sum;
		}
		int sum2 = 0;  //  과목별로 저어어언부 합계 더해주기 위한 변수
		for (int j = 1; j < subjectgetsu+1; j++) { // 말도안되는 억까 당해서 student[j-1]을 못씀; ㄲㅂ; 과목은 3개니까 j<3 ㅇㅇ
			int sum = 0; // 과목별 합 저장할 변수
			
			for (int i = 0; i < student.length; i++) {
				sum += Integer.parseInt(student[i][j]);
				sum2 += Integer.parseInt(student[i][j]);
			}
			subjectsum[j] = Integer.toString(sum);   //subjectsum 은 [1] 부터 합 계 드감.
			if(j==subjectgetsu) {

				subjectsum[j+1] = Integer.toString(sum2);
//				subjectsum[j+2] = Integer.toString(((double)sum2/((double)student.length*3.0))); ㅅㅂ double 형 string 으로 어캐함 볼까하다가 그냥 참음.
			}
		}
		

		for (int i = 0; i < stuavg.length; i++) {
			stuavg[i] = Math.round(((double) stusum[i] / 3.0) * 10) / 10.0;
		}


		System.out.println(" ================== A반 성적표 ====================");
		System.out.println(" 이름\t국어\t영어\t수학\t합계\t평균");
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				System.out.print(student[i][j] + "\t");
				if (j == student[i].length - 1) {
					System.out.print(stusum[i] + "\t");
					System.out.print(stuavg[i]);
					System.out.println();
				}
			}
			if(i==student.length-1) {
			System.out.println("-----------------------------------------------");
//			System.out.print(subjectsum[i]);
			}
		}
		for(int i = 0;i<subjectsum.length;i++) {
			System.out.print(subjectsum[i]+"\t");
		}
		System.out.print(Math.round(((double)sum2/((double)student.length*3.0))*10)/10.0);
	}
}
