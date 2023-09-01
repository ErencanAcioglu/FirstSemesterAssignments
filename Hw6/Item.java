


//Erencan Acıoğlu 150122056
/*
 * In this class, we have a static data field which is numberOfItems.
 * Data field id keeps the id of the Item object.
 */


public class Item {
	
	private int id;
	    
	public static int numberOfItems = 0;

	    

		public Item(int id) {
	        this.id = id;
	        numberOfItems++;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public static int getNumberOfItems() {
			return numberOfItems;
		}
		public static void setNumberOfItems(int numberOfItems) {
			Item.numberOfItems = numberOfItems;
		}
		
	    
}
