package Test;

public class B {
	private C callback;
	public B(C callback){
		this.callback = callback;
	}
	public void printf(){
		int num_1 = 4, num_2 = 5;
		callback.calculator(num_1, num_2);
	}
}
