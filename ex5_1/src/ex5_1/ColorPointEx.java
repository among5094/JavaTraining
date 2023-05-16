package ex5_1;

class Point{
	private int x,y; //x,y좌표다. 필드니까 접근지정자 private로 하기 
	public void set(int x,int y) { //메소드니까 접근지정자 public
		this.x=x; this.y=y;//필드의 x에 = 매개변수 x
	}
	public void showPoint() {//점의 좌표를 출력해주는 함수 
		System.out.println("("+x+","+y+")");		
	}
}

//Point를 상속받음
class ColorPoint extends Point{
	private String color; //점의 색상
	public void setColor(String color) {
		this.color=color; //필드의 color = 매개변수의 color
	}
	public void showColorPoint() {//컬러점의 좌표 출력
		System.out.print(color);
		showPoint(); //Point 클래스의 showPoint()출력
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p=new Point(); 
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp=new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint(); 
	}
}
