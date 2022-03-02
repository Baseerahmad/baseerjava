package pgm12;

public class threadcreation extends Thread{
				public void run()
			{
			 System.out.println("concurrent thread started running..");
			}
			public static void main( String args[] )
			{
				threadcreation thread = new threadcreation();
			 thread.start();
		    }
		}