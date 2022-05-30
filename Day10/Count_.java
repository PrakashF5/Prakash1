package Day10;

public class Count_ {
	public static void main(String[] args) {
		int[] a = {20,40,60,80,100,120,140};
		int total =0;
		int mult = 1;
		int count = 0;
		int avg =0;
		for(int i=0; i<a.length; i++) {
			total = total+a[i];
			mult = mult*a[i];
			count = count+i;
		}
		System.out.println("Total is "+total);
		System.out.println("Multiplication is "+mult);
		System.out.println("Average is "+total/count);
	}
	

}
