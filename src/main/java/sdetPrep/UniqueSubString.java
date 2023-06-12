package sdetPrep;

public class UniqueSubString {
	
	public static void main(String args[]) {
		String s = "abcabcbb";
		
		System.out.println("Unique sub-string :"+findUniqueSubStringGeneric(s));
	}
	
	public static int findUniqueSubStringGeneric(String s) {
		int maxLength = 0;
		
		
		for(int i=0;i<s.length();i++) {
			StringBuilder currentSubString = new StringBuilder();
			for(int j=i;j<s.length();j++) {
				if(currentSubString.indexOf(String.valueOf(s.charAt(j))) != -1) {
					break;
				}
				currentSubString.append(s.charAt(j));
				if(currentSubString.length() > maxLength) {
					maxLength = currentSubString.length();
				}
			}
		}
		
		
		return maxLength;
	}

}
