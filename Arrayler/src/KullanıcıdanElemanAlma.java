import java.util.Scanner;

public class KullanıcıdanElemanAlma {
    public static void main(String[] args) {
        // Dizinin elemanlarını kullanıcıdan alma

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olsun : ");
        int diziUzunluk = scanner.nextInt();
        scanner.nextLine();

        String[] isimler = new String[diziUzunluk];

        for (int i=0; i<isimler.length; i++)
        {
            System.out.print("Dizinin " + (i) + ". index değerini giriniz:  ");
            isimler[i] = scanner.nextLine();
        }
        System.out.println("*********  DİZİNİN ELEMANLARI  ****************");
        for(int i=0; i<isimler.length; i++)
        {
            System.out.println(isimler[i]);
        }
    }
}
