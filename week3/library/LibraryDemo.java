public class LibraryDemo {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addItem(new Book("B01", "Clean Code", "Robert Martin", 464));
        lib.addItem(new Book("B02", "Effective Java", "Joshua Bloch", 416));
        lib.addItem(new DVD("D01", "Inception", 148));

        lib.printAll();

        System.out.println(lib.borrowItem("B01", "An"));      // true
        System.out.println(lib.borrowItem("B01", "Binh"));    // false: đã có người mượn
        System.out.println(lib.borrowItem("X99", "An"));      // false: không tồn tại
        System.out.println("Con lai: " + lib.countAvailable());   // 2

        lib.printAll();

        System.out.println(lib.findById("D01").calculateLateFee(4));      // 20000.0
        System.out.println(lib.findById("D01").calculateLateFee(20));     // 50000.0
        System.out.println(lib.findById("B01").calculateLateFee(3));      // 6000.0
        System.out.println(lib.findById("B01").calculateLateFee(-2));     // 0.0
    }
}