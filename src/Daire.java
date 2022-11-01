import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double pi = 3.14;
        int a,r;

        Scanner inp = new Scanner(System.in);
        System.out.println("Yaricapi giriniz");
        r = inp.nextInt();
        System.out.println("Aciyi giriniz");
        a = inp.nextInt();

        double alan;

        alan = (pi*(r*r)*a) / 360;
        System.out.println("alan :" + alan);

    }
}
