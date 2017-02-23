class FindString{
	void show(){
		String Text="My Name";
		Text.substring(2);//The substring() method extracts the characters from a string
		System.out.println("Substring is "+Text.substring(2));
	}
}

public class StringExample {

	public static void main(String[] args) {
		FindString fs = new FindString();
		fs.show();
	}

}
