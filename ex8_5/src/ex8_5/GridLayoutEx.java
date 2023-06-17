package ex8_5;
import javax.swing.*;
import java.awt.*; //배치관리자를 쓰기 위한 

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		
		super("GridLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container ctp= getContentPane(); //컨텐트팬 알아내기
		
		//컨텐트팬에 GridLayout 배치관리자 설정, 1행, 10열의 그리드 레이아웃 배치
		ctp.setLayout(new GridLayout(1,10));
		
		for(int i=0; i<10; i++)
		{
			String text = Integer.toString(i); //i라는 정수를 문자열로 바꿈. 
			JButton button = new JButton(text); //버튼 컴포넌트 생성
			ctp.add(button); //컨텐트 팬에 버튼 부차
		}
		
		setSize(300,400);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
