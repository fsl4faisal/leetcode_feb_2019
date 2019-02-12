package leetcode_feb_2019;

public class Maximum_Depth_of_Binary_Tree {

	public int maxDepth(TreeNode root) {

		int depth = 0;
		return maxDepthUtil(root, depth);
	}

	private int maxDepthUtil(TreeNode node, int depth) {
		if (node == null)
			return depth;
		return Math.max(maxDepthUtil(node.left, depth + 1), maxDepthUtil(node.right, depth + 1));
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);

		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		System.out.println(new Maximum_Depth_of_Binary_Tree().maxDepth(root));

	}
}
