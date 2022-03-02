package pgm2;

public class accessModifiers {

	public void methodPublic()
	{
		System.out.println("This is my Public Method");
	}
	
	private void methodPrivate()
	{
		System.out.println("this is my Private Method");
	}
	
	void methodDefault()
	{
		System.out.println("This is my Default Method");
	}
	protected void methodProtected()
	{
		System.out.println("This is my Protected Method");
	}
	
	//same class able to access all type of modifiers
	public static void main(String[] args) {
		accessModifiers obj=new accessModifiers();
		obj.methodPublic();
		obj.methodDefault();
		obj.methodPrivate();
		obj.methodProtected();
	}
}