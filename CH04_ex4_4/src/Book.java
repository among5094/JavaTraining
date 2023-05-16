
public class Book {
	
	String title;
	String author;
	
	//매개변수가 1개인 생성자
	public Book(String t) {
		title=t;
		author="작자미상";
	}
	
	//매개변수가 2개인 생성자
	public Book(String t, String a) {
		title=t;
		author=a;
	}
	
	public static void main(String[] args) {
		
		//객체 이름 선언과 동시에 Book class생성
		Book littlePrince=new Book("어린왕자", "생텍쥐페리");//class생성과 동시에 string 선언
		Book loveStory=new Book("춘향전");
		
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
		
	}
	
}
