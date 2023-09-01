

		//Erencan Acıoğlu 150122056
		/*
		 * Storage object represents a storage area for the factory.
		 */

public class Storage {
    private Item[] items;
    private int capacity;
    private int count;

    public Storage(int capacity) {
        this.capacity = capacity; 
        items = new Item[capacity];
        count = 0;
    }
    public void addItem(Item item) {
        if (count < capacity) {
            items[count++] = item;
        }
    }

    public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void seCount(int count) {
		this.count = count;
	}


    public int getCount() {
        return count;
    }
}
