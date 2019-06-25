package com.masivian.lca.service;

import com.masivian.lca.model.BinaryTree;

/**
 * The Interface ILowestCommonAncestor.
 *
 * @param <E> the element type
 * @author <a href="carlos-934@hotmail.com">Carlos Jerson Angulo</a>
 * @since 25/06/2019
 */
public interface ILowestCommonAncestor {

	/**
	 * Creates the binary tree.
	 *
	 * @param BinaryTreeNode the binary tree node
	 * @return the binary tree
	 */
	public BinaryTree<Integer> createBinaryTree(BinaryTree<Integer> BinaryTreeNode);

	/**
	 * Gets the lowest common ancestor.
	 *
	 * @param BinaryTreeNode the binary tree node
	 * @param nodeOne        the node one
	 * @param nodeTwo        the node two
	 * @return the lowest common ancestor
	 */
	public Integer getLowestCommonAncestor(BinaryTree<Integer> BinaryTreeNode, Integer nodeOne, Integer nodeTwo);

}
