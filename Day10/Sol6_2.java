package Day10;

public class Sol6_2 {
	public static void main(String[] args) {
		String[] sports= {"Basetball", "Volleyball","Cricket","Badminton","Tennis","Chess"};
		for(int i=sports.length-1; i>=sports.length/2; i--) {
			System.out.println(sports[i].toUpperCase());
		}
		for(int i=sports.length/2; i<sports.length; i++) {
			System.out.println(sports[i].toUpperCase());
		}
	}

}
