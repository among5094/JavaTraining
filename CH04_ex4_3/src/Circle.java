
public class Circle {
	
	int radius;//멤버변수
	String name;//멤버변수
	
	//매개변수가 없는 생성자
	public Circle() {
		radius=1;//초기화
		name="";
	}
	//매개변수가 2개인 생성자
	public Circle(int r, String n) {
		radius = r;
		name = n;
		//생성자는 radius와 name필드 초기화
	}
	
	public double getArea() {//멤버함수
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		//객체 이름 선언하고 Circle 객체 생성
		Circle pizza=new Circle(10,"자바피자");//매개변수가 2개인 생성자 부름
		double area=pizza.getArea();
		System.out.println(pizza.name+"의 면적은"+area);
		
		//객체 이름 donut으로 선언하고 Circle 객체 생성
		Circle donut=new Circle(); //매개변수가 없는 생성자 부름
		donut.name="자바도넛";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은"+area);
		
	}//main method
}//class닫기
