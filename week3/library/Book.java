public class Book extends LibraryItem{
    private final String author;
    private final int pages;

    public Book(String id,String title,String author, int pages){
        super(id,title);
        this.author = author;
        this.pages = pages;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }
    @Override
    public int getLoanDays() {
        return 14;
    }
    @Override
    public double calculateLateFee(int daysLate){
        if(daysLate == 0||daysLate<0){
            return 0;
        }
        return daysLate * 2000;
    }
    @Override
    public String getType() {
        return "Book";
    }
}
