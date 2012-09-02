package net.rdrei.android.scdl2.api;

/**
 * Checked exception for any error that might occur during API transactions.
 * @author pascal
 *
 */
public class APIException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private final int code;

	public APIException() {
		super();
		
		// Indicates that an IO error or other low-level problem
		// happened.
		code = -1;
	}

	public APIException(String detailMessage, Throwable throwable, int code) {
		super(detailMessage, throwable);
		this.code = code;
	}

	public APIException(String detailMessage, int code) {
		super(detailMessage);
		this.code = code;
	}

	public APIException(Throwable throwable, int code) {
		super(throwable);
		this.code = code;
	}

	public final int getCode() {
		return code;
	}
}