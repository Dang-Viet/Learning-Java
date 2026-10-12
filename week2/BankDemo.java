public class BankDemo {
    public static void main(String[] args) {
        BankAccount a=new BankAccount("001","An",1_000_000);
        BankAccount b=new BankAccount("002","Binh",500_000);
        a.deposit(200_000);
        a.withdraw(100_000);
        a.transferTo(b,300_000);
        a.show();
        b.show();
        a.printHistory();
        b.printHistory();
        /*for (int i = 1; i <= 25; i++) {
            a.deposit(1000);
        }
        a.printHistory();*/
        //a.withdraw(1_000_000);loi vi so du balance khong du de withdrawl
    }
}
