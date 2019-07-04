package p03_filename;

public class ArgsEx {

	@SuppressWarnings("null")
	public static void main(String[] args) { 
	
		///3개의 문자열을 구해서 합계를 구하는 프로그램 작성
		//합계를 구해라
		//3개 문자열 값이 40점이하면 "과락"
		//평균이 60점이하 총점, 그 밖에는 "합격"
			
		int total=0;
		int ave=0;
		System.out.println("국어 = " + args[0]);
		System.out.println("수학 = " + args[1]);
		System.out.println("영어 = " + args[2]);
		
		int args_num[] = null;
		
		//args_num[0] = Integer.valueOf(args[0]);
		//System.out.println(args_num[0]);
		
		int a1, a2, a3;
		//a1 = Integer.valueOf(args[0]);
		a1 = Integer.parseInt(args[0]);
		a2 = Integer.valueOf(args[1]);
		a3 = Integer.valueOf(args[2]);
		
		total = a1+a2+a3;
		ave = total / 3;
		System.out.println("\n----평가 점수----");
		System.out.println("합계 = " + total);
		System.out.println("평균 = " + ave);
		
		System.out.println("\n----평가 결과----");
		if(a1 <= 40 || a2 <= 40 || a3<= 40) {
			System.out.println("과락입니다.");
		}
		else if(ave <= 60) {
			System.out.println("불합격입니다.");
		}
		else
			System.out.println("합격입니다.");
	}

}
