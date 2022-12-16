import java.util.Scanner;

public class Bai4 {
    public static void main (String [] args){
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 số nguyên dương: ");
        n = scanner.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        if (n>=2){
            System.out.println(2);
        }
        for (int i = 3; i < n; i+=2){
            if (isPrimen(i)){
                System.out.println(" " + i);
            }
        }
    }
    public static boolean isPrimen(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
