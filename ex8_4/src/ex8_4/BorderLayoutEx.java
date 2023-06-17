package ex8_4;
import javax.swing.*;
import java.awt.*; //배치관리자를 쓰기 위한 


public class BorderLayoutEx extends JFrame {
	
	public BorderLayoutEx() {
		super("BorderLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container ctp= getContentPane(); //컨텐트팬 알아내기
		
		//컨텐트팬에 BorderLayout 배치관리자 설정
		ctp.setLayout(new BorderLayout(30,20));
		
		ctp.add(new JButton("계산"), BorderLayout.CENTER);
		ctp.add(new JButton("계산22"), BorderLayout.CENTER);
		
		ctp.add(new JButton("덧셈"), BorderLayout.NORTH);
		ctp.add(new JButton("뺄셈"), BorderLayout.SOUTH);
		ctp.add(new JButton("곱셈"), BorderLayout.EAST);
		ctp.add(new JButton("나눗셈"), BorderLayout.WEST);
		
		setSize(300,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx(); //객체 생성
	}

}
