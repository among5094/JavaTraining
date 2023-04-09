import java.util.Scanner;
import java.util.InputMismatchException;

public class CH03_Training3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>> ");
		
		try {
			
			int num=sc.nextInt();
			
			//입력받은 정수 num이 짝수인지 홀수인지 판단하는 if-else문
			if(num%2==0)
				System.out.print("짝수");
			else
				System.out.print("홀수");
			
			
		}
		catch(InputMismatchException e) {
			System.out.println("수를 입력하지않아 프로그램을 종료합니다.");
			
		}//catch문 끝
			 
		sc.close();
		
	}//main method 종료

}//class종료
