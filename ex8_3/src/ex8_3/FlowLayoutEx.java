package ex8_3;
import javax.swing.*;
import java.awt.*; //배치관리자를 쓰기 위한 

public class FlowLayoutEx extends JFrame{
	
	public FlowLayoutEx() {
		super("FlowLayout예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container ctp= getContentPane(); //컨텐트팬 알아내기
		ctp.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		ctp.add(new JButton("add"));
		ctp.add(new JButton("sub"));
		ctp.add(new JButton("mul"));
		ctp.add(new JButton("div"));
		ctp.add(new JButton("Calaulate"));
		
		setSize(300,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx(); //객체 생성, 레퍼런스(이름)을 안 붙여줬을 뿐임
	}
}
