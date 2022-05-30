package Day10;

public class Lastletter {
	public static void main(String[] args) {
		String[] words = {"Miracle", "Fantasy", "Wonder", "Beautiful"};
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i].toUpperCase()+" "+words[i].charAt(words[i].length()-2));
		}
	}

}
