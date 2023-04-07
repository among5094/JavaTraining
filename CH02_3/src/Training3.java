import java.util.Scanner; //스캐너를 쓰기위한 임포트문

public class Training3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("x값을 입력하세요>> ");
		
		int x = sc.nextInt();
		int y=(x*x)-3*x+7;
		
		System.out.println("x="+ x + " " +"y="+ y);
		
		sc.close();
	}

}
