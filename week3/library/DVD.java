public class DVD extends LibraryItem {
    private final int minutes;

    public DVD(String id,String title, int minutes){
        super(id,title);
        this.minutes = minutes;
    }
    public int getMinutes() {
        return minutes;
    }
    @Override
    public int getLoanDays() {
        return 7;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        if (daysLate <= 0) {
            return 0;
        }
        return Math.min(daysLate * 5000, 50000);
    }
    @Override
    public String getType(){
        return "DVD";
    }
}
