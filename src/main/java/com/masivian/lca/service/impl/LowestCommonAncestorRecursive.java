package com.masivian.lca.service.impl;

import static java.util.Objects.isNull;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.masivian.lca.exception.LCAException;
import com.masivian.lca.model.BinaryTree;
import com.masivian.lca.service.ILowestCommonAncestor;

/**
 * The class Lowest Common Ancestor Recursive.
 *
 * @author <a href="carlos-934@hotmail.com">Carlos Jerson Angulo</a>
 * @since 25/06/2019
 */
@Service
public class LowestCommonAncestorRecursive implements ILowestCommonAncestor {

	/** The logger. */
	static Logger logger = Logger.getLogger(LowestCommonAncestorRecursive.class.getName());

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BinaryTree<Integer> createBinaryTree(final BinaryTree<Integer> binaryTreeNode) {

		logger.info("The binary tree with root " + binaryTreeNode.getValue() + " was created.");
		return binaryTreeNode;

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getLowestCommonAncestor(final BinaryTree<Integer> binaryTreeNode, final Integer nodeOne,
			final Integer nodeTwo) {
		final BinaryTree<Integer> nodeResponse = lowestCommonAncestor(binaryTreeNode, nodeOne, nodeTwo);

		if (isNull(nodeResponse)) {
			throw new LCAException("Error in calculating the LCA, one of the nodes isn't in the tree.");
		} else {
			logger.info("The Lowest Common Ancestor of binary tree " + binaryTreeNode.getValue() + " is: "
					+ nodeResponse.getValue());
			return nodeResponse.getValue();
		}

	}

	/**
	 * Recursive function for Lowest common ancestor.
	 *
	 * @param node    the node
	 * @param nodeOne the node one
	 * @param nodeTwo the node two
	 * @return the node
	 */
	private static BinaryTree<Integer> lowestCommonAncestor(final BinaryTree<Integer> node,
			final Integer nodeOne, final Integer nodeTwo) {
		if (isNull(node))
			return null;

		// Si tanto el nodo uno como el nodo dos son más pequeños que la raíz, entonces
		// LCA se encuentra en la izquierda
		if (node.getValue() > nodeOne && node.getValue() > nodeTwo)
			return lowestCommonAncestor(node.getLeft(), nodeOne, nodeTwo);

		// Si tanto el nodo uno como el nodo dos son mayores que la raíz, entonces LCA
		// se encuentra en el derecho
		if (node.getValue() < nodeOne && node.getValue() < nodeTwo)
			return lowestCommonAncestor(node.getRight(), nodeOne, nodeTwo);

		return node;
	}

}
