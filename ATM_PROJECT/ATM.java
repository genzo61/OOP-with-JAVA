import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){
        Login login = new Login();
        Scanner s = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz");
        System.out.println("*********************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*********************");
        int giris_hakki = 3;
        while (true){
            if (login.login(hesap)){
                System.out.println("Giriş Başarılı...");
                break;
            }
            else{
                System.out.println("Giriş Başarısız...");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkı : " + giris_hakki);
            }
            if (giris_hakki == 0){
                System.out.println("Giriş Hakkınız Bitmiştir...");
                return;
            }
        }
        System.out.println("************************************");
        String islemler = "1.Bakiye Görüntüleme \n"
                           +"2.Para yatırma \n"
                           +"3.Para Çekme\n"
                           +"4.Çıkış için q ya basınız";
        System.out.println(islemler);
        System.out.println("**************************************");

        while (true){
            System.out.println("İşlem Seçiniz...");
            String islem = s.nextLine();
            if (islem.equals("q")){
                break;
            }
            else if (islem.equals("1"))
            {
                hesap.getBakiye();
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.println("Yatırmak İstediğiniz Tutar");
                int tutar = s.nextInt();
                s.nextLine();
                hesap.parayatir(tutar);
            } else if (islem.equals("3")) {
                System.out.println("Çekmek istediğniz tutarı giriniz...");
                int tutar = s.nextInt();
                s.nextLine();
                hesap.paracek(tutar);
            }
            else
            {
                System.out.println("Geçersiz işlem");
            }
        }
    }
}
