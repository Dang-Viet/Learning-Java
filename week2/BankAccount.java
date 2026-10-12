public class BankAccount {
    private static final int MAX_HISTORY = 20;

    private final String accountNumber;
    private String ownerName;
    private double balance;

    private final String[] history = new String[MAX_HISTORY];
    private int cnt = 0;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Số tài khoản không được rỗng");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Số dư ban đầu không được âm: " + initialBalance);
        }
        this.accountNumber = accountNumber;
        setOwnerName(ownerName);
        this.balance = initialBalance;
        addHistory("Mở tài khoản với số dư " + initialBalance);
    }

    // ===== getter / setter =====
    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName()     { return ownerName; }
    public double getBalance()       { return balance; }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Tên chủ tài khoản không được rỗng");
        }
        this.ownerName = ownerName;
    }

    // ===== BƯỚC 1: method private chỉ đổi số dư, KHÔNG ghi lịch sử =====
    private void addBalance(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Số tiền nạp phải lớn hơn 0: " + amount);
        }
        balance += amount;
    }

    private void subtractBalance(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Số tiền rút phải lớn hơn 0: " + amount);
        }
        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Số dư không đủ. Hiện có " + balance + ", cần rút " + amount);
        }
        balance -= amount;
    }

    // ===== BƯỚC 2: method public = đổi số dư + ghi lịch sử =====
    public void deposit(double amount) {
        addBalance(amount);                 // lỗi thì ném exception, dòng dưới không chạy
        addHistory("Nạp " + amount);
    }

    public void withdraw(double amount) {
        subtractBalance(amount);
        addHistory("Rút " + amount);
    }

    // ===== BƯỚC 3: transferTo tự ghi lịch sử cho cả hai bên =====
    public void transferTo(BankAccount other, double amount) {
        if (other == null) {
            throw new IllegalArgumentException("Tài khoản nhận không được null");
        }
        if (other == this) {
            throw new IllegalArgumentException("Không thể chuyển cho chính mình");
        }
        this.subtractBalance(amount);       // trừ trước: lỗi thì dừng, bên nhận chưa bị đụng
        other.addBalance(amount);

        this.addHistory("Chuyển " + amount + " cho " + other.accountNumber);
        other.addHistory("Nhận " + amount + " từ " + this.accountNumber);
    }

    // ===== lịch sử =====
    private void addHistory(String record) {
        if (cnt >= MAX_HISTORY) {
            for (int i = 1; i < MAX_HISTORY; i++) {
                history[i - 1] = history[i];
            }
            cnt = MAX_HISTORY - 1;
        }
        history[cnt] = record;
        cnt++;
    }

    public void printHistory() {
        System.out.println("Lịch sử giao dịch của " + accountNumber + ":");
        for (int i = 0; i < cnt; i++) {
            System.out.println((i + 1) + ". " + history[i]);
        }
    }

    public void show() {
        System.out.println(accountNumber + " | " + ownerName + " | số dư: " + balance);
    }
}