package leetcode_feb_2019;

import java.util.ArrayList;
import java.util.List;

public class Flatten_Binary_Tree_to_Linked_List {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public void flatten(TreeNode root) {

		TreeNode newRoot;
		List<Integer> list = new ArrayList<>();
		list = preOrder(root, list);
		if (!list.isEmpty())
			newRoot = new TreeNode(list.get(0));
		else
			return;
		
		for (int i = 1; i < list.size(); i++) {
			TreeNode temp = new TreeNode(list.get(i));
			newRoot.right = temp;
			temp = newRoot;
		}

		System.out.println(list);
	}

	public List<Integer> preOrder(TreeNode node, List<Integer> list) {
		if (node == null)
			return list;
		list.add(node.val);
		list = preOrder(node.left, list);
		list = preOrder(node.right, list);
		return list;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.right = new TreeNode(6);
		new Flatten_Binary_Tree_to_Linked_List().flatten(root);
	}
}
