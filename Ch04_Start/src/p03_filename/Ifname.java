package p03_filename;

import java.io.IOException;

public class Ifname {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed =0;
		int keyCode = 0;
		while(run){
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("\n1. 증속 2. 감속 3. 중지");
				System.out.println("선택");
			}
			keyCode = System.in.read(); // 키보드 입력
			if(keyCode == 49) {
				speed++;
				System.out.println("현재속도 : " + speed);
			}
			else if(keyCode == 50) {
				speed--;
				System.out.println("현재속도 : " + speed);
			}
			else if(keyCode == 51) {
				System.out.println("끝");
				System.out.println("최종속도 : " + speed);
				break ;
			}
			
		}
	}
}
