package pgm8;
abstract class Anonymous_InnerClass 
{
	 public abstract void display();
	}
public class inner3 {

	
		public static void main(String[] args)
		{
			
		Anonymous_InnerClass AIC = new Anonymous_InnerClass()
			{
		 public void display()
		 {
		 System.out.println("Anonymous Inner Class Called");
		 	}
		 };
		 AIC.display();
			}
		}
