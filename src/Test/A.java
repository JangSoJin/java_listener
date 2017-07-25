package Test;

public class A {
	public A(){
		System.out.println("첫번째 A 구문");
		B temp = new B("두번째 B입니다.");
		temp.printf();
		System.out.println("세번째 A 구문");
	}
}
