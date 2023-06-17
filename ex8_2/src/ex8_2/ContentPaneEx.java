package ex8_2;
import javax.swing.*;
import java.awt.*; //배치관리자를 쓰기 위한 

public class ContentPaneEx extends JFrame {
	
	public ContentPaneEx() {
		super("컨텐트팬과 JFrame예제"); //super()란? super클래스의 생성자를 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //제대로된 종료 버튼
		//이전에는 프레임 윈도우를 닫는 버틴이지 프로그램을 종료시키는 버튼은 아니다. 종료되진 않고 프레임이 화면에 보이지 않게 된 것일 뿐이다. 
		//그러나 이 코드를 쓰면 프레임 윈도우가 닫힐 때, 프로그램도 함께 종료한다.
		
		Container cp = getContentPane(); //컨텐트팬 알아내기
		//JFrame객체가 처음 생길 때 컨텐트팬은 자동으로 생성된다. 프레임에 붙어 있는 컨텐트팬을 알아내기 위해서
		//컨텐트팬을 알아내기 위해서는 JFrame클래스의 getContentPane()메소드를 호출해야한다. 
		
		cp.setBackground(Color.orange); //배경색 설정
		cp.setLayout(new FlowLayout()); //setLayout(): 컨텐트팬에 FlowLayout 배치관리자 달기
		//괄호안에 new 쓰는 이유? FlowLayout()은 클래스라서 객체를 만들어줘야한다.그래서 new를 써서 객체를 만들어야함 
		
		cp.add(new JButton("냥냥"));
		cp.add(new JButton("멍뭉"));
		cp.add(new JButton("웅애"));
		cp.add(new JButton("찍찍"));
		
		setSize(500,600); //프레임 크기 300*150 설정
		setVisible(true); //화면에 프레임 출력
		
	}
	
	public static void main(String[] args) {
		new ContentPaneEx(); //객체 생성, 레퍼런스(이름)을 안 붙여줬을 뿐임
	} 
	
}
