import java.util.Scanner;
//아스키코드 A~Z -> 65~90, a~z -> 97~122

public class CH03_Training1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 한 문자를 입력하세요>> ");
		
		String alp = sc.next();//문자열로 읽고
		char c = alp.charAt(0);
		/* charAt(0): String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해준다.
		  (0) -> 문자열에서 문자의 순서를 나타내는 것이다. 
		  String이 가리키고 있는 문자열에서 0번째에 있는 문자를 char타입으로 변환한다.*/
		
		for(int i = 'a'; i <= c; i++) // 아스키 코드 값 97이 i에 대입됨
		{
			//이 if문은 가장 앞자리를 하나 출력해주는 역할
			if(i <= c)
				System.out.print((char)i);
			
			//이 for문은 위의 if문에서 출력된 문자다음을 입력받은 문자c전까지 전부 출력해주는 for문임
			for(int j = i+1; j <= c; j++)
				System.out.print((char)j);
			
			System.out.println();
			
		}//for문 닫음
		
		sc.close();
		
		
		
	}//main method 음
	
}//class닫음
