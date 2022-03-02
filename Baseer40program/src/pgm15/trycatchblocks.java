package pgm15;

public class trycatchblocks {
	 public static void main(String args[]) {
		 int[] array = new int[3];
	try {
		 array[9] = 19;
		 }catch (ArrayIndexOutOfBoundsException e){
			 System.out.println("Array index is out of bounds!"); 
		 }finally{
			 System.out.println("The array is of size " + array.length);
		 	}
	 	}
	}

