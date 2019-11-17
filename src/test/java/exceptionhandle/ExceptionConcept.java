package exceptionhandle;

public class ExceptionConcept {
	// int a=10;
	//  static ExceptionConcept obj;
	public static void main(String[] args) throws InterruptedException {
		//uncaught exception
		//		int i=5/0;
		//		System.out.println(i);

		//caught exception
		//Thread.sleep(3000);

		//		ExceptionConcept obj= new ExceptionConcept();
		//		obj=null;
		//		System.out.println(obj.a);

		//1. try- catch block
		//object is the super super class of throwable.
		//Throwable is the super super class of error and exception. v.v.i
		//all the exception are chield of Exception class like :-nullpointer,Arithmetic arrrayindexout and selenium
		try {
			int i=9/0;  //this code will throw an exception
		}catch(Throwable e) {   //i can write: error, exception, Throwable,ArithmeticException
			e.printStackTrace();           //god prictig to write Throwable
			System.out.println(e.getMessage());
			System.out.println("hey-- this / zero error");
		}
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
	}

}
