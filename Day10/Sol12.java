package Day10;

public class Sol12 {
public static void main(String[] args) {
	String[] a = {"ram", "raja", "kannan", "rockey", "kesavan", "barani"};
	for(int i=a.length-1; i>=a.length/2; i--) {
		System.out.println(a[i].toUpperCase()+" Length is "+a[i].length());
	}
}
}
