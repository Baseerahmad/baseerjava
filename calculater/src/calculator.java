import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		int n1,n2,ch,cal;
		System.out.println("Enter two Number ");
		Scanner r=new Scanner(System.in);
		n1=r.nextInt();
		n2=r.nextInt();
		System.out.println("Select Opereation ");
		ch=r.nextInt();
		
		if(ch==1)
		{
			cal=n1+n2;
			System.out.print("Assition"+cal);
		}
		else if (ch==2)
		{
			cal=n1-n2;
			System.out.print("Subtrasction"+cal);
		}
		else if (ch==3)
		{
			cal=n1*n2;
			System.out.print("Multiplication"+cal);
		}
		else if (ch==4)
		{
		cal=n1/n2;
		System.out.print("Division"+cal);
		}
		else
		{
			cal=n1%n2;
			System.out.print("Remainder"+cal);
		}
		
		}
	
	}


