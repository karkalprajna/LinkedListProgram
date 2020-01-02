package practiceProgramsv2;

public class StringAnagram {
	public static void main(String args[]){
		String string1 = "armya";
		String string2 = "maryr";
		System.out.println("String Anagram :"+checkStringAnagram(string1,string2));
	}

	private static boolean checkStringAnagram(String string1, String string2) {
		boolean stringAnagram = false;
		if(string1.equals(string2) || string1.length() != string2.length()){
			return stringAnagram;
		}
			char[] string1chr = string1.toCharArray();
			for(Character ch : string1chr){
				//stringAnagram = (string2.indexOf(ch)>=0)? true : false;
				if(string2.indexOf(ch)>=0){
					stringAnagram = true;
				}else{
					stringAnagram = false;
				}
			}			
		
		return stringAnagram;
	}
}
