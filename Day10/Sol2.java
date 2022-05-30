package Day10;

public class Sol2 {
	public static void main(String[] args) {
		int[] num = {80,70,60,50,40,30};
		int add =0;
		int count =0;
		for(int i=num.length/2; i<num.length; i++) {
			add = add+num[i];
			count = count+1;
			System.out.println(num[i]);
		}
		System.out.println(add);
		System.out.println("Average: "+add/count);
	}

}
