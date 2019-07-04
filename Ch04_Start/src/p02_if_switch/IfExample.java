package p02_if_switch;

public class IfExample {
//주사위 설계
	public static void main(String[] args) {
		//Random은 double 타입이다. 
		//random(): 0.0 <= r < 1.0 // 0.0 ~ 0.99999.. 리턴됨.
		int num = 1;
		int count = 0;
		while(num != 6){

			double d = Math.random()*6 + 1; //0.0 ~ 5.6 -> 1을 더하면 1.0 ~ 6.6 이므로 정수로 변환하면 1~6 사이의 숫자가 나온다.
			num = (int) d ;
			
			IfExample be = new IfExample();
			be.Choice(num);
			
			//System.out.println(d);
			//System.out.println(num);
			
			count ++;
		}			
		System.out.println();
		System.out.println(count + "번 만에 6이 나왔습니다.");

		
	}
	
	public int Choice(int value) {
		
		if(value == 1)
			System.out.println("1");
		else if(value == 2)
			System.out.println("2");
		else if(value == 3)
			System.out.println("3");
		else if(value == 4)
			System.out.println("4");
		else if(value == 5)
			System.out.println("5");
		else
			System.out.println("6");
		
		return 0;
	}

}
