import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Nhap so usd muon doi: ");
        int vnd, usd;
        usd = input.nextInt();
        vnd = usd*2300;
        System.out.println( usd+ "usd= "+vnd+" vnd");
    }
}
