public class DriverBT 
{
	public static void main(String[] args)
	{
		//first test
		System.out.println("1st Testing Example:");
		BinaryTree<String> aTree = new BinaryTree<>();
		createTree1(aTree);
		
		System.out.println("(binaryTree) post-order: ");
		aTree.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		aTree.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + aTree.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + aTree.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + aTree.getNumberOfNodes());
		System.out.println("(BinaryNode) # nodes of tree is " + aTree.getNumberOfNodes_callBinaryNodeMethod());

		System.out.println("==========================================");
		System.out.println();
		
		System.out.println("2nd Testing Example:");
		BinaryTree<String> aTree2 = new BinaryTree<>();
		createTree2(aTree2);
		
		System.out.println("(binaryTree) post-order: ");
		aTree2.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		aTree2.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + aTree2.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + aTree2.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + aTree2.getNumberOfNodes());
		System.out.println("(BinaryNode) # nodes of tree is " + aTree2.getNumberOfNodes_callBinaryNodeMethod());
		
		System.out.println("Done.");

		System.out.println("3rd Testing Example:");
		BinaryTree<String> aTree3 = new BinaryTree<>();
		createUninitializedTree(aTree3);
		
		System.out.println("(binaryTree) post-order: ");
		aTree3.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		aTree3.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + aTree3.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + aTree3.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + aTree3.getNumberOfNodes());
		System.out.println("(BinaryNode) # nodes of tree is " + aTree3.getNumberOfNodes_callBinaryNodeMethod());
		
		System.out.println("Done.");
	}  // end main

	public static void createTree1(BinaryTree<String> tree)
	{ 
		// Leaves
		BinaryTree<String> dTree = new BinaryTree<>("D");
		BinaryTree<String> eTree = new BinaryTree<>("E");
		BinaryTree<String> gTree = new BinaryTree<>("G");

		// Subtrees:
		BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
		BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

		tree.setTree("A", bTree, cTree);
		
      	System.out.println("\nGiven Tree:\n");
      	System.out.println("     A      ");
      	System.out.println("   /   \\  ");
      	System.out.println("  B     C  ");
      	System.out.println(" / \\   /  ");
      	System.out.println("D   E  F   ");
      	System.out.println("        \\ ");
      	System.out.println("         G ");
      	System.out.println();
	} // end createTree
	
	/**-------------------------------------------------------------------- */
	/**Task 4: Create a tree case as shown in assignment 3*/
	public static void createTree2(BinaryTree<String> tree)
	{ 
		// Leaves
		BinaryTree<String> bTree = new BinaryTree<>("B");
		BinaryTree<String> gTree = new BinaryTree<>("G");
		BinaryTree<String> fTree = new BinaryTree<>("F");
		BinaryTree<String> hTree = new BinaryTree<>("H");

		// Subtrees:
		BinaryTree<String> dTree = new BinaryTree<>("D", fTree, null);
		BinaryTree<String> eTree = new BinaryTree<>("E", gTree, hTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", dTree, eTree);

		tree.setTree("A", bTree, cTree);

		System.out.println("\nGiven Tree:\n");
      	System.out.println("     A      ");
      	System.out.println("   /   \\  ");
      	System.out.println("  B     C  ");
      	System.out.println("        /  \\  ");
      	System.out.println("       D    E");
     	System.out.println("     /     /  \\ ");
      	System.out.println("    F     G    H");
      	System.out.println();

	} // end createTree2
	
	public static void createUninitializedTree(BinaryTree<String> tree)
	{ 
		tree.setTree(null, null, null);

		System.out.println("\nGiven Tree:\n");
      	System.out.println("	null	");
		System.out.println("	/	\\	");
		System.out.println(" null	 null");


<<<<<<< HEAD
	//unit test: a tree with only left node
	public static void createLeftTree(BinaryTree<String> tree)
	{
		//leaves
		BinaryTree<String> dTree = new BinaryTree<>("D");

		//Subtrees
		BinaryTree<String> cTree = new BinaryTree<>("C", dTree, null);
		BinaryTree<String> bTree = new BinaryTree<>("B", cTree, null);

		tree.setTree("A", bTree, null);
	}//end createLeftTree

	//unit test: a tree with only right node
	public static void createRightTree(BinaryTree<String> tree)
	{
		//leaves
		BinaryTree<String> dTree = new BinaryTree<>("D");
	
		//Subtrees
		BinaryTree<String> cTree = new BinaryTree<>("C", null, dTree);
		BinaryTree<String> bTree = new BinaryTree<>("B", null, cTree);
	
		tree.setTree("A", null, bTree);
	}//end createRightTree
	
	//unit test: tree with 3 nodes
	public static void create3NodeTree(BinaryTree<String> tree)
	{
		//leaves
		BinaryTree<String> bTree = new BinaryTree<>("B");
		BinaryTree<String> cTree = new BinaryTree<>("C");

		tree.setTree("A", bTree, cTree);
	}//end create3NodeTree
=======
	} // end createUninitializedTree
	
	public static void createEmptyTree(BinaryTree<String> tree)
	{
		tree.clear();
		
		System.out.println("\nGiven Tree:\n");
		System.out.println();
	}//end createEmptyTree
	
	public static void createRootOnly(BinaryTree<String> tree)
	{
		BinaryNode<String> root = new BinaryNode<String>();
		root.setData("A");
		tree.setRootNode(root);
	}//end createRootOnly
>>>>>>> 1035c21303ba1cf3b688e333e6c9eeda048a62ff

}  // end DriverBT
