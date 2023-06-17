package ex6_7;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");//스트링 토크나이저 생성
		
		int n = st.countTokens(); //분리된 토큰 개수 
		System.out.print("토큰 개수 = "+ n );
		
		while(st.hasMoreTokens()) {//다음 토큰이 있으면 true리턴, 즉, 토큰 남아있어?라고 물어보는 거임 
			String token = st.nextToken(); //다음 토큰 리턴
			System.out.print(token); //토큰 출력
		}
	}
}
