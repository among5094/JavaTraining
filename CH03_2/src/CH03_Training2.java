import java.util.Scanner;

public class CH03_Training2 {
	
	public static void main(String[] args) {
		
		//스캐너 객체
		Scanner sc = new Scanner(System.in);
		
		//배열 선언
		int number[]; //배열 이름을 number로 "선언"
		number = new int[10]; //배열을 new키워드로 "생성", 배열의 data타입은 정수형, size는 10개
		
		//역할: 정수 10개를 입력받기 위한 for문
		System.out.println("배열 10개 입력>>");
		for(int i=0; i< number.length ; i++)
		{
			number[i]=sc.nextInt();
			
			//역할: 입력받은 정수가 3의 배수인지 확인하는 if문, 맞으면 출력하기
			if(number[i]%3==0)
				System.out.print(number[i]+" ");
			
		}
		
		sc.close();
		
	}//main method 종료

}//class 종료
