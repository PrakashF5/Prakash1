package Day10;

public class AddArrayvalues {
public static void main(String[] args) {
	int[] a = {20,40,60,80,100,120,140};
	int total = 0;
	for(int i =0; i<a.length; i++) {
		total =total+a[i];
	}
	System.out.println(total);
}
}
