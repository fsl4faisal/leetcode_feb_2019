package leetcode_feb_2019;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */
class Binary_Tree_Inorder_Traversal {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		list = inOrder(root, list);
		return list;
	}

	public List<Integer> inOrder(TreeNode node, List<Integer> list) {
		if (node == null)
			return list;
		list = inOrder(node.left, list);
		list.add(node.val);
		list = inOrder(node.right, list);
		return list;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);

		System.out.println(new Binary_Tree_Inorder_Traversal().inorderTraversal(root));
	}
}