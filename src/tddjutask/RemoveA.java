package tddjutask;

public class RemoveA {
	public String rem(String s) {
		StringBuilder str = new StringBuilder(s);
		if(s.charAt(0)=='A') {
			str.deleteCharAt(0);
			if(s.charAt(1)=='A') {
				str.deleteCharAt(1);
			}
		}
		else if(s.charAt(1)=='A') {
			str.deleteCharAt(1);
		}
		return(str.toString());
	}

}
