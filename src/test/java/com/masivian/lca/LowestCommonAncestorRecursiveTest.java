package com.masivian.lca;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.masivian.lca.model.BinaryTree;
import com.masivian.lca.service.impl.LowestCommonAncestorRecursive;

/**
 *  The Class LowestCommonAncestorRecursiveTest.
 *
 * @author <a href="carlos-934@hotmail.com">Carlos Jerson Angulo</a>
 * @since 25/06/2019
 */
public class LowestCommonAncestorRecursiveTest {

	/** The Constant RESULT. */
	private static final Integer RESULT = 15;
	
	/** The Constant NODE_ONE. */
	private static final Integer NODE_ONE = 10;
	
	/** The Constant NODE_TWO. */
	private static final Integer NODE_TWO = 22;
	
	
	/**
	 * Gets the lowest common ancestor success and create tree.
	 *
	 * @return the lowest common ancestor success
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Test
	public void getLowestCommonAncestorSuccess() throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		/* the binary tree 
	        9
	       / \
	      1   15
	         /
	        7
	        */
		final String jsonStr = "{\r\n" + "  \"value\": 9,\r\n" + "  \"left\": {\r\n" + "    \"value\": 1,\r\n"
				+ "    \"left\": null,\r\n" + "    \"right\": null\r\n" + "  },\r\n" + "  \"right\": {\r\n"
				+ "    \"value\": 15,\r\n" + "    \"left\": {\r\n" + "      \"value\": 7,\r\n"
				+ "      \"left\": null,\r\n" + "      \"right\": null\r\n" + "    },\r\n" + "    \"right\": null\r\n"
				+ "  }\r\n" + "}";

		final BinaryTree<Integer> intTree = objectMapper.readValue(jsonStr, new TypeReference<BinaryTree<Integer>>() {
		});
		
		final LowestCommonAncestorRecursive lowestCommonAncestorService = new LowestCommonAncestorRecursive();

		final BinaryTree<Integer> binaryTree = lowestCommonAncestorService.createBinaryTree(intTree);

		final Integer result = lowestCommonAncestorService.getLowestCommonAncestor(binaryTree, NODE_ONE, NODE_TWO);
		assertEquals(result, RESULT, 0);
	}

}
