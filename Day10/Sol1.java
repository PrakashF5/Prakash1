package Day10;

public class Sol1 {
public static void main(String[] args ) {
	int [] number = {91,92,93,94,95,96};
	int add = 0;
	int count = 0;
	for(int i=0; i<number.length/2; i++) {
		add = add+number[i];
		count = count+1;
		System.out.println(number[i]);
	}
	System.out.println(add);
	System.out.println(count);
	System.out.println("AVerage: "+add/count);
	
}
}
