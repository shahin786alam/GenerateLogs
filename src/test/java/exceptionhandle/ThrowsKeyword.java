package exceptionhandle;

public class ThrowsKeyword {

	public static void main(String[] args)throws ArithmeticException {
		ThrowsKeyword obj= new ThrowsKeyword();
		obj.sum();
        System.out.println("Alam");
	}
	public void sum()throws ArithmeticException {
		try {
		div();
	}catch(ArithmeticException e) {
		
	}
		
	}
	
	//throws keyword i can not hande who handle? ans: jvm will handle it.and throws exception.
	public void div()throws ArithmeticException {
		int i=9/0;  //exception line
	}

}
