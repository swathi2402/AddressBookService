package com.bridgelabz.addressbook;

import java.sql.SQLException;

public class AddressBookException extends SQLException {

	public enum ExceptionType {
		UNKOWN_DATABASE, SQL_EXCEPTION, NOT_EXISTS, EMPTY
	}

	public ExceptionType type;

	public AddressBookException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
