package com.test;

/**
 * The MyBusinessException wraps all checked standard Java exception and
 * enriches them with a custom error code. You can use this code to retrieve
 * localized error messages and to link to our online documentation.
 * 
 * @author TJanssen
 */
public class MyBusinessException extends Exception {

	private static final long serialVersionUID = 360752278587090927L;

	private final ErrorCode code;

	public MyBusinessException(ErrorCode code) {
		super();
		this.code = code;
	}

	public MyBusinessException(String message, ErrorCode code) {
		super(message);
		this.code = code;
	}

	public MyBusinessException(Throwable cause, ErrorCode code) {
		super(cause);
		this.code = code;
	}

	public ErrorCode getCode() {
		return this.code;
	}

	public MyBusinessException(String message, Throwable cause, ErrorCode code) {
		super(message, cause);
		this.code = code;
	}

	public void handleExceptionInOneBlock() {
		try {
			wrapException(new String("99999999"));
		} catch (MyBusinessException e) {
			// handle exception
			// log.error(e);
			System.out.println(e);
		}
	}

	public void wrapException(String input) throws MyBusinessException {
		try {
			// do something
		} catch (NumberFormatException e) {
			throw new MyBusinessException("A message that describes the error.", e,
					ErrorCode.INVALID_PORT_CONFIGURATION);
		}
	}
	
	public static void main(String[] args) {
		try {
			throw new MyBusinessException("Invalid", ErrorCode.INVALID_CONFIGURATION);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

enum ErrorCode {
	INVALID_PORT_CONFIGURATION, INVALID_CONFIGURATION
}
