package com.masivian.lca.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The Class BinaryTree.
 *
 * @param <E> the element type
 * @author <a href="carlos-934@hotmail.com">Carlos Jerson Angulo</a>
 * @since 25/06/2019
 */
public class BinaryTree<E> {

	/** The value. */
	private E value;
	
	/** The left. */
	private BinaryTree<E> left;
	
	/** The right. */
	private BinaryTree<E> right;

	/**
	 * Instantiates a new binary tree.
	 *
	 * @param value the value
	 */
	@JsonCreator
	public BinaryTree(@JsonProperty("value") final E value) {
		this.value = value;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public E getValue() {
		return value;
	}

	/**
	 * Gets the left.
	 *
	 * @return the left
	 */
	public BinaryTree<E> getLeft() {
		return left;
	}

	/**
	 * Gets the right.
	 *
	 * @return the right
	 */
	public BinaryTree<E> getRight() {
		return right;
	}

}