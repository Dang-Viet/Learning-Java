public class Library {
    private static final int CAPACITY = 10;
    private final LibraryItem[] items = new LibraryItem[CAPACITY];
    private int count = 0;

    public boolean addItem(LibraryItem item) {
        if (item == null || count == CAPACITY) {
            return false;
        }
        if (findById(item.getId()) != null) {
            return false;
        }
        items[count] = item;
        count++;
        return true;
    }

    public LibraryItem findById(String id) {
        for (int i = 0; i < count; i++) {
            if (items[i].getId().equals(id)) {
                return items[i];
            }
        }

        return null;
    }

    public boolean borrowItem(String id, String borrower) {
        LibraryItem item = findById(id);

        if (item == null) {
            return false;
        }

        return item.borrow(borrower);
    }

    public int countAvailable() {
        int available = 0;

        for (int i = 0; i < count; i++) {
            if (items[i].isAvailable()) {
                available++;
            }
        }

        return available;
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            items[i].describe();
        }
    }
}