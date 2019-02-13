package com;

import com.NameFormatException;

public class NameValidation {

	public void validate(String name) throws NameFormatException {
		boolean status = false;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				status = true;
				break;
			} // if
		} // for
		if (status) {
			NameFormatException nf = new NameFormatException("Invalid Name");
			throw nf;
		} else {
			System.out.println("Ur name is Valid");
		}
	}// validate()

}// NameValidation
