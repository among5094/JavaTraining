package ex6_4;

class Rect{
	private int width, height;
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	//객체의 내용물이 같은지 비교하기 위해서 Object클래스의 equals메소드를 오버라이딩해서 쓰기
	public boolean equals(Object obj) {//업캐스팅
		Rect p = (Rect)obj;//객체 obj를 Rect로 다운 캐스팅
		
		if(this.width*this.height == p.width*p.height)
			return true;
		else
			return false;
	}
}

public class RectEx {
	public static void main(String[] args) {
		
		Rect a = new Rect(2,3);
		Rect b = new Rect(2,3);
		Rect c = new Rect(4,3);
		
		
	}
}
