import java.util.Scanner;

public class Training6 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int money=sc.nextInt();//돈의 액수 입력받기
		
		
		System.out.println("5만원권은" + money/50000 + "장" +
				"1만원권은" + (money/50000)/10000 + "장" +
				"5천원권은" + money/5000 + "장" +
				"천원권은" + money/1000 + "장" +
				"500원은" + money/500 + "개" +
				"100원은" + money/100 + "개");
		
		
		
		sc.close();
		
	}

}
