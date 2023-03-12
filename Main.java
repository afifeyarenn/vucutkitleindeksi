import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double kg , boy , sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz : ");
        kg = inp.nextDouble();

        System.out.print("Boyunuzu giriniz : ");
        boy = inp.nextDouble();

        sonuc = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + sonuc);







    }
}