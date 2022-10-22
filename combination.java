import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        int n, r, fark, totaln = 1, totalr = 1, totalfark = 1, combination;
        boolean isError = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("kombinasyonun ilk bileşenini giriniz: ");
        n = scan.nextInt();
        System.out.print("kombinasyonun ikinci bileşenini giriniz: ");
        r = scan.nextInt();
        if (n <= r) {
            isError = true;
        }
        if (isError) {
            System.out.print("Hatalı giriş!!!");
        } else {
            fark = n - r;
            for (int i = 1; i <= n; i++) {
                totaln = totaln * i;
            }
            for (int j = 1; j <= r; j++) {
                totalr = totalr * j;
            }
            for (int k = 1; k <= fark; k++) {
                totalfark = fark * k;
            }
            combination = totaln / (totalr * totalfark);
            System.out.print("C(" + n + "," + r + ")=" + combination);
        }
    }
}
