public class DriverBT 
{
	public static void main(String[] args)
	{
		//1st Tree
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
		//2nd Tree
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
		//Root Only Tree
		System.out.println("Root only Tree:");
		BinaryTree<String> rootOnlyTree = new BinaryTree<>();
		createRootOnly(rootOnlyTree);
		
		System.out.println("(binaryTree) post-order: ");
		rootOnlyTree.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		rootOnlyTree.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + rootOnlyTree.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + rootOnlyTree.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + rootOnlyTree.getNumberOfNodes());
		System.out.println("(BinaryNode) # nodes of tree is " + rootOnlyTree.getNumberOfNodes_callBinaryNodeMethod());
		
		System.out.println("Done.");
		//Left Only Tree
		System.out.println("Left nodes only:");
		BinaryTree<String> createLeftTree = new BinaryTree<>();
		createLeftTree(createLeftTree);
		
		System.out.println("(binaryTree) post-order: ");
		createLeftTree.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		createLeftTree.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + createLeftTree.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + createLeftTree.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + createLeftTree.getNumberOfNodes());
		System.out.println("(BinaryNode) # nodes of tree is " + createLeftTree.getNumberOfNodes_callBinaryNodeMethod());
		
		System.out.println("Done.");
		//Right Only Tree
		System.out.println("Right nodes only:");
		BinaryTree<String> createRightTree = new BinaryTree<>();
		createRightTree(createRightTree);
		
		System.out.println("(binaryTree) post-order: ");
		createRightTree.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		createRightTree.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + createRightTree.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + createRightTree.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + createRightTree.getNumberOfNodes());
		System.out.println("(BinaryNode) # nodes of tree is " + createRightTree.getNumberOfNodes_callBinaryNodeMethod());
		
		System.out.println("Done.");
		//3 Nodes Only Tree
		System.out.println("3 nodes only:");
		BinaryTree<String> threeNodesTree = new BinaryTree<>();
		createUninitializedTree(threeNodesTree);
		
		System.out.println("(binaryTree) post-order: ");
		threeNodesTree.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		threeNodesTree.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + threeNodesTree.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + threeNodesTree.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + threeNodesTree.getNumberOfNodes());
		System.out.println("(BinaryNode) # nodes of tree is " + threeNodesTree.getNumberOfNodes_callBinaryNodeMethod());
		
		System.out.println("Done.");
		/*//Uninitialized Tree
		System.out.println("Uninitialized Tree:");
		BinaryTree<String> uninitializedTree = new BinaryTree<>();
		createEmptyTree(uninitializedTree);
		
		System.out.println("(binaryTree) post-order: ");
		uninitializedTree.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		uninitializedTree.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + uninitializedTree.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + uninitializedTree.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + uninitializedTree.getNumberOfNodes());
		System.out.println("(BinaryNode) # nodes of tree is " + uninitializedTree.getNumberOfNodes_callBinaryNodeMethod());
		
		System.out.println("Done.");
		//Empty Tree
		System.out.println("Empty Tree:");
		BinaryTree<String> emptyTree = new BinaryTree<>();
		createEmptyTree(emptyTree);
		
		System.out.println("(binaryTree) post-order: ");
		emptyTree.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		emptyTree.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + emptyTree.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + emptyTree.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + emptyTree.getNumberOfNodes());
		System.out.println("(BinaryNode) # nodes of tree is " + emptyTree.getNumberOfNodes_callBinaryNodeMethod());
		
		System.out.println("Done.");*/
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

	}
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

}  // end DriverBT
