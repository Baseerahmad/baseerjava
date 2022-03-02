package pgm8;

public class innerclass1 {

	private String message="Hi Afzal"; 
	class Inner{ 
		String message2 = "how are u ";
	 void hello(){System.out.println(message+ " "+message2+", Let us start learning Inner Classes...");} 
	} 
	
	public static void main(String[] args) {
		innerclass1 obj=new innerclass1();
		innerclass1.Inner in=obj.new Inner();
	    in.hello(); 
	}
}
