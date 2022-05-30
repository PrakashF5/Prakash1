package Day10;

public class Strlength {
public static void main(String[] args) {
	String[] words= {"Miracle", "Fantasy","Wonder", "Beautiful", "Amazing"};
	for(int i=0; i<words.length; i++) {
		System.out.println(words[i].length());
	}
	for(int i=0; i<words.length; i++) {
		System.out.println(words[i].toUpperCase()+" "+words[i].length());
	}
	for(int i=0; i<words.length; i =i+2) {
		System.out.println(words[i].toUpperCase());

	}
}
}