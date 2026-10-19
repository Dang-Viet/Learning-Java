public interface Borrowable {
    boolean isAvailable();
    boolean borrow(String borrower);
    boolean giveBack();
}
