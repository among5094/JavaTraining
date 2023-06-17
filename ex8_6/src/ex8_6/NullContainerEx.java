package ex8_6;

import javax.swing.*;
import java.awt.*; //배치관리자를 쓰기 위한 

public class NullContainerEx extends JFrame{

	public NullContainerEx(){
		
		super("냥냥");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container ctp= getContentPane(); //컨텐트팬 알아내기
		ctp.setLayout(null); //컨텐트 팬의 배치관리자 제거
		
		//JLabel 컴포넌트를 새성하고 직접 위치와 크기를 지정한다. 
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130,50); //la를 왼쪽 상단 모서리 기준 좌표 (130, 50) "위치"로 지정
		la.setSize(200, 20); //la를 컨텐트팬에 부착 문자 길이 자체가 가로 200 세로 20임
		ctp.add(la);
		
		for(int i=0; i<9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50,20);
			ctp.add(b);
			
		}
		
		setSize(300,400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new NullContainerEx();
	}

}
