package com.masivian.lca.exception;

/**
 * The Class LCAException..
 *
 * @author <a href="carlos-934@hotmail.com">Carlos Jerson Angulo</a>
 * @since 25/06/2019
 */
public class LCAException extends RuntimeException{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new LCA exception.
	 *
	 * @param message the message
	 */
	public LCAException(String message) {
		super(message);
	}
}
