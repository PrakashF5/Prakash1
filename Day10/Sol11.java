package Day10;

public class Sol11 {
public static void main(String[] args) {
	String[] a = {"ram", "raja", "kannan", "rockey", "kesavan", "barani"};
	for(int i=0; i<a.length/2; i++) {
		System.out.println(a[i].toUpperCase()+" Length is "+a[i].length());
	}
	for(int i=a.length/2; i<a.length; i++) {
		System.out.println(a[i].toUpperCase()+" Length is "+a[i].length());
	}
}
}
