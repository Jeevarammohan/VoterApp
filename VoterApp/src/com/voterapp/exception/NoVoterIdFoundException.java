package com.voterapp.exception;

public class NoVoterIdFoundException extends NotEligibleException {

	private static final long serialVersionUID = 1L;

	public NoVoterIdFoundException() {
		super();
	}

	public NoVoterIdFoundException(String message) {
		super(message);
	}

}