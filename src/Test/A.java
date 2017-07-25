package Test;

public class A {
	public static void main(String[] args){
		C test = new C(){
			@Override
			public void calculator(int num_a,int num_b){
				System.out.println("더한 결과 : " + (num_a+num_b));
			}
		};
		
		B event = new B(test);
		event.printf();
	}	
}
