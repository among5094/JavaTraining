import java.util.Scanner;

public class Training4 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); //스캐너 객체 생성
		System.out.println("점 (x,y)의 좌표를 입력하세요>> ");
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x>=50 && x<=100 && y>=50 && y<=100 )
			System.out.println("점("+x+","+y+")"+"은 (50,50)과 (100,100)의 사각형 내에 있습니다.");
		else 
			System.out.println("점("+x+","+y+")"+"은 (50,50)과 (100,100)의 사각형 내에 없습니다.");
		
		sc.close();
	}

}
