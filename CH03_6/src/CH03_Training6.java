import java.util.Scanner;
import java.lang.NullPointerExcption;

public class CH03_Training6 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String eng[]= {"Student", "Love", "java", "happy", "future"};
		String kor[]= {"학생", "사랑", "자바", "행복한", "미래"};
		
		String ex= new String("exit");		
		
		while(true) {
			
			//exit가 입력되면 종료
			if(ex.equals(s))
				break;
			
			try {
				
				System.out.println("영어 단어를 입력하세요>> ");
				String s=sc.nextLine(); //입력받을 변수 s
			}
			catch(NullPointerExcption e) { //null레퍼런스를 참조할 때 발생
				
				System.out.println("그런 영어단어는 없습니다.");
			}
			
		
		}
		
		sc.close();
		
	}//main method종료
}//class종료
