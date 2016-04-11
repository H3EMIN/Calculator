package smplcalc;

public class smplCalculator {
	private int result = 0;
	
	public void add(int a, int b){
		result = a+b;
	}
	public void sub(int a, int b){
		result = a-b;
	}
	public void multi(int a, int b){
		result = a*b;
	}
	public void div(int a, int b){
		if(b!=0)
			result = a/b;
	}
	public void inc(int a){
		result += a;
	}
	public int getResult(){
		return result;
	}
	
}
