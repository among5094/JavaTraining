//예제4-1(p.140)
//객체를 생성하는 방법 1. 객체에 대한 레퍼런스 변수 선언 2. 멤버 변수 선언

public class Circle {
	int radius; //멤버 변수 선언
	String name; //멤버 변수 선언
	
	public double getArea() {//멤버 메소드
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		
		Circle pizza; //객체에 대한 이름(레퍼런스) 변수 pizza선언
		pizza=new Circle(); //Circle객체 생성
		pizza.radius=10;
		pizza.name="객체1";
		double area=pizza.getArea();//
		System.out.println("pizza.radius"+pizza.radius+"  "+"pizza.name"+pizza.name);
		
		Circle donut=new Circle();//객체에 대한 이름 생성 후 Circle() 객체 생성
		donut.radius=2;
		donut.name="객체2";
		area=donut.getArea();
		System.out.println("donut.radius"+donut.radius+"  "+"donut.name"+donut.name);
		
		
		
	}
}
