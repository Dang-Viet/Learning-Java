public abstract class LibraryItem implements Borrowable {
    private final String id;
    private final String title;
    private boolean borrowed;
    private String borrower;
    public LibraryItem(String id, String title) {
        if (id == null || id.isBlank() || title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title and id cannot be null or empty");
        }
        this.id = id;
        this.title = title;
    }
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public boolean isAvailable() {
        return !borrowed;
    }

    @Override
    public boolean borrow(String borrower) {
        // TODO: em tự viết
        if (this.borrowed || borrower == null || borrower.isBlank()) {
            return false;
        }
        this.borrower = borrower;
        this.borrowed = true;
        return true;
    }
    @Override
    public boolean giveBack() {
        if (!borrowed) {
            return false;
        }
        borrowed = false;
        borrower = null;
        return true;
    }
    public abstract int getLoanDays();
    public abstract double calculateLateFee(int daysLate);
    public abstract String getType();
    public void describe() {
        String status;
        if (borrowed) {
            status = "Dang muon boi " + borrower;
        } else {
            status = "Con";
        }
        System.out.println("[" + id + "] " + getType() + " - " + title
                + " | muon toi da " + getLoanDays() + " ngay | " + status);
    }
}