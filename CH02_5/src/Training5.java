import java.util.Scanner;

public class Training5 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); //스캐너 객체 생성
		System.out.print("논리연산을 입력하세요>> ");
		
		boolean value1 = sc.nextBoolean(); //첫 번째 논리값 읽기
		String oprerator= sc.next(); //AND와 OR연산
		boolean value2 = sc.nextBoolean();// 두 번째 논리값 읽기
		
		boolean result = false;

		
		switch(oprerator)
		{
			case "AND":
				result=value1&&value2;
				//System.out.println(result);
				break;
				
			case "OR":
				result=value1||value2;
				//System.out.println(result);
				break;
				
			default:
				System.out.println("AND나 OR 중 하나의 연산자를 입력하세요.");
                
		}
		System.out.println(result);
		
		sc.close();
		
	}

}
