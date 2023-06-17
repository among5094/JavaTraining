
//부모의 super클래스
class SuperObject {
	protected String name;
	public void paint() {
		draw();
	}
	
	//부모의 draw()인데 자녀클래스에서 오버라이딩 했으므로 무력화됨
	public void draw() {
		System.out.println(name);
	}
}

//자식 sub클래스(부로를 상속받고 있음)
public class SubObject extends SuperObject{
	protected String name;
	//부모의 메소드 draw()를 자녀클래스에서 오버라이딩 했으므로 앞으로 draw를 호출할때마다 자녀의 메소드가 호출됨 -> 동적바인딩
	public void draw() {
		name="Sub";
		super.name="Super";
		super.draw();
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		SuperObject b = new SubObject();//업캐스팅
		b.paint();//
	}
	
}