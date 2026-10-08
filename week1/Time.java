/*import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số giây: ");
        if (!sc.hasNextLong()) {
            System.out.println("Vui lòng nhập một số nguyên.");
            return;
        }
        long totalSeconds = sc.nextLong();
        if (totalSeconds < 0) {
            System.out.println("Số giây phải lớn hơn hoặc bằng 0.");
            return;
        }
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}*/