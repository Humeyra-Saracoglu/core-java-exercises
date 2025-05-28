import java.util.Scanner;

public class LoginOrnek {

    static boolean aktif = true;
    static int hakSayisi = 3;

    public static void main(String[] args) {
        // Kullanııcnın uygulamaya giriş yapmasını sağlayalım. 3 hakkı olsun
        // 3 hakkını doldurduğu zaman hesabını disable yaaplım.
        // eğer doğru girer ise ssteme giriş yapsın.

        Scanner scanner = new Scanner(System.in);

        if(aktif) {
            if(hakSayisi>0) {
                while (aktif) {
                    System.out.print("Kullanıcı Adınız: ");
                    String username = scanner.nextLine();

                    System.out.print("Şifreniz: ");
                    String pasword = scanner.nextLine();

                    boolean sonuc = login(username, pasword);
                    if (sonuc) {
                        System.out.println("Uygulamaya başarılı olarak giriş yaptınız :)) ");
                        break;
                    }
                    else
                    {
                        if(hakSayisi==0)
                        {
                            aktif = false; // hesabı pasif yaptım.
                            break; // döngüyü kırdım artık kullanıcı adı ve şifresi sormasın
                        }
                    }
                }
                if (aktif == false)
                {
                    System.out.println("Maalesef Hak sayınız dolmuştur. ");
                }
            } else {
            System.out.println("Hak sayınız dolmuştur, hesabınız bloke oldu. ");
            }
        } else {
            System.out.println("Hesabınız aktif değildir, yöneticiniz ile iletişime geçiniz.");
        }
    }
    public static boolean login(String username, String password) {
        // helin ---- 123
        if(username.equals("Helin") && password.equals("123")) {
            return true;  // başarılı
        } else {
            hakSayisi--;
            System.out.println("Kullanıcı adı ve şifreniz yanlıştır.");
            if(hakSayisi==0) {
                aktif= false;
            }
            return false;
        }
    }
}
