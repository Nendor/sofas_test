package packageA;

public class ClassA {
	
	public ClassA(){
		//Test
	}
	
	public void publicVoidMethod1(){
		newMethod1();
		publicBooleanMethod2();
	}
	
	public boolean publicBooleanMethod2(){
		return true;
	}
	
	public Integer publicIntegerMethod3(){
		return new Integer(0);
	}
	
	public String publicStringMethodWithParams(int i, boolean b, String s){
		return s;
	}
	
	public String publicStringMethodWithParams(boolean b, int i, String s){
		return s;
	}
	
	public void newMethod1(){
		
	}
}
