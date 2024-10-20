import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        Scanner s = new Scanner(System.in);
        String kullanıcı_adi;
        String Parola;
        System.out.println("Kullanıcı adı :");
        kullanıcı_adi = s.nextLine();
        System.out.println("Parola : ");
        Parola = s.nextLine();
        if (hesap.getKullanıcı_adi().equals(kullanıcı_adi) && hesap.getParola().equals(Parola)){
            return true;
        }else{
            return false;
        }
    }
}
