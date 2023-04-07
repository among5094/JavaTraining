import java.util.Scanner; //스캐너를 쓰기위한 임포트문

public class Training2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); //스캐너 객체 생성
		
		System.out.println("몇 층인지 입력하시오>> ");
		int floor=sc.nextInt();
		int result= floor*5;
		System.out.println(result+" 입니다.");
		sc.close();
	}

}
