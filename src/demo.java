import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số USD: ");
        int USD = scanner.nextInt();
        int VNĐ = USD*rate;

        //đổi sang dạng tiền tệ vnd
        Locale locale = new Locale("vi","VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        format.format(VNĐ);
        System.out.println( format.format(VNĐ));
        System.out.println("Bằng: "+VNĐ+" VNĐ");
    }
}
