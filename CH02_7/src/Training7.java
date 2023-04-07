import java.util.Scanner;

public class Training7 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("학점을 입력하세요>>");
		String score = sc.next();
		
		switch(score)
		{
		case "A": case "B":
			System.out.print("Excellent");
			break;
			
		case "C": case "D":
			System.out.print("Good");
			break;
			
		case "F":
			System.out.print("bye~");
			break;
		
			default:
				
				
		
		}
		
		sc.close();
	}

}
