package com.epam.tddjunit;

public class CheckFirst2Chars {

	public String check(String string) {
		String str="";
		if(string.length()<=1) {
			if(string=="A") {
				str = "";
			}
			else {
				str = string;
			}
		}
		if(string.length()>1) { 
			char[] ch = string.toCharArray();
			char firstChar = ch[0];
			char secondChar = ch[1];
			if(firstChar == 'A' && secondChar == 'A') {
				firstChar = ' ';
				secondChar = ' ';
			}
			else if(firstChar == 'A') {
				firstChar = ' ';
			}
			else if(secondChar == 'A') {
				secondChar = ' ';
			}
			ch[0] = firstChar;
			ch[1] = secondChar;
			for(int i=0;i<ch.length;i++) {
				if(ch[i]!=' ') {
					str = str+ch[i];
				}
			}
		}
		return str;
	}

}
