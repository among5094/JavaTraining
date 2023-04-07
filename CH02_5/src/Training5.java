import java.util.Scanner;

public class Training5 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); //스캐너 객체 생성
		System.out.print("논리연산을 입력하세요>> ");
		
		boolean value1 = sc.nextBoolean(); //첫 번째 논리값 읽기
		String oprerator= sc.next(); //AND와 OR연산
		boolean value2 = sc.nextBoolean();// 두 번째 논리값 읽기
		
		boolean result = false;
		//이 코드 있는 이유: 논리 연산의 결과를 저장하기 위한 변수를 초기화하는 코드

		switch(oprerator)
		{
			case "AND":
				result=value1&&value2;
				break;
				
			case "OR":
				result=value1||value2;
				break;
				
			default:
				System.out.println("AND나 OR 중 하나의 연산자를 입력하세요.");
                
		}
		
		System.out.println(result);//결과 출력
		
		sc.close();
		
	}

}
