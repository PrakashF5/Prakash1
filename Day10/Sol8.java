package Day10;

public class Sol8 {
public static void main(String[] args) {
	String[] a = {"Kirsh", "Gopi", "Kannann"};
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i].toUpperCase()+" First Letter is "+a[i].charAt(0));
	}
	for(int i=a.length-1; i>=0; i--) {
		System.out.println(a[i]);
	}
}
}
