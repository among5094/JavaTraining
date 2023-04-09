import java.util.Scanner;
import java.util.Arrays;
/* https://daegwonkim.tistory.com/3 <-- 정답 제공 */

public class CH03_Training5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num[]= new int[10];//배열 레퍼런스 선언과 동시에 생성(new)
		
		//정수 10개 입력받기
		System.out.println("정수 10개 입력>> ");
		for(int i=0; i<num.length ; i++)
			num[i]=sc.nextInt();
		
		// 배열 오름차순으로 정렬
		Arrays.sort(num); 
		
		//오름차순으로 정렬된 배열 출력
		for(int i=0; i<num.length ; i++)
			System.out.print(num[i] + " ");
		
		sc.close();		
	}//main method 닫기
}//class 닫기

/* 출력할만한것 
 * 8 7 6 5 4 3 2 1 9 11
 * 17 3 9 -6 77 234 5 23 -3 1
 * */

