package com.masivian.lca.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masivian.lca.model.BinaryTree;
import com.masivian.lca.service.ILowestCommonAncestor;

/**
 * The Class BinaryTreeController.
 *
 * @param <E> the element type
 * @author <a href="carlos-934@hotmail.com">Carlos Jerson Angulo</a>
 * @since 25/06/2019
 */
@RestController
@RequestMapping(path = "/binaryTree")
public class BinaryTreeController {

	/** The lowest common ancestor service. */
	@Autowired
	ILowestCommonAncestor lowestCommonAncestorService;

	/**
	 * Creates the binary tree.
	 *
	 * @param binaryTreeNode the binary tree node
	 */
	@RequestMapping(method = RequestMethod.POST, path = "/createBinaryTree", consumes = "application/json", produces = "application/json")
	public @ResponseBody BinaryTree<Integer> createBinaryTree(@RequestBody BinaryTree<Integer> binaryTreeNode) {
		return lowestCommonAncestorService.createBinaryTree(binaryTreeNode);
	}

	/**
	 * Gets the lowest common ancestor.
	 *
	 * @param binaryTreeNode the binary tree node
	 * @param nodeOne        the node one
	 * @param nodeTwo        the node two
	 * @return the lowest common ancestor
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/lowestCommonAncestor", consumes = "application/json", produces = "application/json")
	public @ResponseBody Integer getLowestCommonAncestor(@RequestBody BinaryTree<Integer> binaryTreeNode,
			@RequestParam Integer nodeOne, @RequestParam Integer nodeTwo) {
		return lowestCommonAncestorService.getLowestCommonAncestor(binaryTreeNode, nodeOne, nodeTwo);

	}

}
