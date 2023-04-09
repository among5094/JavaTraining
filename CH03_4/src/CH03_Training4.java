import java.util.Scanner;
import java.util.InputMismatchException;


public class CH03_Training4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day[]={"일", "월", "화", "수", "목", "금", "토"}; //날짜로 초기화된 문자 배열day
		
		while(true) {
			
			System.out.println("정수를 입력하세요>> ");
		
			try {
				
				int num=sc.nextInt(); //정수 입력받기
				if(num<0) {//음수가 입력되면 종료해줄 if문
					System.out.println("프로그램을 종료합니다...");
					break;
				}//if문 닫기
				System.out.println(day[num%day.length]);
			
			}//try닫기
			catch(InputMismatchException e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				sc.nextLine();//문자열을 입력받아 리턴
				
			}//catch닫기
		
			
		}//while문 닫기
		
		sc.close();//입력받은 num이 음수면 종료
		
	}//main method 닫기

}//class 닫기
