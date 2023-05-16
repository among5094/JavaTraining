//예제4-2(p.143)
import java.util.Scanner;

class Rectangle{
	int width;//멤버변수
	int height;//멤버함수
	
	public int getArea(){
		return width*height;
	}
}

public class RectApp {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Rectangle rect=new Rectangle();//객체 이름 선언과 동시에 객체 생성
		System.out.println("가로 길이와 세로 길이를 입력하세요>> ");
		
		rect.width=sc.nextInt();//입력받음으로서 초기화하기
		rect.height=sc.nextInt();
		
		System.out.println("사각형의 면적은"+rect.getArea());
		sc.close();
		
	}

}
