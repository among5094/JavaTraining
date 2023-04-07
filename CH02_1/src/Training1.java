import java.util.Scanner; //스캐너를 쓰기위한 임포트문

public class Training1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요>> ");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=num1+num2;
		
		System.out.println(num1+ "+" +num2+"는"+ sum);
		
		
		sc.close();
	}

}
