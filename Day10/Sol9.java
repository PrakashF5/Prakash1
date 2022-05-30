package Day10;

public class Sol9 {
	public static void main(String[] args) {
		int[] num = {15,10,25,45,55};
		int total = 0;
		int count = 0;
		for(int i=0; i<num.length; i++) {
			total = total + num[i];
			count = count + 1;
		}
		System.out.println("Average: "+total/count);
	}

}
