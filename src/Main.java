public class Main {
	public static void main(String[] args) {
		Tree myFavoriteOakTree = new Tree( heightFt: 25, trunkDiameterInches: 5, TreeType.OAK);
		
		Tree myFavoriteMapleTree = new Tree( heightFt: 90, trunkDiameterInches: 30, TreeType.MAPLE);


		if (myFavoriteOakTree.heightFt > 100) {
			System.out.println("That's a tall " + myFavoriteOakTree.treeType + "tree!");
		}

		if (myFavoriteMapleTree.heightFt > 100) {
			System.out.println("That's a tall " + myFavoriteMapleTree.treeType + "tree!");
		}
	}

}
