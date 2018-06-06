package com.test;

public class MyUncheckedBusinessException extends RuntimeException {

	private static final long serialVersionUID = -583675113747675770L;

	private final ErrorCode code;

	public MyUncheckedBusinessException(ErrorCode code) {
		super();
		this.code = code;
	}

	public MyUncheckedBusinessException(String message, Throwable cause, ErrorCode code) {
		super(message, cause);
		this.code = code;
	}

	public MyUncheckedBusinessException(String message, ErrorCode code) {
		super(message);
		this.code = code;
	}

	public MyUncheckedBusinessException(Throwable cause, ErrorCode code) {
		super(cause);
		this.code = code;
	}

	public ErrorCode getCode() {
		return this.code;
	}

	private void wrapException(String input) {
		try {
			// do something
		} catch (NumberFormatException e) {
			throw new MyUncheckedBusinessException("A message that describes the error.", e,
					ErrorCode.INVALID_PORT_CONFIGURATION);
		}
	}
	
	public void handleExceptionInOneBlock() {
		try {
			wrapException(new String("99999999"));
		} catch (MyUncheckedBusinessException e) {
			// handle exception
			// log.error(e);
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		try {
			throw new MyUncheckedBusinessException("Invalid", ErrorCode.INVALID_CONFIGURATION);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
