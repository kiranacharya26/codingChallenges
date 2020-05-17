package problem5;

public class DuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "hello my name is kiran";
		System.out.println(sentence);
		
		String chars = "";
		String dups = "";
		for (int i=0; i < sentence.length();i++) {
			
			String fix = Character.toString(sentence.charAt(i));
			if(chars.contains(fix)) {
				if(dups.contains(fix)) {
					dups += fix + ",";
				}
				
			}
			chars += fix;
			
		}
		System.out.println(dups);
	}

}
