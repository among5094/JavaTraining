package ex8_1;
import javax.swing.*; //스윙 컴포넌트 클래스들의 경로명

//예제8-1: 300*300 크기의 스윙 프레임 만들기

public class MyFrame extends JFrame {//윈도우에 창을 띄우기 위해 JFrame 상속받음
	//생성자 MyFrame -> 스윙 응용프로그램은 main의 기능은 최소화하고 생성자에서 전부 초기화 해준다.
	public MyFrame() {
		setTitle("300*300 스윙 프레임 만들기");//프레임 타이틀 설정
		setSize(300,300);//프레임 크기 설정
		setVisible(true);//이거 없으면 만들어지기만 하고 보여지지는 않는다. default값이 false임
	}
	
	//main의 기능은 최소화해야한다. 
	//static인 이유? 객체를 생성하기 전부터 쓰고싶어서
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
