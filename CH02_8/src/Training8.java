import java.util.Scanner; 

//ch02강 실습문제 8번 if문 활용
public class Training8 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("커피 주문하세요>> ");
		
		String coffee=sc.next();//메뉴
		int num =sc.nextInt();//개수
		
		
		if(coffee.equals("에스프레소"))
			System.out.println(2000*num+" 원입니다. ");
		else if(coffee.equals("아메리카노"))
			System.out.println(2500*num+" 원입니다. ");
		else if(coffee.equals("카푸치노"))
			System.out.println(3000*num+" 원입니다. ");
		else if(coffee.equals("카페라떼"))
			System.out.println(3500*num+" 원입니다. ");
		else
			System.out.println("잘못입력하셨습니다.");
	
		sc.close();
	}

}
