package Day10;

public class Skip {
	public static void main(String[] args) {
		int[] a = {20,40,60,80,100,120,140};
		int total = 0;
		int count = 0;
		for(int i=0; i<a.length; i=i+2) {
			total = total+a[i];
			count = count+1;
		}
	System.out.println(total);
	System.out.println(count);
	System.out.println("Average is "+total/count);
	}

}
