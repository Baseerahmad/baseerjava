package pgm8;

public class inner2 {
	private String msg="Inner Classes Exicuted";
	void display(){ 
	class Inner{ 
	void msg(){
	System.out.println(msg);
	} 
 } 
	 
	 Inner Inner=new Inner(); 
	 Inner.msg(); 
} 
	public static void main(String[] args) {
		inner2 obj=new inner2 (); 
	obj.display(); 
	}
}
