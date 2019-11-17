package exceptionhandle;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Alam Exceptiom");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//throw new Exception("Alam Exceptiom");
		
		System.out.println("BBC");
		
		String Exec_Flag=" ";
		if(Exec_Flag.equals(" ")) {
			try {
				throw new Exception("Exec flag is Blank Exception");
			}catch(Exception e){
					e.printStackTrace();
				}
			}
		
         System.out.println("program is Executed");
	
	}
}
